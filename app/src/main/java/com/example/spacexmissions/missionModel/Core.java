package com.example.spacexmissions.missionModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Core {

    @SerializedName("core_serial")
    @Expose
    private String coreSerial;
    @SerializedName("flight")
    @Expose
    private int flight;
    @SerializedName("block")
    @Expose
    private int block;
    @SerializedName("gridfins")
    @Expose
    private boolean gridfins;
    @SerializedName("legs")
    @Expose
    private boolean legs;
    @SerializedName("reused")
    @Expose
    private boolean reused;
    @SerializedName("land_success")
    @Expose
    private boolean landSuccess;
    @SerializedName("landing_intent")
    @Expose
    private boolean landingIntent;
    @SerializedName("landing_type")
    @Expose
    private String landingType;
    @SerializedName("landing_vehicle")
    @Expose
    private String landingVehicle;

    public String getCoreSerial() {
        return coreSerial;
    }

    public void setCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
    }

    public Core withCoreSerial(String coreSerial) {
        this.coreSerial = coreSerial;
        return this;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public Core withFlight(int flight) {
        this.flight = flight;
        return this;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public Core withBlock(int block) {
        this.block = block;
        return this;
    }

    public boolean isGridfins() {
        return gridfins;
    }

    public void setGridfins(boolean gridfins) {
        this.gridfins = gridfins;
    }

    public Core withGridfins(boolean gridfins) {
        this.gridfins = gridfins;
        return this;
    }

    public boolean isLegs() {
        return legs;
    }

    public void setLegs(boolean legs) {
        this.legs = legs;
    }

    public Core withLegs(boolean legs) {
        this.legs = legs;
        return this;
    }

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public Core withReused(boolean reused) {
        this.reused = reused;
        return this;
    }

    public boolean isLandSuccess() {
        return landSuccess;
    }

    public void setLandSuccess(boolean landSuccess) {
        this.landSuccess = landSuccess;
    }

    public Core withLandSuccess(boolean landSuccess) {
        this.landSuccess = landSuccess;
        return this;
    }

    public boolean isLandingIntent() {
        return landingIntent;
    }

    public void setLandingIntent(boolean landingIntent) {
        this.landingIntent = landingIntent;
    }

    public Core withLandingIntent(boolean landingIntent) {
        this.landingIntent = landingIntent;
        return this;
    }

    public String getLandingType() {
        return landingType;
    }

    public void setLandingType(String landingType) {
        this.landingType = landingType;
    }

    public Core withLandingType(String landingType) {
        this.landingType = landingType;
        return this;
    }

    public String getLandingVehicle() {
        return landingVehicle;
    }

    public void setLandingVehicle(String landingVehicle) {
        this.landingVehicle = landingVehicle;
    }

    public Core withLandingVehicle(String landingVehicle) {
        this.landingVehicle = landingVehicle;
        return this;
    }

}