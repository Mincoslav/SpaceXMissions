package com.example.spacexmissions;


import com.example.spacexmissions.missionModel.Mission;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface MissionApi {

    @GET("/v3/launches/{flight_number}")
    Call<MissionResponse> MISSION_RESPONSE_CALL(@Path("flight_number") int flightNumber);

}
