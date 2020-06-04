package com.example.spacexmissions;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceGenerator {

    private static Retrofit.Builder retrofitBuilder = new Retrofit.Builder()
            .baseUrl("https://api.spacexdata.com")
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = retrofitBuilder.build();

    private static MissionApi missionApi = retrofit.create(MissionApi.class);

    public static MissionApi getMissionApi(){
        return missionApi;
    }
}
