package com.charlsgod.moviestest;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/charlsgod/moviestest/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "drawerLayout", "Landroidx/drawerlayout/widget/DrawerLayout;", "navController", "Landroidx/navigation/NavController;", "navView", "Lcom/google/android/material/navigation/NavigationView;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestinationChanged", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "onSupportNavigateUp", "", "setupMode", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private androidx.navigation.NavController navController;
    private com.google.android.material.navigation.NavigationView navView;
    private androidx.drawerlayout.widget.DrawerLayout drawerLayout;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    /**
     * The default toolbar is hidden from the HomeFragment,
     * SearchFragment and DetailFragment since there are
     * customized toolbars in those fragments.
     */
    private final void onDestinationChanged(androidx.appcompat.widget.Toolbar toolbar) {
    }
    
    /**
     * Setup night mode.
     */
    private final void setupMode() {
    }
    
    public MainActivity() {
        super();
    }
}