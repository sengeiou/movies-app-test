package com.charlsgod.moviestest.util;

import java.lang.System;

/**
 * A lifecycle-aware observable that sends only new updates after
 * subscription, used for events like navigation. This avoids a
 * common problem with events like on configuration change.
 *
 * An [Observer] for [SingleEvent]s, simplifying the pattern of
 * checking if the [SingleEvent]'s content has already been handled.
 */
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0004J\r\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\fR\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0005R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/charlsgod/moviestest/util/SingleEvent;", "T", "", "content", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "<set-?>", "", "hasBeenHandled", "getHasBeenHandled", "()Z", "getContentIfNotHandled", "()Ljava/lang/Object;", "app_debug"})
public class SingleEvent<T extends java.lang.Object> {
    private boolean hasBeenHandled = false;
    private final T content = null;
    
    public final boolean getHasBeenHandled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getContentIfNotHandled() {
        return null;
    }
    
    public SingleEvent(T content) {
        super();
    }
}