package com.charlsgod.moviestest;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.charlsgod.moviestest.api.MoviesService;
import com.charlsgod.moviestest.db.MoviesDatabase;
import com.charlsgod.moviestest.di.ApiModule;
import com.charlsgod.moviestest.di.ApiModule_ProvideHttpLoggerFactory;
import com.charlsgod.moviestest.di.ApiModule_ProvideMoshiFactory;
import com.charlsgod.moviestest.di.ApiModule_ProvideOkHttpClientFactory;
import com.charlsgod.moviestest.di.ApiModule_ProvideOkHttpNetworkInterceptorFactory;
import com.charlsgod.moviestest.di.ApiModule_ProvideRetrofitFactory;
import com.charlsgod.moviestest.di.ApiModule_ProvideServiceFactory;
import com.charlsgod.moviestest.di.DatabaseModule;
import com.charlsgod.moviestest.di.DatabaseModule_ProvideDatabaseFactory;
import com.charlsgod.moviestest.di.RepoModule;
import com.charlsgod.moviestest.di.RepoModule_ProvideRepositoryFactory;
import com.charlsgod.moviestest.repository.MovieRepository;
import com.charlsgod.moviestest.ui.SettingsFragment;
import com.charlsgod.moviestest.ui.detail.DetailFragment;
import com.charlsgod.moviestest.ui.detail.DetailViewModel_AssistedFactory;
import com.charlsgod.moviestest.ui.detail.DetailViewModel_AssistedFactory_Factory;
import com.charlsgod.moviestest.ui.favourites.FavouritesFragment;
import com.charlsgod.moviestest.ui.favourites.FavouritesViewModel_AssistedFactory;
import com.charlsgod.moviestest.ui.favourites.FavouritesViewModel_AssistedFactory_Factory;
import com.charlsgod.moviestest.ui.search.SearchFragment;
import com.charlsgod.moviestest.ui.search.SearchViewModel_AssistedFactory;
import com.charlsgod.moviestest.ui.search.SearchViewModel_AssistedFactory_Factory;
import com.squareup.moshi.Moshi;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMoviesApp_HiltComponents_SingletonC extends MoviesApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object httpLoggingInterceptor = new MemoizedSentinel();

  private volatile Object interceptor = new MemoizedSentinel();

  private volatile Object okHttpClient = new MemoizedSentinel();

  private volatile Object moshi = new MemoizedSentinel();

  private volatile Object retrofit = new MemoizedSentinel();

  private volatile Object moviesService = new MemoizedSentinel();

  private volatile Object moviesDatabase = new MemoizedSentinel();

  private volatile Object movieRepository = new MemoizedSentinel();

  private volatile Provider<MovieRepository> provideRepositoryProvider;

  private DaggerMoviesApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private HttpLoggingInterceptor getHttpLoggingInterceptor() {
    Object local = httpLoggingInterceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = httpLoggingInterceptor;
        if (local instanceof MemoizedSentinel) {
          local = ApiModule_ProvideHttpLoggerFactory.provideHttpLogger();
          httpLoggingInterceptor = DoubleCheck.reentrantCheck(httpLoggingInterceptor, local);
        }
      }
    }
    return (HttpLoggingInterceptor) local;
  }

  private Interceptor getInterceptor() {
    Object local = interceptor;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = interceptor;
        if (local instanceof MemoizedSentinel) {
          local = ApiModule_ProvideOkHttpNetworkInterceptorFactory.provideOkHttpNetworkInterceptor();
          interceptor = DoubleCheck.reentrantCheck(interceptor, local);
        }
      }
    }
    return (Interceptor) local;
  }

  private OkHttpClient getOkHttpClient() {
    Object local = okHttpClient;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = okHttpClient;
        if (local instanceof MemoizedSentinel) {
          local = ApiModule_ProvideOkHttpClientFactory.provideOkHttpClient(getHttpLoggingInterceptor(), getInterceptor());
          okHttpClient = DoubleCheck.reentrantCheck(okHttpClient, local);
        }
      }
    }
    return (OkHttpClient) local;
  }

  private Moshi getMoshi() {
    Object local = moshi;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moshi;
        if (local instanceof MemoizedSentinel) {
          local = ApiModule_ProvideMoshiFactory.provideMoshi();
          moshi = DoubleCheck.reentrantCheck(moshi, local);
        }
      }
    }
    return (Moshi) local;
  }

  private Retrofit getRetrofit() {
    Object local = retrofit;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofit;
        if (local instanceof MemoizedSentinel) {
          local = ApiModule_ProvideRetrofitFactory.provideRetrofit(getOkHttpClient(), getMoshi());
          retrofit = DoubleCheck.reentrantCheck(retrofit, local);
        }
      }
    }
    return (Retrofit) local;
  }

  private MoviesService getMoviesService() {
    Object local = moviesService;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moviesService;
        if (local instanceof MemoizedSentinel) {
          local = ApiModule_ProvideServiceFactory.provideService(getRetrofit());
          moviesService = DoubleCheck.reentrantCheck(moviesService, local);
        }
      }
    }
    return (MoviesService) local;
  }

  private MoviesDatabase getMoviesDatabase() {
    Object local = moviesDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = moviesDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          moviesDatabase = DoubleCheck.reentrantCheck(moviesDatabase, local);
        }
      }
    }
    return (MoviesDatabase) local;
  }

  private MovieRepository getMovieRepository() {
    Object local = movieRepository;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = movieRepository;
        if (local instanceof MemoizedSentinel) {
          local = RepoModule_ProvideRepositoryFactory.provideRepository(getMoviesService(), getMoviesDatabase());
          movieRepository = DoubleCheck.reentrantCheck(movieRepository, local);
        }
      }
    }
    return (MovieRepository) local;
  }

  private Provider<MovieRepository> getMovieRepositoryProvider() {
    Object local = provideRepositoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      provideRepositoryProvider = (Provider<MovieRepository>) local;
    }
    return (Provider<MovieRepository>) local;
  }

  @Override
  public void injectMoviesApp(MoviesApp moviesApp) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder apiModule(ApiModule apiModule) {
      Preconditions.checkNotNull(apiModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder repoModule(RepoModule repoModule) {
      Preconditions.checkNotNull(repoModule);
      return this;
    }

    public MoviesApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerMoviesApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements MoviesApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public MoviesApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends MoviesApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements MoviesApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public MoviesApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends MoviesApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<DetailViewModel_AssistedFactory> detailViewModel_AssistedFactoryProvider;

      private volatile Provider<FavouritesViewModel_AssistedFactory> favouritesViewModel_AssistedFactoryProvider;

      private volatile Provider<SearchViewModel_AssistedFactory> searchViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private DetailViewModel_AssistedFactory getDetailViewModel_AssistedFactory() {
        return DetailViewModel_AssistedFactory_Factory.newInstance(DaggerMoviesApp_HiltComponents_SingletonC.this.getMovieRepositoryProvider());
      }

      private Provider<DetailViewModel_AssistedFactory> getDetailViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          detailViewModel_AssistedFactoryProvider = (Provider<DetailViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailViewModel_AssistedFactory>) local;
      }

      private FavouritesViewModel_AssistedFactory getFavouritesViewModel_AssistedFactory() {
        return FavouritesViewModel_AssistedFactory_Factory.newInstance(DaggerMoviesApp_HiltComponents_SingletonC.this.getMovieRepositoryProvider());
      }

      private Provider<FavouritesViewModel_AssistedFactory> getFavouritesViewModel_AssistedFactoryProvider(
          ) {
        Object local = favouritesViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          favouritesViewModel_AssistedFactoryProvider = (Provider<FavouritesViewModel_AssistedFactory>) local;
        }
        return (Provider<FavouritesViewModel_AssistedFactory>) local;
      }

      private SearchViewModel_AssistedFactory getSearchViewModel_AssistedFactory() {
        return SearchViewModel_AssistedFactory_Factory.newInstance(DaggerMoviesApp_HiltComponents_SingletonC.this.getMovieRepositoryProvider());
      }

      private Provider<SearchViewModel_AssistedFactory> getSearchViewModel_AssistedFactoryProvider(
          ) {
        Object local = searchViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          searchViewModel_AssistedFactoryProvider = (Provider<SearchViewModel_AssistedFactory>) local;
        }
        return (Provider<SearchViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(3).put("com.charlsgod.moviestest.ui.detail.DetailViewModel", (Provider) getDetailViewModel_AssistedFactoryProvider()).put("com.charlsgod.moviestest.ui.favourites.FavouritesViewModel", (Provider) getFavouritesViewModel_AssistedFactoryProvider()).put("com.charlsgod.moviestest.ui.search.SearchViewModel", (Provider) getSearchViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMoviesApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements MoviesApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public MoviesApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends MoviesApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerMoviesApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectSettingsFragment(SettingsFragment settingsFragment) {
        }

        @Override
        public void injectDetailFragment(DetailFragment detailFragment) {
        }

        @Override
        public void injectFavouritesFragment(FavouritesFragment favouritesFragment) {
        }

        @Override
        public void injectSearchFragment(SearchFragment searchFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements MoviesApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public MoviesApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends MoviesApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements MoviesApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public MoviesApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends MoviesApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.charlsgod.moviestest.ui.detail.DetailViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailViewModel_AssistedFactory();

            case 1: // com.charlsgod.moviestest.ui.favourites.FavouritesViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFavouritesViewModel_AssistedFactory();

            case 2: // com.charlsgod.moviestest.ui.search.SearchViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getSearchViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements MoviesApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public MoviesApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends MoviesApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.charlsgod.moviestest.repository.MovieRepository 
        return (T) DaggerMoviesApp_HiltComponents_SingletonC.this.getMovieRepository();

        default: throw new AssertionError(id);
      }
    }
  }
}
