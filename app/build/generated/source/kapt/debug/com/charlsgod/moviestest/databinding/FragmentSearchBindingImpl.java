package com.charlsgod.moviestest.databinding;
import com.charlsgod.moviestest.R;
import com.charlsgod.moviestest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentSearchBindingImpl extends FragmentSearchBinding implements com.charlsgod.moviestest.generated.callback.OnEditorActionListener.Listener, com.charlsgod.moviestest.generated.callback.OnCheckedChangeListener.Listener, com.charlsgod.moviestest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(0, 
            new String[] {"loading_state"},
            new int[] {5},
            new int[] {com.charlsgod.moviestest.R.layout.loading_state});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_appbar, 6);
        sViewsWithIds.put(R.id.search_toolbar, 7);
        sViewsWithIds.put(R.id.toolbar_container, 8);
        sViewsWithIds.put(R.id.nav_search, 9);
        sViewsWithIds.put(R.id.query_layout, 10);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @Nullable
    private final com.charlsgod.moviestest.databinding.LoadingStateBinding mboundView01;
    // variables
    @Nullable
    private final android.widget.TextView.OnEditorActionListener mCallback4;
    @Nullable
    private final android.widget.CompoundButton.OnCheckedChangeListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener queryInputandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of viewModel.input.getValue()
            //         is viewModel.input.setValue((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(queryInput);
            // localize variables for thread safety
            // viewModel.input
            androidx.lifecycle.MutableLiveData<java.lang.String> viewModelInput = null;
            // viewModel.input.getValue()
            java.lang.String viewModelInputGetValue = null;
            // viewModel
            com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
            // viewModel != null
            boolean viewModelJavaLangObjectNull = false;
            // viewModel.input != null
            boolean viewModelInputJavaLangObjectNull = false;



            viewModelJavaLangObjectNull = (viewModel) != (null);
            if (viewModelJavaLangObjectNull) {


                viewModelInput = viewModel.getInput();

                viewModelInputJavaLangObjectNull = (viewModelInput) != (null);
                if (viewModelInputJavaLangObjectNull) {




                    viewModelInput.setValue(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageButton) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.ImageButton) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[3]
            , (com.google.android.material.textfield.TextInputLayout) bindings[10]
            , (com.google.android.material.appbar.AppBarLayout) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (android.widget.ToggleButton) bindings[1]
            , (android.widget.RelativeLayout) bindings[8]
            );
        this.layoutAction.setTag(null);
        this.list.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.charlsgod.moviestest.databinding.LoadingStateBinding) bindings[5];
        setContainedBinding(this.mboundView01);
        this.queryInput.setTag(null);
        this.sortAction.setTag(null);
        setRootTag(root);
        // listeners
        mCallback4 = new com.charlsgod.moviestest.generated.callback.OnEditorActionListener(this, 3);
        mCallback2 = new com.charlsgod.moviestest.generated.callback.OnCheckedChangeListener(this, 1);
        mCallback3 = new com.charlsgod.moviestest.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.charlsgod.moviestest.ui.search.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.charlsgod.moviestest.ui.search.SearchViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelInput((androidx.lifecycle.MutableLiveData<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelResults((androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>>) object, fieldId);
            case 2 :
                return onChangeViewModelIsTyping((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelErrorMessage((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 4 :
                return onChangeViewModelColumnCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelInput(androidx.lifecycle.MutableLiveData<java.lang.String> ViewModelInput, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelResults(androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>> ViewModelResults, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsTyping(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsTyping, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelErrorMessage(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelErrorMessage, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelColumnCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelColumnCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.Boolean viewModelIsTypingGetValue = null;
        java.lang.Boolean viewModelErrorMessageGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.String> viewModelInput = null;
        androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>> viewModelResults = null;
        int viewModelResultsDataSize = 0;
        java.lang.String viewModelInputGetValue = null;
        com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>> viewModelResultsGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelErrorMessageGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsTyping = null;
        java.util.List<com.charlsgod.moviestest.model.Movie> viewModelResultsData = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue = 0;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelErrorMessage = null;
        boolean viewModelResultsDataSizeInt0 = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsTypingGetValue = false;
        java.lang.Integer viewModelColumnCountGetValue = null;
        com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelColumnCount = null;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.input
                        viewModelInput = viewModel.getInput();
                    }
                    updateLiveDataRegistration(0, viewModelInput);


                    if (viewModelInput != null) {
                        // read viewModel.input.getValue()
                        viewModelInputGetValue = viewModelInput.getValue();
                    }
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.results
                        viewModelResults = viewModel.getResults();
                    }
                    updateLiveDataRegistration(1, viewModelResults);


                    if (viewModelResults != null) {
                        // read viewModel.results.getValue()
                        viewModelResultsGetValue = viewModelResults.getValue();
                    }


                    if (viewModelResultsGetValue != null) {
                        // read viewModel.results.getValue().data
                        viewModelResultsData = viewModelResultsGetValue.getData();
                    }


                    if (viewModelResultsData != null) {
                        // read viewModel.results.getValue().data.size()
                        viewModelResultsDataSize = viewModelResultsData.size();
                    }


                    // read viewModel.results.getValue().data.size() != 0
                    viewModelResultsDataSizeInt0 = (viewModelResultsDataSize) != (0);
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isTyping
                        viewModelIsTyping = viewModel.isTyping();
                    }
                    updateLiveDataRegistration(2, viewModelIsTyping);


                    if (viewModelIsTyping != null) {
                        // read viewModel.isTyping.getValue()
                        viewModelIsTypingGetValue = viewModelIsTyping.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTyping.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsTypingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsTypingGetValue);
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.errorMessage
                        viewModelErrorMessage = viewModel.getErrorMessage();
                    }
                    updateLiveDataRegistration(3, viewModelErrorMessage);


                    if (viewModelErrorMessage != null) {
                        // read viewModel.errorMessage.getValue()
                        viewModelErrorMessageGetValue = viewModelErrorMessage.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.errorMessage.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelErrorMessageGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelErrorMessageGetValue);
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.columnCount
                        viewModelColumnCount = viewModel.getColumnCount();
                    }
                    updateLiveDataRegistration(4, viewModelColumnCount);


                    if (viewModelColumnCount != null) {
                        // read viewModel.columnCount.getValue()
                        viewModelColumnCountGetValue = viewModelColumnCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.columnCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelColumnCountGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            this.layoutAction.setOnClickListener(mCallback3);
            this.queryInput.setOnEditorActionListener(mCallback4);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.queryInput, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, queryInputandroidTextAttrChanged);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.sortAction, mCallback2, (androidx.databinding.InverseBindingListener)null);
        }
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindImage(this.layoutAction, androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue);
            com.charlsgod.moviestest.util.BindingUtilKt.layoutManager(this.list, androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindRecyclerView(this.list, viewModelResultsGetValue);
            com.charlsgod.moviestest.util.BindingUtilKt.showHide(this.list, viewModelResultsDataSizeInt0);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            this.mboundView01.setViewModel(viewModel);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.queryInput, viewModelInputGetValue);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.setError(this.queryInput, androidxDatabindingViewDataBindingSafeUnboxViewModelErrorMessageGetValue);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.showKeyboard(this.queryInput, androidxDatabindingViewDataBindingSafeUnboxViewModelIsTypingGetValue);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final boolean _internalCallbackOnEditorAction(int sourceId , android.widget.TextView callbackArg_0, int callbackArg_1, android.view.KeyEvent callbackArg_2) {
        // localize variables for thread safety
        // viewModel.onEditorAction(view, actionId, event)
        boolean viewModelOnEditorActionCallbackArg0CallbackArg1CallbackArg2 = false;
        // viewModel
        com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {





            viewModelOnEditorActionCallbackArg0CallbackArg1CallbackArg2 = viewModel.onEditorAction(callbackArg_0, callbackArg_1, callbackArg_2);
        }
        return viewModelOnEditorActionCallbackArg0CallbackArg1CallbackArg2;
    }
    public final void _internalCallbackOnCheckedChanged(int sourceId , android.widget.CompoundButton callbackArg_0, boolean callbackArg_1) {
        // localize variables for thread safety
        // viewModel
        com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.updateSortType(callbackArg_1);
        }
    }
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.updateGridLayout();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.input
        flag 1 (0x2L): viewModel.results
        flag 2 (0x3L): viewModel.isTyping
        flag 3 (0x4L): viewModel.errorMessage
        flag 4 (0x5L): viewModel.columnCount
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}