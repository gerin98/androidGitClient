package com.example.githubClient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\fH\u0002J$\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012` 0\u001f2\u0006\u0010!\u001a\u00020\u0019J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160\u001f2\u0006\u0010!\u001a\u00020\u0019J\u0014\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0002R#\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\t\u00a8\u0006%"}, d2 = {"Lcom/example/githubClient/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "dataStatus", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/githubClient/arch/LiveDataWrapper;", "", "Ljava/lang/Exception;", "getDataStatus", "()Landroidx/lifecycle/MediatorLiveData;", "errorState", "Lcom/example/githubClient/arch/ExplicitLiveData;", "", "getErrorState", "()Lcom/example/githubClient/arch/ExplicitLiveData;", "repoModel", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/example/githubClient/model/Repo;", "getRepoModel", "()Landroidx/lifecycle/MutableLiveData;", "userModel", "Lcom/example/githubClient/model/User;", "getUserModel", "userName", "", "getUserName", "valid", "getValid", "checkFields", "fetchRepos", "Lio/reactivex/Observable;", "Lkotlin/collections/ArrayList;", "usernameInput", "fetchUserInfo", "wasDataFetchSuccessful", "Companion", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> userName = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.githubClient.model.User> userModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.githubClient.model.Repo>> repoModel = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.githubClient.arch.ExplicitLiveData<java.lang.Boolean> errorState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.example.githubClient.arch.LiveDataWrapper<kotlin.Unit, java.lang.Exception>> dataStatus = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> valid = null;
    private static final java.lang.String TAG = null;
    public static final com.example.githubClient.MainActivityViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.githubClient.model.User> getUserModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.example.githubClient.model.Repo>> getRepoModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.githubClient.arch.ExplicitLiveData<java.lang.Boolean> getErrorState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<com.example.githubClient.arch.LiveDataWrapper<kotlin.Unit, java.lang.Exception>> getDataStatus() {
        return null;
    }
    
    private final com.example.githubClient.arch.LiveDataWrapper<kotlin.Unit, java.lang.Exception> wasDataFetchSuccessful() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MediatorLiveData<java.lang.Boolean> getValid() {
        return null;
    }
    
    private final boolean checkFields() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.ArrayList<com.example.githubClient.model.Repo>> fetchRepos(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameInput) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<com.example.githubClient.model.User> fetchUserInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String usernameInput) {
        return null;
    }
    
    public MainActivityViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/githubClient/MainActivityViewModel$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}