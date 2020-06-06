package com.example.spacexmissions;

import java.util.ArrayList;
import java.util.List;

class MissionResponse {

    private String mission_name;

    private int flight_number; //ID

    private boolean launch_success;

    private String details;

    private Links links;

    ArrayList<Mission> missions = new ArrayList<>();

    public ArrayList<Mission> getMission(){
        return missions;
    }

    private class Links {
        private String mission_patch;
        private String mission_patch_small;
    }
}
