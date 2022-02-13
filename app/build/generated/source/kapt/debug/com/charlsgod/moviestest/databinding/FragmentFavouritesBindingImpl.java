package com.charlsgod.moviestest.databinding;
import com.charlsgod.moviestest.R;
import com.charlsgod.moviestest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentFavouritesBindingImpl extends FragmentFavouritesBinding implements com.charlsgod.moviestest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.favorites_appbar, 3);
        sViewsWithIds.put(R.id.favourites_toolbar, 4);
        sViewsWithIds.put(R.id.toolbar_container, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavouritesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentFavouritesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            , (android.widget.ImageButton) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.RelativeLayout) bindings[5]
            );
        this.layoutAction.setTag(null);
        this.list.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.charlsgod.moviestest.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.charlsgod.moviestest.ui.favourites.FavouritesViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.charlsgod.moviestest.ui.favourites.FavouritesViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFavouriteMovies((androidx.lifecycle.LiveData<java.util.List<com.charlsgod.moviestest.model.Movie>>) object, fieldId);
            case 1 :
                return onChangeViewModelColumnCount((androidx.lifecycle.LiveData<java.lang.Integer>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFavouriteMovies(androidx.lifecycle.LiveData<java.util.List<com.charlsgod.moviestest.model.Movie>> ViewModelFavouriteMovies, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelColumnCount(androidx.lifecycle.LiveData<java.lang.Integer> ViewModelColumnCount, int fieldId) {
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
        androidx.lifecycle.LiveData<java.util.List<com.charlsgod.moviestest.model.Movie>> viewModelFavouriteMovies = null;
        int androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue = 0;
        java.util.List<com.charlsgod.moviestest.model.Movie> viewModelFavouriteMoviesGetValue = null;
        java.lang.Integer viewModelColumnCountGetValue = null;
        com.charlsgod.moviestest.ui.favourites.FavouritesViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<java.lang.Integer> viewModelColumnCount = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.favouriteMovies
                        viewModelFavouriteMovies = viewModel.getFavouriteMovies();
                    }
                    updateLiveDataRegistration(0, viewModelFavouriteMovies);


                    if (viewModelFavouriteMovies != null) {
                        // read viewModel.favouriteMovies.getValue()
                        viewModelFavouriteMoviesGetValue = viewModelFavouriteMovies.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.columnCount
                        viewModelColumnCount = viewModel.getColumnCount();
                    }
                    updateLiveDataRegistration(1, viewModelColumnCount);


                    if (viewModelColumnCount != null) {
                        // read viewModel.columnCount.getValue()
                        viewModelColumnCountGetValue = viewModelColumnCount.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.columnCount.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelColumnCountGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.layoutAction.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindImage(this.layoutAction, androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue);
            com.charlsgod.moviestest.util.BindingUtilKt.layoutManager(this.list, androidxDatabindingViewDataBindingSafeUnboxViewModelColumnCountGetValue);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindFavouriteList(this.list, viewModelFavouriteMoviesGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.charlsgod.moviestest.ui.favourites.FavouritesViewModel viewModel = mViewModel;
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
        flag 0 (0x1L): viewModel.favouriteMovies
        flag 1 (0x2L): viewModel.columnCount
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}