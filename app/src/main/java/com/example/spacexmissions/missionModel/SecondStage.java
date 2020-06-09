package com.example.spacexmissions.missionModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecondStage {

    @SerializedName("block")
    @Expose
    private int block;
    @SerializedName("payloads")
    @Expose
    private List<Payload> payloads = null;

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public SecondStage withBlock(int block) {
        this.block = block;
        return this;
    }

    public List<Payload> getPayloads() {
        return payloads;
    }

    public void setPayloads(List<Payload> payloads) {
        this.payloads = payloads;
    }

    public SecondStage withPayloads(List<Payload> payloads) {
        this.payloads = payloads;
        return this;
    }

}