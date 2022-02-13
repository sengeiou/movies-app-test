package com.charlsgod.moviestest.di;

import com.squareup.moshi.Moshi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<OkHttpClient> clientProvider;

  private final Provider<Moshi> moshiProvider;

  public ApiModule_ProvideRetrofitFactory(Provider<OkHttpClient> clientProvider,
      Provider<Moshi> moshiProvider) {
    this.clientProvider = clientProvider;
    this.moshiProvider = moshiProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(clientProvider.get(), moshiProvider.get());
  }

  public static ApiModule_ProvideRetrofitFactory create(Provider<OkHttpClient> clientProvider,
      Provider<Moshi> moshiProvider) {
    return new ApiModule_ProvideRetrofitFactory(clientProvider, moshiProvider);
  }

  public static Retrofit provideRetrofit(OkHttpClient client, Moshi moshi) {
    return Preconditions.checkNotNull(ApiModule.INSTANCE.provideRetrofit(client, moshi), "Cannot return null from a non-@Nullable @Provides method");
  }
}
