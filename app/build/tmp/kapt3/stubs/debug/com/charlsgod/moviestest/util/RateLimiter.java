package com.charlsgod.moviestest.util;

import java.lang.System;

/**
 * Utility class that decides whether we should fetch some data or not.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\bH\u0002J\u0013\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0003\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\nX\u0088\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/charlsgod/moviestest/util/RateLimiter;", "KEY", "", "timeout", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(ILjava/util/concurrent/TimeUnit;)V", "", "timestamps", "Landroidx/collection/ArrayMap;", "now", "reset", "", "key", "(Ljava/lang/Object;)V", "shouldFetch", "", "(Ljava/lang/Object;)Z", "app_debug"})
public final class RateLimiter<KEY extends java.lang.Object> {
    private final androidx.collection.ArrayMap<KEY, java.lang.Long> timestamps = null;
    private final long timeout = 0L;
    
    public final synchronized boolean shouldFetch(KEY key) {
        return false;
    }
    
    private final long now() {
        return 0L;
    }
    
    public final synchronized void reset(KEY key) {
    }
    
    public RateLimiter(int timeout, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        super();
    }
}