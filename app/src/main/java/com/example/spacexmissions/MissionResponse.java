package com.example.spacexmissions;

import java.util.ArrayList;
import java.util.List;

class MissionResponse {

    private String mission_name;

    private int flight_number; //ID

    private boolean launch_success;

    private String details;

    ArrayList<Mission> missions = new ArrayList<>();

    public ArrayList<Mission> getMission(){
        return missions;
    }
}
