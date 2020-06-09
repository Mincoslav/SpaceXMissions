package com.example.spacexmissions;


import com.example.spacexmissions.missionModel.Mission;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MissionApi {

    @GET("/v3/launches/latest")
    Call<MissionResponse> MISSION_RESPONSE_CALL();

}
