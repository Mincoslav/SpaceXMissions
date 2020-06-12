package com.example.spacexmissions;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build();

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient);

    private static Retrofit retrofit = retrofitBuilder.build();
    private static MissionApi missionApi = retrofit.create(MissionApi.class);

    public static MissionApi getMissionApi(){
        return missionApi;
    }
}
