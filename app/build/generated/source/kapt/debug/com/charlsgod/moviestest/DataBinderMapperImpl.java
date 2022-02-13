package com.charlsgod.moviestest;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.charlsgod.moviestest.databinding.ActivityMainBindingImpl;
import com.charlsgod.moviestest.databinding.AppBarMainBindingImpl;
import com.charlsgod.moviestest.databinding.ContentMainBindingImpl;
import com.charlsgod.moviestest.databinding.ContentMovieBindingImpl;
import com.charlsgod.moviestest.databinding.FragmentDetailBindingImpl;
import com.charlsgod.moviestest.databinding.FragmentFavouritesBindingImpl;
import com.charlsgod.moviestest.databinding.FragmentSearchBindingImpl;
import com.charlsgod.moviestest.databinding.ItemMovieBindingImpl;
import com.charlsgod.moviestest.databinding.LoadingStateBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_APPBARMAIN = 2;

  private static final int LAYOUT_CONTENTMAIN = 3;

  private static final int LAYOUT_CONTENTMOVIE = 4;

  private static final int LAYOUT_FRAGMENTDETAIL = 5;

  private static final int LAYOUT_FRAGMENTFAVOURITES = 6;

  private static final int LAYOUT_FRAGMENTSEARCH = 7;

  private static final int LAYOUT_ITEMMOVIE = 8;

  private static final int LAYOUT_LOADINGSTATE = 9;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(9);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.app_bar_main, LAYOUT_APPBARMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.content_main, LAYOUT_CONTENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.content_movie, LAYOUT_CONTENTMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.fragment_favourites, LAYOUT_FRAGMENTFAVOURITES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.item_movie, LAYOUT_ITEMMOVIE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.charlsgod.moviestest.R.layout.loading_state, LAYOUT_LOADINGSTATE);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_APPBARMAIN: {
          if ("layout/app_bar_main_0".equals(tag)) {
            return new AppBarMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for app_bar_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMAIN: {
          if ("layout/content_main_0".equals(tag)) {
            return new ContentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMOVIE: {
          if ("layout/content_movie_0".equals(tag)) {
            return new ContentMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVOURITES: {
          if ("layout/fragment_favourites_0".equals(tag)) {
            return new FragmentFavouritesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favourites is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIE: {
          if ("layout/item_movie_0".equals(tag)) {
            return new ItemMovieBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADINGSTATE: {
          if ("layout/loading_state_0".equals(tag)) {
            return new LoadingStateBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loading_state is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "listener");
      sKeys.put(2, "movie");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(9);

    static {
      sKeys.put("layout/activity_main_0", com.charlsgod.moviestest.R.layout.activity_main);
      sKeys.put("layout/app_bar_main_0", com.charlsgod.moviestest.R.layout.app_bar_main);
      sKeys.put("layout/content_main_0", com.charlsgod.moviestest.R.layout.content_main);
      sKeys.put("layout/content_movie_0", com.charlsgod.moviestest.R.layout.content_movie);
      sKeys.put("layout/fragment_detail_0", com.charlsgod.moviestest.R.layout.fragment_detail);
      sKeys.put("layout/fragment_favourites_0", com.charlsgod.moviestest.R.layout.fragment_favourites);
      sKeys.put("layout/fragment_search_0", com.charlsgod.moviestest.R.layout.fragment_search);
      sKeys.put("layout/item_movie_0", com.charlsgod.moviestest.R.layout.item_movie);
      sKeys.put("layout/loading_state_0", com.charlsgod.moviestest.R.layout.loading_state);
    }
  }
}
