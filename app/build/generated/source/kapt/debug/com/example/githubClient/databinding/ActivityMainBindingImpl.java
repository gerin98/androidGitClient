package com.example.githubClient.databinding;
import com.example.githubClient.R;
import com.example.githubClient.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.imageView, 3);
        sViewsWithIds.put(R.id.textView, 4);
        sViewsWithIds.put(R.id.usernameTextInputLayout, 5);
        sViewsWithIds.put(R.id.progressBar, 6);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener usernameTextInputEditTextandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of mainActivityViewModel.userName.getValue()
            //         is mainActivityViewModel.userName.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(usernameTextInputEditText);
            // localize variables for thread safety
            // mainActivityViewModel != null
            boolean mainActivityViewModelJavaLangObjectNull = false;
            // mainActivityViewModel.userName != null
            boolean mainActivityViewModelUserNameJavaLangObjectNull = false;
            // mainActivityViewModel
            com.example.githubClient.MainActivityViewModel mainActivityViewModel = mMainActivityViewModel;
            // mainActivityViewModel.userName.getValue()
            java.lang.String mainActivityViewModelUserNameGetValue = null;
            // mainActivityViewModel.userName
            androidx.lifecycle.MutableLiveData<java.lang.String> mainActivityViewModelUserName = null;



            mainActivityViewModelJavaLangObjectNull = (mainActivityViewModel) != (null);
            if (mainActivityViewModelJavaLangObjectNull) {


                mainActivityViewModelUserName = mainActivityViewModel.getUserName();

                mainActivityViewModelUserNameJavaLangObjectNull = (mainActivityViewModelUserName) != (null);
                if (mainActivityViewModelUserNameJavaLangObjectNull) {




                    mainActivityViewModelUserName.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[6]
            , (com.google.android.material.button.MaterialButton) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (com.google.android.material.textfield.TextInputEditText) bindings[1]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            );
        this.constraintLayout.setTag(null);
        this.repoButton.setTag(null);
        this.usernameTextInputEditText.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.mainActivityViewModel == variableId) {
            setMainActivityViewModel((com.example.githubClient.MainActivityViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMainActivityViewModel(@Nullable com.example.githubClient.MainActivityViewModel MainActivityViewModel) {
        this.mMainActivityViewModel = MainActivityViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.mainActivityViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeMainActivityViewModelValid((androidx.lifecycle.MediatorLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeMainActivityViewModelUserName((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeMainActivityViewModelValid(androidx.lifecycle.MediatorLiveData<java.lang.Boolean> MainActivityViewModelValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMainActivityViewModelUserName(androidx.lifecycle.MutableLiveData<java.lang.String> MainActivityViewModelUserName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.lifecycle.MediatorLiveData<java.lang.Boolean> mainActivityViewModelValid = null;
        com.example.githubClient.MainActivityViewModel mainActivityViewModel = mMainActivityViewModel;
        androidx.lifecycle.MutableLiveData<java.lang.String> mainActivityViewModelUserName = null;
        java.lang.Boolean mainActivityViewModelValidGetValue = null;
        java.lang.String mainActivityViewModelUserNameGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxMainActivityViewModelValidGetValue = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (mainActivityViewModel != null) {
                        // read mainActivityViewModel.valid
                        mainActivityViewModelValid = mainActivityViewModel.getValid();
                    }
                    updateLiveDataRegistration(0, mainActivityViewModelValid);


                    if (mainActivityViewModelValid != null) {
                        // read mainActivityViewModel.valid.getValue()
                        mainActivityViewModelValidGetValue = mainActivityViewModelValid.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(mainActivityViewModel.valid.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxMainActivityViewModelValidGetValue = androidx.databinding.ViewDataBinding.safeUnbox(mainActivityViewModelValidGetValue);
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (mainActivityViewModel != null) {
                        // read mainActivityViewModel.userName
                        mainActivityViewModelUserName = mainActivityViewModel.getUserName();
                    }
                    updateLiveDataRegistration(1, mainActivityViewModelUserName);


                    if (mainActivityViewModelUserName != null) {
                        // read mainActivityViewModel.userName.getValue()
                        mainActivityViewModelUserNameGetValue = mainActivityViewModelUserName.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.repoButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxMainActivityViewModelValidGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.usernameTextInputEditText, mainActivityViewModelUserNameGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.usernameTextInputEditText, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, usernameTextInputEditTextandroidTextAttrChanged);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): mainActivityViewModel.valid
        flag 1 (0x2L): mainActivityViewModel.userName
        flag 2 (0x3L): mainActivityViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}