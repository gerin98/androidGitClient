package com.example.githubClient.arch;

import java.lang.System;

/**
 * [LiveData] which publicly exposes [.setValue] and [.postValue] method.
 *
 *
 * ExplicitLiveData will reset the value LiveData value to null after every setValue (which is also
 * called in postValue once it can run on the main thread)
 *
 *
 * Use this method Navigation in which we do NOT want to remember the state of the LiveData
 *
 *
 * Ex. if we navigate to a flyer from search, once we hit back and then do a orientation
 * change so recreate the LiveData object and that will return the last value, if using normal
 * LiveData you would be sent back to the flyer view instead of staying on search
 *
 * @param <T> The type of data hold by this instance
 * <
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0017\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/githubClient/arch/ExplicitLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "()V", "setValue", "", "value", "(Ljava/lang/Object;)V", "app_debug"})
public final class ExplicitLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<T> {
    
    @java.lang.Override()
    public void setValue(@org.jetbrains.annotations.Nullable()
    T value) {
    }
    
    public ExplicitLiveData() {
        super(null);
    }
}