package com.charlsgod.moviestest.ui.common;

import java.lang.System;

/**
 * Adapter for the list of movies.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/charlsgod/moviestest/ui/common/MovieAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/charlsgod/moviestest/model/Movie;", "Lcom/charlsgod/moviestest/ui/common/MovieViewHolder;", "listener", "Lcom/charlsgod/moviestest/ui/common/MovieAdapter$MovieAdapterListener;", "(Lcom/charlsgod/moviestest/ui/common/MovieAdapter$MovieAdapterListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "MovieAdapterListener", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.ListAdapter<com.charlsgod.moviestest.model.Movie, com.charlsgod.moviestest.ui.common.MovieViewHolder> {
    private final com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener listener = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.charlsgod.moviestest.model.Movie> DIFF_CALLBACK = null;
    public static final com.charlsgod.moviestest.ui.common.MovieAdapter.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.charlsgod.moviestest.ui.common.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.ui.common.MovieViewHolder holder, int position) {
    }
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    com.charlsgod.moviestest.ui.common.MovieAdapter.MovieAdapterListener listener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/charlsgod/moviestest/ui/common/MovieAdapter$MovieAdapterListener;", "", "onClick", "", "view", "Landroid/view/View;", "movie", "Lcom/charlsgod/moviestest/model/Movie;", "onLongClick", "", "app_debug"})
    public static abstract interface MovieAdapterListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        com.charlsgod.moviestest.model.Movie movie);
        
        public abstract boolean onLongClick(@org.jetbrains.annotations.NotNull()
        com.charlsgod.moviestest.model.Movie movie);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/charlsgod/moviestest/ui/common/MovieAdapter$Companion;", "", "()V", "DIFF_CALLBACK", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/charlsgod/moviestest/model/Movie;", "getDIFF_CALLBACK", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.charlsgod.moviestest.model.Movie> getDIFF_CALLBACK() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}