package com.example.spacexmissions.missionModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Telemetry {

    @SerializedName("flight_club")
    @Expose
    private Object flightClub;

    public Object getFlightClub() {
        return flightClub;
    }

    public void setFlightClub(Object flightClub) {
        this.flightClub = flightClub;
    }

    public Telemetry withFlightClub(Object flightClub) {
        this.flightClub = flightClub;
        return this;
    }

}