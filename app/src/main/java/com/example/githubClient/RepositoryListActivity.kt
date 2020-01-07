package com.example.githubClient

import android.app.Activity
import android.content.res.Configuration
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.githubClient.adapter.GHRepositoryAdapter
import com.example.githubClient.model.Repo
import com.example.githubClient.model.User
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.activity_repository_list.*

class RepositoryListActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    lateinit var repositories: ArrayList<Repo>
    var checkedItem = 0

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(RepositoryListActivityViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_repository_list)

        val actionBar = actionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        initLiveDataObservers()

        repositories = intent.extras?.getParcelableArrayList<Repo>("dataset") ?: ArrayList(0)
        val userInfo: User? = intent.extras?.getParcelable("user")
        userInfo?.also {
            setProfileData(it)
        }

        if (isDarkTheme(this)) {
            Log.e("gerin", "dark mode")
            repositoryRecyclerView.setBackgroundColor(Color.BLACK)
            repositoryDrawerTitle.background = getDrawable(R.drawable.bottom_sheet_background_dark)
            setupRecyclerView(true)
        } else {
            Log.e("gerin", "light mode")
            repositoryRecyclerView.setBackgroundColor(resources.getColor(R.color.background))
            repositoryDrawerTitle.background = getDrawable(R.drawable.bottom_sheet_background)
            setupRecyclerView(false)
        }

    }

    fun isDarkTheme(activity: Activity): Boolean {
        return activity.resources.configuration.uiMode and
                Configuration.UI_MODE_NIGHT_MASK == Configuration.UI_MODE_NIGHT_YES
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.repository_list_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId) {
            R.id.repoListMenuFilter -> {
                val options = arrayOf<CharSequence>("Alphabetical", "Starred", "Forked")
                val alertDialogBuilder = MaterialAlertDialogBuilder(this)
                alertDialogBuilder.setTitle("Sort By")
                    .setSingleChoiceItems(options,checkedItem) { dialog, item ->
                        when(item) {
                            0 -> {
                                Log.e("gerin", "position $item")
                                viewModel.sortRepos(RepositoryListActivityViewModel.SortBy.ALPHABETICAL)
                            }
                            1 -> {
                                Log.e("gerin", "position $item")
                                viewModel.sortRepos(RepositoryListActivityViewModel.SortBy.STARRED)
                            }
                            2 -> {
                                Log.e("gerin", "position $item")
                                viewModel.sortRepos(RepositoryListActivityViewModel.SortBy.FORKED)
                            }
                        }
                    }
                    .setNegativeButton("Cancel") { dialog, id -> dialog?.cancel() }
                alertDialogBuilder.create().show()
                true
            }
            android.R.id.home -> {
                onNavigateUp()
                true
            }
            else-> {
                true
            }
        }
    }

    private fun initLiveDataObservers() {
        viewModel.sortedReposLiveData.observe(this, Observer<RepositoryListActivityViewModel.SortBy> {sortMethod ->
            when(sortMethod) {
                RepositoryListActivityViewModel.SortBy.ALPHABETICAL -> {
                    Log.e("gerin", "ALPHABETICAL")
                    checkedItem = 0
                    val tempList = ArrayList(repositories.sortedWith(compareBy {it.name}))
                    repositories.clear()
                    repositories.addAll(tempList)
                    viewAdapter.notifyDataSetChanged()
                }
                RepositoryListActivityViewModel.SortBy.STARRED -> {
                    Log.e("gerin", "STARRED")
                    checkedItem = 1
                    val tempList =  ArrayList(repositories.sortedWith(compareByDescending {it.stargazersCount}))
                    repositories.clear()
                    repositories.addAll(tempList)
                    viewAdapter.notifyDataSetChanged()
                }
                RepositoryListActivityViewModel.SortBy.FORKED -> {
                    Log.e("gerin", "FORKED")
                    checkedItem = 2
                    val tempList = ArrayList(repositories.sortedWith(compareByDescending {it.forksCount}))
                    repositories.clear()
                    repositories.addAll(tempList)
                    viewAdapter.notifyDataSetChanged()
                }
                else -> {
                    Log.e("gerin", "else")
                }
            }
        })
    }

    private fun setupRecyclerView(darkMode: Boolean) {
        Log.e("gerin", "setup recycler view")
        viewManager = GridLayoutManager(this, 1)
        viewAdapter = GHRepositoryAdapter(repositories, darkMode, applicationContext)

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
