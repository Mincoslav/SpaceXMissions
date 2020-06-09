package com.example.spacexmissions;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class ServiceGenerator {

    private static HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

    private static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build();

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com")
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient);


    /*private static Retrofit retrofitBuilder = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com")
            .addConverterFactory(JacksonConverterFactory.create())
            .client(okHttpClient)
            .build();
    */
    //  .addConverterFactory().client(okHttpClient);

    private static Retrofit retrofit = retrofitBuilder.build();
    private static MissionApi missionApi = retrofit.create(MissionApi.class);

    public static MissionApi getMissionApi(){
        return missionApi;
    }
}
