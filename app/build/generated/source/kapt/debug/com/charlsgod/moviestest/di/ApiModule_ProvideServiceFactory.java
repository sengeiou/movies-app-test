package com.charlsgod.moviestest.di;

import com.charlsgod.moviestest.api.MoviesService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideServiceFactory implements Factory<MoviesService> {
  private final Provider<Retrofit> retrofitProvider;

  public ApiModule_ProvideServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public MoviesService get() {
    return provideService(retrofitProvider.get());
  }

  public static ApiModule_ProvideServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new ApiModule_ProvideServiceFactory(retrofitProvider);
  }

  public static MoviesService provideService(Retrofit retrofit) {
    return Preconditions.checkNotNull(ApiModule.INSTANCE.provideService(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
