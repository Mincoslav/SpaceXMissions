package com.example.spacexmissions.missionModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FirstStage {

    @SerializedName("cores")
    @Expose
    private List<Core> cores = null;

    public List<Core> getCores() {
        return cores;
    }

    public void setCores(List<Core> cores) {
        this.cores = cores;
    }

    public FirstStage withCores(List<Core> cores) {
        this.cores = cores;
        return this;
    }

}