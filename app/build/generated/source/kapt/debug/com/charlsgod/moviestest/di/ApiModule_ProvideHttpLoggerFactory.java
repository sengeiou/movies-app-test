package com.charlsgod.moviestest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.logging.HttpLoggingInterceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideHttpLoggerFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return provideHttpLogger();
  }

  public static ApiModule_ProvideHttpLoggerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor provideHttpLogger() {
    return Preconditions.checkNotNull(ApiModule.INSTANCE.provideHttpLogger(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final ApiModule_ProvideHttpLoggerFactory INSTANCE = new ApiModule_ProvideHttpLoggerFactory();
  }
}
