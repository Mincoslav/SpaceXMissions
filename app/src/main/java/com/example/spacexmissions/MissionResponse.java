package com.example.spacexmissions;

import com.example.spacexmissions.missionModel.Mission;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

class MissionResponse {


    private Mission missions;

    @JsonProperty("missions")
    public Mission getMissions(){
        return new Mission();
    }

}
