package com.charlsgod.moviestest.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/charlsgod/moviestest/util/SortUtil;", "", "()V", "Companion", "app_debug"})
public final class SortUtil {
    public static final com.charlsgod.moviestest.util.SortUtil.Companion Companion = null;
    
    public SortUtil() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/charlsgod/moviestest/util/SortUtil$Companion;", "", "()V", "getAllQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "sortBy", "Lcom/charlsgod/moviestest/util/SortUtil$Companion$MovieSortType;", "getSortColumn", "", "value", "MovieSortType", "app_debug"})
    public static final class Companion {
        
        /**
         * A raw query at runtime to oder by column
         * for getting all the favourite movies sorted.
         */
        @org.jetbrains.annotations.NotNull()
        public final androidx.sqlite.db.SimpleSQLiteQuery getAllQuery(@org.jetbrains.annotations.NotNull()
        com.charlsgod.moviestest.util.SortUtil.Companion.MovieSortType sortBy) {
            return null;
        }
        
        /**
         * Get a column name in from a preference value.
         */
        private final java.lang.String getSortColumn(com.charlsgod.moviestest.util.SortUtil.Companion.MovieSortType value) {
            return null;
        }
        
        private Companion() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/charlsgod/moviestest/util/SortUtil$Companion$MovieSortType;", "", "(Ljava/lang/String;I)V", "POPULARITY", "RATING", "app_debug"})
        public static enum MovieSortType {
            /*public static final*/ POPULARITY /* = new POPULARITY() */,
            /*public static final*/ RATING /* = new RATING() */;
            
            MovieSortType() {
            }
        }
    }
}