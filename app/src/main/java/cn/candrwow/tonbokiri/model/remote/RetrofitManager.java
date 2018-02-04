package cn.candrwow.tonbokiri.model.remote;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author candrwow
 */
public class RetrofitManager {

    Retrofit retrofit;
    final String BASE_URL = "https://api.vultr.com/";

    private RetrofitManager() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    private static class SingletonInstance {
        private static final RetrofitManager INSTANCE = new RetrofitManager();
    }

    public static RetrofitManager getInstance() {
        return SingletonInstance.INSTANCE;
    }
}