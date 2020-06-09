package com.example.spacexmissions.missionModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fairings {

    @SerializedName("reused")
    @Expose
    private boolean reused;
    @SerializedName("recovery_attempt")
    @Expose
    private boolean recoveryAttempt;
    @SerializedName("recovered")
    @Expose
    private Object recovered;
    @SerializedName("ship")
    @Expose
    private String ship;

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public Fairings withReused(boolean reused) {
        this.reused = reused;
        return this;
    }

    public boolean isRecoveryAttempt() {
        return recoveryAttempt;
    }

    public void setRecoveryAttempt(boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
    }

    public Fairings withRecoveryAttempt(boolean recoveryAttempt) {
        this.recoveryAttempt = recoveryAttempt;
        return this;
    }

    public Object getRecovered() {
        return recovered;
    }

    public void setRecovered(Object recovered) {
        this.recovered = recovered;
    }

    public Fairings withRecovered(Object recovered) {
        this.recovered = recovered;
        return this;
    }

    public String getShip() {
        return ship;
    }

    public void setShip(String ship) {
        this.ship = ship;
    }

    public Fairings withShip(String ship) {
        this.ship = ship;
        return this;
    }

}