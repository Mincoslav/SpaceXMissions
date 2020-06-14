package com.example.spacexmissions.model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MissionApi {

    @GET("/v3/launches/{flight_number}")
    Call<MissionResponse> MISSION_RESPONSE_CALL(@Path("flight_number") int flightNumber);

}
