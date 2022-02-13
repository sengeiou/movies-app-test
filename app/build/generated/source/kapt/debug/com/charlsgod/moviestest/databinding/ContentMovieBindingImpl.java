package com.charlsgod.moviestest.databinding;
import com.charlsgod.moviestest.R;
import com.charlsgod.moviestest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ContentMovieBindingImpl extends ContentMovieBinding implements com.charlsgod.moviestest.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.divider, 7);
        sViewsWithIds.put(R.id.rating_image, 8);
        sViewsWithIds.put(R.id.genre_image, 9);
        sViewsWithIds.put(R.id.release_image, 10);
        sViewsWithIds.put(R.id.language_image, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final com.google.android.material.button.MaterialButton mboundView6;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ContentMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ContentMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.view.View) bindings[7]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[10]
            );
        this.genre.setTag(null);
        this.language.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView6 = (com.google.android.material.button.MaterialButton) bindings[6];
        this.mboundView6.setTag(null);
        this.overview.setTag(null);
        this.rating.setTag(null);
        this.release.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.charlsgod.moviestest.generated.callback.OnClickListener(this, 1);
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
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelMovie((androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelMovie(androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> ViewModelMovie, int fieldId) {
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
        java.lang.Double viewModelMovieRating = null;
        java.lang.String viewModelMovieOverview = null;
        androidx.lifecycle.LiveData<com.charlsgod.moviestest.model.Movie> viewModelMovie = null;
        java.util.List<java.lang.String> viewModelMovieGenreNames = null;
        java.lang.String viewModelMovieReleaseDate = null;
        java.lang.String viewModelMovieLanguage = null;
        com.charlsgod.moviestest.ui.detail.DetailViewModel viewModel = mViewModel;
        com.charlsgod.moviestest.model.Movie viewModelMovieGetValue = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.movie
                    viewModelMovie = viewModel.getMovie();
                }
                updateLiveDataRegistration(0, viewModelMovie);


                if (viewModelMovie != null) {
                    // read viewModel.movie.getValue()
                    viewModelMovieGetValue = viewModelMovie.getValue();
                }


                if (viewModelMovieGetValue != null) {
                    // read viewModel.movie.getValue().rating
                    viewModelMovieRating = viewModelMovieGetValue.getRating();
                    // read viewModel.movie.getValue().overview
                    viewModelMovieOverview = viewModelMovieGetValue.getOverview();
                    // read viewModel.movie.getValue().genreNames
                    viewModelMovieGenreNames = viewModelMovieGetValue.getGenreNames();
                    // read viewModel.movie.getValue().releaseDate
                    viewModelMovieReleaseDate = viewModelMovieGetValue.getReleaseDate();
                    // read viewModel.movie.getValue().language
                    viewModelMovieLanguage = viewModelMovieGetValue.getLanguage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindGenres(this.genre, viewModelMovieGenreNames);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.language, viewModelMovieLanguage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.overview, viewModelMovieOverview);
            com.charlsgod.moviestest.util.BindingUtilKt.bindRating(this.rating, viewModelMovieRating);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.release, viewModelMovieReleaseDate);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView6.setOnClickListener(mCallback1);
        }
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


            viewModel.onTrailerClicked();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.movie
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}