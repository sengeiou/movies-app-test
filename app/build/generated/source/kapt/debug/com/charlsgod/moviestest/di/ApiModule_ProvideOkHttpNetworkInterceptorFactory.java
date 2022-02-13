package com.charlsgod.moviestest.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.Interceptor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideOkHttpNetworkInterceptorFactory implements Factory<Interceptor> {
  @Override
  public Interceptor get() {
    return provideOkHttpNetworkInterceptor();
  }

  public static ApiModule_ProvideOkHttpNetworkInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Interceptor provideOkHttpNetworkInterceptor() {
    return Preconditions.checkNotNull(ApiModule.INSTANCE.provideOkHttpNetworkInterceptor(), "Cannot return null from a non-@Nullable @Provides method");
  }

  private static final class InstanceHolder {
    private static final ApiModule_ProvideOkHttpNetworkInterceptorFactory INSTANCE = new ApiModule_ProvideOkHttpNetworkInterceptorFactory();
  }
}
