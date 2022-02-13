package com.charlsgod.moviestest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> okHttpLoggerProvider;

  private final Provider<Interceptor> okHttpNetworkInterceptorProvider;

  public ApiModule_ProvideOkHttpClientFactory(Provider<HttpLoggingInterceptor> okHttpLoggerProvider,
      Provider<Interceptor> okHttpNetworkInterceptorProvider) {
    this.okHttpLoggerProvider = okHttpLoggerProvider;
    this.okHttpNetworkInterceptorProvider = okHttpNetworkInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(okHttpLoggerProvider.get(), okHttpNetworkInterceptorProvider.get());
  }

  public static ApiModule_ProvideOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> okHttpLoggerProvider,
      Provider<Interceptor> okHttpNetworkInterceptorProvider) {
    return new ApiModule_ProvideOkHttpClientFactory(okHttpLoggerProvider, okHttpNetworkInterceptorProvider);
  }

  public static OkHttpClient provideOkHttpClient(HttpLoggingInterceptor okHttpLogger,
      Interceptor okHttpNetworkInterceptor) {
    return Preconditions.checkNotNull(ApiModule.INSTANCE.provideOkHttpClient(okHttpLogger, okHttpNetworkInterceptor), "Cannot return null from a non-@Nullable @Provides method");
  }
}
