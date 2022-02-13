package com.charlsgod.moviestest.databinding;
import com.charlsgod.moviestest.R;
import com.charlsgod.moviestest.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class ItemMovieBindingImpl extends ItemMovieBinding implements com.charlsgod.moviestest.generated.callback.OnClickListener.Listener, com.charlsgod.moviestest.generated.callback.OnLongClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.details_layout, 7);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnLongClickListener mCallback8;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ItemMovieBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.card.MaterialCardView) bindings[1]
            , (android.widget.RelativeLayout) bindings[7]
            , (android.widget.FrameLayout) bindings[0]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.RatingBar) bindings[6]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            );
        this.cardView.setTag(null);
        this.emailFrame.setTag(null);
        this.movieGenre.setTag(null);
        this.moviePoster.setTag(null);
        this.movieRating.setTag(null);
        this.movieTitle.setTag(null);
        this.movieYear.setTag(null);
        setRootTag(root);
        // listeners
        mCallback7 = new com.charlsgod.moviestest.generated.callback.OnClickListener(this, 1);
        mCallback8 = new com.charlsgod.moviestest.generated.callback.OnLongClickListener(this, 2);
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
        if (BR.movie == variableId) {
            setMovie((com.charlsgod.moviestest.model.Movie) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.charlsgod.moviestest.model.Movie Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setListener(@Nullable com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String moviePosterUrl = null;
        java.lang.String MovieTitle1 = null;
        java.lang.String movieReleaseDate = null;
        java.lang.Double MovieRating1 = null;
        com.charlsgod.moviestest.model.Movie movie = mMovie;
        java.util.List<java.lang.String> movieGenreNames = null;
        com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener listener = mListener;
        float movieRatingFloatValueInt2 = 0f;
        float movieRatingFloatValue = 0f;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movie != null) {
                    // read movie.posterUrl
                    moviePosterUrl = movie.getPosterUrl();
                    // read movie.title
                    MovieTitle1 = movie.getTitle();
                    // read movie.releaseDate
                    movieReleaseDate = movie.getReleaseDate();
                    // read movie.rating
                    MovieRating1 = movie.getRating();
                    // read movie.genreNames
                    movieGenreNames = movie.getGenreNames();
                }


                if (MovieRating1 != null) {
                    // read movie.rating.floatValue()
                    movieRatingFloatValue = MovieRating1.floatValue();
                }


                // read (movie.rating.floatValue()) / (2)
                movieRatingFloatValueInt2 = (movieRatingFloatValue) / (2);
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.cardView.setOnClickListener(mCallback7);
            this.cardView.setOnLongClickListener(mCallback8);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.charlsgod.moviestest.util.BindingUtilKt.bindGenres(this.movieGenre, movieGenreNames);
            com.charlsgod.moviestest.util.BindingUtilKt.bindImage(this.moviePoster, moviePosterUrl);
            androidx.databinding.adapters.RatingBarBindingAdapter.setRating(this.movieRating, movieRatingFloatValueInt2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.movieTitle, MovieTitle1);
            com.charlsgod.moviestest.util.BindingUtilKt.bindReleaseDate(this.movieYear, movieReleaseDate);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // movie
        com.charlsgod.moviestest.model.Movie movie = mMovie;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {




            listener.onClick(callbackArg_0, movie);
        }
    }
    public final boolean _internalCallbackOnLongClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // movie
        com.charlsgod.moviestest.model.Movie movie = mMovie;
        // listener.onLongClick(movie)
        boolean listenerOnLongClickMovie = false;
        // listener != null
        boolean listenerJavaLangObjectNull = false;
        // listener
        com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener listener = mListener;



        listenerJavaLangObjectNull = (listener) != (null);
        if (listenerJavaLangObjectNull) {



            listenerOnLongClickMovie = listener.onLongClick(movie);
        }
        return listenerOnLongClickMovie;
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): listener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}