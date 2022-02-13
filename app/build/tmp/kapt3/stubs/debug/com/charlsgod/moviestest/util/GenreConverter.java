package com.charlsgod.moviestest.util;

import java.lang.System;

/**
 * Converts the Genre lists to String, so the DB knows how to insert it.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u0018\u0010\n\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0007J\u001a\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/charlsgod/moviestest/util/GenreConverter;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "genreListToString", "", "genreIds", "", "", "genreNameListToString", "stringToGenreList", "json", "stringToGenreNameList", "app_debug"})
public final class GenreConverter {
    private final com.squareup.moshi.Moshi moshi = null;
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String genreListToString(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.Integer> genreIds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<java.lang.Integer> stringToGenreList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String genreNameListToString(@org.jetbrains.annotations.Nullable()
    java.util.List<java.lang.String> genreIds) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<java.lang.String> stringToGenreNameList(@org.jetbrains.annotations.Nullable()
    java.lang.String json) {
        return null;
    }
    
    public GenreConverter() {
        super();
    }
}