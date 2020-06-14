package com.example.spacexmissions.model;

import com.example.spacexmissions.missionModel.LaunchSite;
import com.example.spacexmissions.missionModel.Links;
import com.example.spacexmissions.missionModel.Mission;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MissionResponse {


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

   // private class

    public int getFlight_number() {
        return flight_number;
    }

    public String getMission_name() {
        return mission_name;
    }

    public LaunchSite getLaunch_site() {
        return launch_site;
    }

    public Links getLinks() {
        return links;
    }

    public String getDetails() {
        return details;
    }
}
