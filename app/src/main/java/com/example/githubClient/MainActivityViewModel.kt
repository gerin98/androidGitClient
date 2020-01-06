package com.example.githubClient

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubClient.arch.ExplicitLiveData
import com.example.githubClient.arch.LiveDataWrapper
import com.example.githubClient.arch.ResourceStatus
import com.example.githubClient.model.Repo
import com.example.githubClient.model.User
import com.example.githubClient.service.GitHubService
import com.example.githubClient.service.GithubApi
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.ResourceObserver
import io.reactivex.schedulers.Schedulers

class MainActivityViewModel: ViewModel() {

    companion object {
        private val TAG = MainActivityViewModel::class.java.simpleName
    }

    private val compositeDisposable : CompositeDisposable by lazy { CompositeDisposable() }

    // databinding livedata
    val userName = MutableLiveData<String?>("")

    // network response livedata
    private val _userModel = MutableLiveData<User?>(null)
    val userModel: LiveData<User?>
        get() = _userModel
    private val _repoModel = MutableLiveData<ArrayList<Repo>?>(null)
    val repoModel: LiveData<ArrayList<Repo>?>
        get() = _repoModel
    private val _errorState = ExplicitLiveData<Boolean>()
    val errorState: LiveData<Boolean>
        get() = _errorState

    val dataStatus = MediatorLiveData<LiveDataWrapper<Unit, Exception>>().apply {
        addSource(_userModel) {
            value = wasDataFetchSuccessful()
        }
        addSource(_repoModel) {
            value = wasDataFetchSuccessful()
        }
        addSource(_errorState){
            value = wasDataFetchSuccessful()
        }
    }

    val valid = MediatorLiveData<Boolean>().apply {
        addSource(userName) {
            value = checkFields()
        }
    }

    override fun onCleared() {
        compositeDisposable.dispose()
        super.onCleared()
    }

    private fun wasDataFetchSuccessful() : LiveDataWrapper<Unit, Exception> {
        return if (_errorState.value == true) {
            Log.e(TAG, "LDW error")
            LiveDataWrapper(ResourceStatus.ERROR, null, null)
        }
        else if (_userModel.value != null && _repoModel.value != null) {
            Log.e(TAG, "LDW success")
            LiveDataWrapper(ResourceStatus.SUCCESS, null, null)
        } else {
            Log.e(TAG, "LDW loading")
            LiveDataWrapper(ResourceStatus.LOADING, null, null)
        }
    }

    private fun checkFields(): Boolean {
        return !userName.value.isNullOrBlank()
    }

    private fun fetchRepos(usernameInput: String): Observable<ArrayList<Repo>> {
        val service = GithubApi.getRetrofitInstance().create(GitHubService::class.java)
        return service.listRepos(usernameInput)
    }

    private fun fetchUserInfo(usernameInput: String): Observable<User> {
        val service = GithubApi.getRetrofitInstance().create(GitHubService::class.java)
        return service.getUser(usernameInput)
    }

     fun fetchUserRepos(username: String) {
        val rs = object: ResourceObserver<Any>() {
            override fun onComplete() {
                //do nothing
            }

            // there should only be 2 results. 1 for /users and 1 for /repos
            override fun onNext(result: Any) {
                when (result) {
                    is User -> _userModel.value = result
                    is ArrayList<*> -> _repoModel.value = result as? ArrayList<Repo>
                    else -> Log.e(TAG, "error")
                }
            }

            override fun onError(e: Throwable) {
                _errorState.value = true
            }
        }
        val disposable = Observable.concat(
            fetchUserInfo(username).subscribeOn(Schedulers.io()),
            fetchRepos(username).subscribeOn(Schedulers.io()))
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(rs)
        compositeDisposable.add(disposable)
    }

    fun clearNetworkResponse() {
        _userModel.value = null
        _repoModel.value = null
    }
}