package com.example.githubClient.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/example/githubClient/service/GitHubService;", "", "getUser", "Lio/reactivex/Observable;", "Lcom/example/githubClient/model/User;", "user", "", "listRepos", "Ljava/util/ArrayList;", "Lcom/example/githubClient/model/Repo;", "Lkotlin/collections/ArrayList;", "app_debug"})
public abstract interface GitHubService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}/repos")
    public abstract io.reactivex.Observable<java.util.ArrayList<com.example.githubClient.model.Repo>> listRepos(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{user}")
    public abstract io.reactivex.Observable<com.example.githubClient.model.User> getUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "user")
    java.lang.String user);
}