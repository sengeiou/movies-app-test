package com.charlsgod.moviestest.databinding;
import com.charlsgod.moviestest.R;
import com.charlsgod.moviestest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class LoadingStateBindingImpl extends LoadingStateBinding implements com.charlsgod.moviestest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LoadingStateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private LoadingStateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[1]
            , (com.google.android.material.progressindicator.ProgressIndicator) bindings[2]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            );
        this.errorText.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.progress.setTag(null);
        this.retryButton.setTag(null);
        setRootTag(root);
        // listeners
        mCallback5 = new com.charlsgod.moviestest.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelResults((androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelResults(androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>> ViewModelResults, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        boolean viewModelResultsStatusStatusERROR = false;
        boolean viewModelResultsDataJavaLangObjectNullBooleanTrueViewModelResultsDataSizeInt0 = false;
        androidx.lifecycle.LiveData<com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>>> viewModelResults = null;
        int viewModelResultsDataSize = 0;
        boolean viewModelResultsDataSizeInt0 = false;
        com.charlsgod.moviestest.util.Resource<java.util.List<com.charlsgod.moviestest.model.Movie>> viewModelResultsGetValue = null;
        java.lang.String viewModelResultsMessageJavaLangObjectNullErrorTextAndroidStringUnknownErrorViewModelResultsMessage = null;
        java.util.List<com.charlsgod.moviestest.model.Movie> viewModelResultsData = null;
        boolean viewModelResultsDataJavaLangObjectNull = false;
        boolean viewModelResultsStatusStatusLOADING = false;
        java.lang.String viewModelResultsMessage = null;
        boolean viewModelResultsMessageJavaLangObjectNull = false;
        com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
        com.charlsgod.moviestest.util.Status viewModelResultsStatus = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.results
                    viewModelResults = viewModel.getResults();
                }
                updateLiveDataRegistration(0, viewModelResults);


                if (viewModelResults != null) {
                    // read viewModel.results.getValue()
                    viewModelResultsGetValue = viewModelResults.getValue();
                }


                if (viewModelResultsGetValue != null) {
                    // read viewModel.results.getValue().data
                    viewModelResultsData = viewModelResultsGetValue.getData();
                    // read viewModel.results.getValue().message
                    viewModelResultsMessage = viewModelResultsGetValue.getMessage();
                    // read viewModel.results.getValue().status
                    viewModelResultsStatus = viewModelResultsGetValue.getStatus();
                }


                // read viewModel.results.getValue().data == null
                viewModelResultsDataJavaLangObjectNull = (viewModelResultsData) == (null);
                // read viewModel.results.getValue().message == null
                viewModelResultsMessageJavaLangObjectNull = (viewModelResultsMessage) == (null);
                // read viewModel.results.getValue().status == Status.ERROR
                viewModelResultsStatusStatusERROR = (viewModelResultsStatus) == (com.charlsgod.moviestest.util.Status.ERROR);
                // read viewModel.results.getValue().status == Status.LOADING
                viewModelResultsStatusStatusLOADING = (viewModelResultsStatus) == (com.charlsgod.moviestest.util.Status.LOADING);
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelResultsDataJavaLangObjectNull) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelResultsMessageJavaLangObjectNull) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }
        }
        // batch finished

        if ((dirtyFlags & 0x8L) != 0) {

                if (viewModelResultsData != null) {
                    // read viewModel.results.getValue().data.size()
                    viewModelResultsDataSize = viewModelResultsData.size();
                }


                // read viewModel.results.getValue().data.size() == 0
                viewModelResultsDataSizeInt0 = (viewModelResultsDataSize) == (0);
        }
        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.results.getValue().message == null ? @android:string/unknown_error : viewModel.results.getValue().message
                viewModelResultsMessageJavaLangObjectNullErrorTextAndroidStringUnknownErrorViewModelResultsMessage = ((viewModelResultsMessageJavaLangObjectNull) ? (errorText.getResources().getString(R.string.unknown_error)) : (viewModelResultsMessage));
        }

        if ((dirtyFlags & 0x7L) != 0) {

                // read viewModel.results.getValue().data == null ? true : viewModel.results.getValue().data.size() == 0
                viewModelResultsDataJavaLangObjectNullBooleanTrueViewModelResultsDataSizeInt0 = ((viewModelResultsDataJavaLangObjectNull) ? (true) : (viewModelResultsDataSizeInt0));
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.errorText, viewModelResultsMessageJavaLangObjectNullErrorTextAndroidStringUnknownErrorViewModelResultsMessage);
            com.charlsgod.moviestest.util.BindingUtilKt.showHide(this.errorText, viewModelResultsStatusStatusERROR);
            com.charlsgod.moviestest.util.BindingUtilKt.showHide(this.mboundView0, viewModelResultsDataJavaLangObjectNullBooleanTrueViewModelResultsDataSizeInt0);
            com.charlsgod.moviestest.util.BindingUtilKt.showHide(this.progress, viewModelResultsStatusStatusLOADING);
            com.charlsgod.moviestest.util.BindingUtilKt.showHide(this.retryButton, viewModelResultsStatusStatusERROR);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.retryButton.setOnClickListener(mCallback5);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.charlsgod.moviestest.ui.search.SearchViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.retry();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.results
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.results.getValue().data == null ? true : viewModel.results.getValue().data.size() == 0
        flag 4 (0x5L): viewModel.results.getValue().data == null ? true : viewModel.results.getValue().data.size() == 0
        flag 5 (0x6L): viewModel.results.getValue().message == null ? @android:string/unknown_error : viewModel.results.getValue().message
        flag 6 (0x7L): viewModel.results.getValue().message == null ? @android:string/unknown_error : viewModel.results.getValue().message
    flag mapping end*/
    //end
}