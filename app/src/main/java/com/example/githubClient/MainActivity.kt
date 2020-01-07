package com.example.githubClient

import android.app.Activity
import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.githubClient.arch.ResourceStatus
import com.example.githubClient.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }

    private val viewModel by lazy {
        ViewModelProvider(this, MainActivityViewModelFactory()).get(MainActivityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (isDarkTheme(this)) {
            viewModel.darkMode.postValue(R.drawable.github_logo_white)
        } else {
            viewModel.darkMode.postValue(R.drawable.github_logo_dark)
        }

        // setup databinding
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.mainActivityViewModel = viewModel

        initLiveDataObservers()

        repo_button.setOnClickListener {
                progressBar.visibility = VISIBLE
                viewModel.fetchUserRepos(usernameTextInputEditText.text.toString())
        }

    }

    override fun onPause() {
        progressBar.visibility = INVISIBLE
        super.onPause()
    }

    fun isDarkTheme(activity: Activity): Boolean {
        return activity.resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
    }

    private fun initLiveDataObservers() {
        viewModel.dataStatus.observe(this, Observer {
            when(it.status) {
                ResourceStatus.SUCCESS -> {
                    val intent = Intent(applicationContext, RepositoryListActivity::class.java)
                    val bundle = Bundle()
                    bundle.putParcelable("user", viewModel.userModel.value)
                    bundle.putParcelableArrayList("dataset", viewModel.repoModel.value)
                    intent.putExtras(bundle)
                    viewModel.clearNetworkResponse()
                    startActivity(intent)
                }
                ResourceStatus.LOADING -> {
                    //do nothing
                }
                ResourceStatus.ERROR -> {
                    progressBar.visibility = INVISIBLE
                    Toast.makeText(applicationContext, "An error occurred, please try again later", Toast.LENGTH_LONG).show()
                }
            }
        })
    }

}
