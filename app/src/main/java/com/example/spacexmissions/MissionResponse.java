package com.example.spacexmissions;

import com.example.spacexmissions.missionModel.LaunchSite;
import com.example.spacexmissions.missionModel.Links;
import com.example.spacexmissions.missionModel.Mission;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

class MissionResponse {


    public Mission missions;
    public int flight_number;
    public String mission_name;
    public LaunchSite launch_site;
    public Links links;

    public String details;

    @JsonProperty("missions")
    public Mission getMissions(){
        Mission mission = new Mission();
        mission.setFlightNumber(flight_number);
        mission.setMissionName(mission_name);
        mission.setLaunchSite(launch_site);
        mission.setLinks(links);
        return new Mission();
    }



}
