package com.example.spacexmissions;


import retrofit2.Call;
import retrofit2.http.GET;

public interface MissionApi {

    @GET("/v3/launches?tbd=false&launch_year=2020")
    Call<MissionResponse> getMissions();

}
