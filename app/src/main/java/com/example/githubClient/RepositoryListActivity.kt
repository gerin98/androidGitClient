package com.example.githubClient

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.githubClient.adapter.GHRepositoryAdapter
import com.example.githubClient.model.Repo
import com.example.githubClient.model.User
import kotlinx.android.synthetic.main.activity_repository_list.*

class RepositoryListActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repository_list)

        val actionBar = actionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val repositories: ArrayList<Repo>? = intent.extras?.getParcelableArrayList<Repo>("dataset") ?: ArrayList(0)
        val userInfo: User? = intent.extras?.getParcelable("user")
        userInfo?.also {
            setProfileData(it)
        }
        setupRecyclerView(repositories)
    }

    private fun setupRecyclerView(repositories: ArrayList<Repo>?) {
        viewManager = GridLayoutManager(this, 1)
        viewAdapter = GHRepositoryAdapter(repositories)

        recyclerView = repositoryRecyclerView.apply {
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    private fun setProfileData(userInfo: User) {
        // set title
        title = userInfo.login

        // set avatar
        GlideApp.with(this)
            .load(userInfo.avatarUrl)
            .into(repoListAvatarImage)

        // set bio
        if (userInfo.name.isNullOrBlank()) {
            repoListUserName.visibility = View.GONE
        } else {
            repoListUserName.text = userInfo.name
        }

        if (userInfo.company.isNullOrBlank()) {
            repoListCompanyLayout.visibility = View.GONE
        } else {
            repoListUserCompany.text = userInfo.company
        }

        if (userInfo.location.isNullOrBlank()) {
            repoListLocationLayout.visibility = View.GONE
        } else {
            repoListUserLocation.text = userInfo.location        }

    }
}
