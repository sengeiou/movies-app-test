package com.charlsgod.moviestest.databinding;
import com.charlsgod.moviestest.R;
import com.charlsgod.moviestest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDetailBindingImpl extends FragmentDetailBinding implements com.charlsgod.moviestest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(4, 
            new String[] {"content_movie"},
            new int[] {5},
            new int[] {com.charlsgod.moviestest.R.layout.content_movie});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.detail_toolbar, 6);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final com.google.android.material.appbar.CollapsingToolbarLayout mboundView1;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            , (com.charlsgod.moviestest.databinding.ContentMovieBinding) bindings[5]
            );
        this.addRemoveAction.setTag(null);
        this.articleImage.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView4 = (androidx.core.widget.NestedScrollView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        mCallback9 = new com.charlsgod.moviestest.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        movie.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (movie.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.charlsgod.moviestest.ui.detail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.charlsgod.moviestest.ui.detail.DetailViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        movie.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsFavourite((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelMovie((androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie>) object, fieldId);
            case 2 :
                return onChangeMovie((com.charlsgod.moviestest.databinding.ContentMovieBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsFavourite(androidx.lifecycle.LiveData<java.lang.Boolean> ViewModelIsFavourite, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMovie(androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> ViewModelMovie, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeMovie(com.charlsgod.moviestest.databinding.ContentMovieBinding Movie, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        java.lang.String viewModelMovieTitle = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> viewModelIsFavourite = null;
        androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> viewModelMovie = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavouriteGetValue = false;
        java.lang.Boolean viewModelIsFavouriteGetValue = null;
        com.charlsgod.moviestest.ui.detail.DetailViewModel viewModel = mViewModel;
        com.charlsgod.moviestest.model.Movie viewModelMovieGetValue = null;
        java.lang.String viewModelMoviePosterUrl = null;

        if ((dirtyFlags & 0x1bL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isFavourite
                        viewModelIsFavourite = viewModel.isFavourite();
                    }
                    updateLiveDataRegistration(0, viewModelIsFavourite);


                    if (viewModelIsFavourite != null) {
                        // read viewModel.isFavourite.getValue()
                        viewModelIsFavouriteGetValue = viewModelIsFavourite.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isFavourite.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavouriteGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsFavouriteGetValue);
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.movie
                        viewModelMovie = viewModel.getMovie();
                    }
                    updateLiveDataRegistration(1, viewModelMovie);


                    if (viewModelMovie != null) {
                        // read viewModel.movie.getValue()
                        viewModelMovieGetValue = viewModelMovie.getValue();
                    }


                    if (viewModelMovieGetValue != null) {
                        // read viewModel.movie.getValue().title
                        viewModelMovieTitle = viewModelMovieGetValue.getTitle();
                        // read viewModel.movie.getValue().posterUrl
                        viewModelMoviePosterUrl = viewModelMovieGetValue.getPosterUrl();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.addRemoveAction.setOnClickListener(mCallback9);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.setIcon(this.addRemoveAction, androidxDatabindingViewDataBindingSafeUnboxViewModelIsFavouriteGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindImage(this.articleImage, viewModelMoviePosterUrl);
            this.mboundView1.setTitle(viewModelMovieTitle);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            this.movie.setViewModel(viewModel);
        }
        executeBindingsOn(movie);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.charlsgod.moviestest.ui.detail.DetailViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.setFavorite();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isFavourite
        flag 1 (0x2L): viewModel.movie
        flag 2 (0x3L): movie
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}