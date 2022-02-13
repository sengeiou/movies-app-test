package com.charlsgod.moviestest.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u001c\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0007\u001a\u001c\u0010\u000b\u001a\u00020\u0001*\u00020\f2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tH\u0007\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0016\u0010\u000f\u001a\u00020\u0001*\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u000eH\u0007\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007\u00a2\u0006\u0002\u0010\u0018\u001a\"\u0010\u0019\u001a\u00020\u0001*\u00020\u00072\u0014\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u001bH\u0007\u001a\u0016\u0010\u001c\u001a\u00020\u0001*\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0007\u001a\u0014\u0010\u001e\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0014\u0010\u001f\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0007\u001a\u0014\u0010\"\u001a\u00020\u0001*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0007\u001a\u0014\u0010$\u001a\u00020\u0001*\u00020\u00032\u0006\u0010%\u001a\u00020\u0005H\u0007\u00a8\u0006&"}, d2 = {"showHide", "", "view", "Landroid/view/View;", "show", "", "bindFavouriteList", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/charlsgod/moviestest/model/Movie;", "bindGenres", "Landroid/widget/TextView;", "genres", "", "bindImage", "Landroid/widget/ImageButton;", "gridColumnCount", "", "Landroid/widget/ImageView;", "posterPath", "bindRating", "rating", "", "(Landroid/widget/TextView;Ljava/lang/Double;)V", "bindRecyclerView", "result", "Lcom/charlsgod/moviestest/util/Resource;", "bindReleaseDate", "releaseDate", "layoutManager", "setError", "Landroid/widget/EditText;", "isNullOrEmpty", "setIcon", "isFavourite", "showKeyboard", "isTyping", "app_debug"})
public final class BindingUtilKt {
    
    /**
     * Binding adapter used to to display movie poster with Glide.
     */
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$bindImage, @org.jetbrains.annotations.Nullable()
    java.lang.String posterPath) {
    }
    
    /**
     * Binding adapter used to to display year of release.
     */
    @androidx.databinding.BindingAdapter(value = {"dateFormatted"})
    public static final void bindReleaseDate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindReleaseDate, @org.jetbrains.annotations.Nullable()
    java.lang.String releaseDate) {
    }
    
    /**
     * Binding adapter used to to display movie's genre(s).
     */
    @kotlin.ExperimentalStdlibApi()
    @androidx.databinding.BindingAdapter(value = {"genres"})
    public static final void bindGenres(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindGenres, @org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> genres) {
    }
    
    /**
     * Binding adapter used to display a movie rating in the 0-10 scale.
     */
    @androidx.databinding.BindingAdapter(value = {"rating"})
    public static final void bindRating(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindRating, @org.jetbrains.annotations.Nullable()
    java.lang.Double rating) {
    }
    
    /**
     * Binding adapter used to load a correct icon to the [ImageButton] in the
     * detailToolbar enabling saving or removing a movie from the list of favourite.
     */
    @androidx.databinding.BindingAdapter(value = {"actionIcon"})
    public static final void setIcon(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton $this$setIcon, boolean isFavourite) {
    }
    
    /**
     * Binding adapter used to submit list of  searchedMovies to the [MovieAdapter].
     */
    @androidx.databinding.BindingAdapter(value = {"movieListData"})
    public static final void bindRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindRecyclerView, @org.jetbrains.annotations.Nullable()
    com.charlsgod.moviestest.util.Resource<? extends java.util.List<com.charlsgod.moviestest.model.Movie>> result) {
    }
    
    /**
     * Binding adapter used to submit list of favourite movies to the [MovieAdapter].
     */
    @androidx.databinding.BindingAdapter(value = {"favouriteListData"})
    public static final void bindFavouriteList(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindFavouriteList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.charlsgod.moviestest.model.Movie> list) {
    }
    
    /**
     * Binding adapter used to to display an error
     * message on an attempt to submit an empty query.
     */
    @androidx.databinding.BindingAdapter(value = {"errorMessage"})
    public static final void setError(@org.jetbrains.annotations.NotNull()
    android.widget.EditText $this$setError, boolean isNullOrEmpty) {
    }
    
    /**
     * Binding adapter used to manage keyboard and focus.
     */
    @androidx.databinding.BindingAdapter(value = {"showSoftInput"})
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$showKeyboard, boolean isTyping) {
    }
    
    /**
     * Binding adapter used to set the Layout Manager
     * with appropriate column count.
     */
    @androidx.databinding.BindingAdapter(value = {"gridColumnCount"})
    public static final void layoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$layoutManager, int gridColumnCount) {
    }
    
    /**
     * Binding adapter used to manage visibility
     * of the loading state layout.
     */
    @androidx.databinding.BindingAdapter(value = {"visibility"})
    public static final void showHide(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean show) {
    }
    
    /**
     * Binding adapter used to set an appropriate action_layout icon
     * in the HomeFragment menu.
     *
     * If the current grid column count is set to 1, then the MenuItem
     * action_layout's icon is displayed as ic_grid, giving the option
     * to change the layout to the grid. In the opposite case the icon
     * will be displayed as the ic_list.
     */
    @androidx.databinding.BindingAdapter(value = {"layoutActionIcon"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageButton $this$bindImage, int gridColumnCount) {
    }
}