package com.example.githubClient.arch;

import java.lang.System;

/**
 * A wrapper around the android.arch.LiveData object that gives a little more info about
 * the data we are trying to set.
 *
 * The @ResourceStatus is an enum which quickly informs about the state of the data:
 * LOADING, SUCCESS or ERROR
 *
 * The data is the actual Data we set on the LiveData object
 *
 * The exception is to set an Exception in case there was an error
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0011\u001a\u0004\u0018\u00018\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/example/githubClient/arch/LiveDataWrapper;", "DATA", "EXCEPTION", "", "status", "Lcom/example/githubClient/arch/ResourceStatus;", "data", "exception", "(Lcom/example/githubClient/arch/ResourceStatus;Ljava/lang/Object;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getException", "getStatus", "()Lcom/example/githubClient/arch/ResourceStatus;", "component1", "component2", "component3", "copy", "(Lcom/example/githubClient/arch/ResourceStatus;Ljava/lang/Object;Ljava/lang/Object;)Lcom/example/githubClient/arch/LiveDataWrapper;", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class LiveDataWrapper<DATA extends java.lang.Object, EXCEPTION extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final com.example.githubClient.arch.ResourceStatus status = null;
    @org.jetbrains.annotations.Nullable()
    private final DATA data = null;
    @org.jetbrains.annotations.Nullable()
    private final EXCEPTION exception = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.githubClient.arch.ResourceStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final DATA getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final EXCEPTION getException() {
        return null;
    }
    
    public LiveDataWrapper(@org.jetbrains.annotations.NotNull()
    com.example.githubClient.arch.ResourceStatus status, @org.jetbrains.annotations.Nullable()
    DATA data, @org.jetbrains.annotations.Nullable()
    EXCEPTION exception) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.githubClient.arch.ResourceStatus component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final DATA component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final EXCEPTION component3() {
        return null;
    }
    
    /**
     * A wrapper around the android.arch.LiveData object that gives a little more info about
     * the data we are trying to set.
     *
     * The @ResourceStatus is an enum which quickly informs about the state of the data:
     * LOADING, SUCCESS or ERROR
     *
     * The data is the actual Data we set on the LiveData object
     *
     * The exception is to set an Exception in case there was an error
     */
    @org.jetbrains.annotations.NotNull()
    public final com.example.githubClient.arch.LiveDataWrapper<DATA, EXCEPTION> copy(@org.jetbrains.annotations.NotNull()
    com.example.githubClient.arch.ResourceStatus status, @org.jetbrains.annotations.Nullable()
    DATA data, @org.jetbrains.annotations.Nullable()
    EXCEPTION exception) {
        return null;
    }
    
    /**
     * A wrapper around the android.arch.LiveData object that gives a little more info about
     * the data we are trying to set.
     *
     * The @ResourceStatus is an enum which quickly informs about the state of the data:
     * LOADING, SUCCESS or ERROR
     *
     * The data is the actual Data we set on the LiveData object
     *
     * The exception is to set an Exception in case there was an error
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * A wrapper around the android.arch.LiveData object that gives a little more info about
     * the data we are trying to set.
     *
     * The @ResourceStatus is an enum which quickly informs about the state of the data:
     * LOADING, SUCCESS or ERROR
     *
     * The data is the actual Data we set on the LiveData object
     *
     * The exception is to set an Exception in case there was an error
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * A wrapper around the android.arch.LiveData object that gives a little more info about
     * the data we are trying to set.
     *
     * The @ResourceStatus is an enum which quickly informs about the state of the data:
     * LOADING, SUCCESS or ERROR
     *
     * The data is the actual Data we set on the LiveData object
     *
     * The exception is to set an Exception in case there was an error
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}