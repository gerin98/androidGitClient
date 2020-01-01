package com.example.githubClient

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RepositoryListActivityViewModel : ViewModel() {

    enum class SortBy {
        ALPHABETICAL,
        STARRED,
        FORKED
    }

    val sortedReposLiveData = MutableLiveData<SortBy>()

    fun sortRepos(sortMethod: SortBy) {
        sortedReposLiveData.value = sortMethod
    }

}