package com.example.githubClient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0012\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+H\u0002J\b\u0010,\u001a\u00020\u001eH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u0006-"}, d2 = {"Lcom/example/githubClient/RepositoryListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "checkedItem", "", "getCheckedItem", "()I", "setCheckedItem", "(I)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "repositories", "Ljava/util/ArrayList;", "Lcom/example/githubClient/model/Repo;", "Lkotlin/collections/ArrayList;", "getRepositories", "()Ljava/util/ArrayList;", "setRepositories", "(Ljava/util/ArrayList;)V", "viewAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "viewManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "viewModel", "Lcom/example/githubClient/RepositoryListActivityViewModel;", "getViewModel", "()Lcom/example/githubClient/RepositoryListActivityViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initLiveDataObservers", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "setProfileData", "userInfo", "Lcom/example/githubClient/model/User;", "setupRecyclerView", "app_debug"})
public final class RepositoryListActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private androidx.recyclerview.widget.RecyclerView.Adapter<?> viewAdapter;
    private androidx.recyclerview.widget.RecyclerView.LayoutManager viewManager;
    @org.jetbrains.annotations.NotNull()
    public java.util.ArrayList<com.example.githubClient.model.Repo> repositories;
    private int checkedItem;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.githubClient.model.Repo> getRepositories() {
        return null;
    }
    
    public final void setRepositories(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.githubClient.model.Repo> p0) {
    }
    
    public final int getCheckedItem() {
        return 0;
    }
    
    public final void setCheckedItem(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.githubClient.RepositoryListActivityViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void initLiveDataObservers() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void setProfileData(com.example.githubClient.model.User userInfo) {
    }
    
    public RepositoryListActivity() {
        super();
    }
}