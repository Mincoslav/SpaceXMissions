package com.example.spacexmissions.missionModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Payload {

    @SerializedName("payload_id")
    @Expose
    private String payloadId;
    @SerializedName("norad_id")
    @Expose
    private List<Object> noradId = null;
    @SerializedName("reused")
    @Expose
    private boolean reused;
    @SerializedName("customers")
    @Expose
    private List<String> customers = null;
    @SerializedName("nationality")
    @Expose
    private String nationality;
    @SerializedName("manufacturer")
    @Expose
    private String manufacturer;
    @SerializedName("payload_type")
    @Expose
    private String payloadType;
    @SerializedName("payload_mass_kg")
    @Expose
    private int payloadMassKg;
    @SerializedName("payload_mass_lbs")
    @Expose
    private double payloadMassLbs;
    @SerializedName("orbit")
    @Expose
    private String orbit;
    @SerializedName("orbit_params")
    @Expose
    private OrbitParams orbitParams;

    public String getPayloadId() {
        return payloadId;
    }

    public void setPayloadId(String payloadId) {
        this.payloadId = payloadId;
    }

    public Payload withPayloadId(String payloadId) {
        this.payloadId = payloadId;
        return this;
    }

    public List<Object> getNoradId() {
        return noradId;
    }

    public void setNoradId(List<Object> noradId) {
        this.noradId = noradId;
    }

    public Payload withNoradId(List<Object> noradId) {
        this.noradId = noradId;
        return this;
    }

    public boolean isReused() {
        return reused;
    }

    public void setReused(boolean reused) {
        this.reused = reused;
    }

    public Payload withReused(boolean reused) {
        this.reused = reused;
        return this;
    }

    public List<String> getCustomers() {
        return customers;
    }

    public void setCustomers(List<String> customers) {
        this.customers = customers;
    }

    public Payload withCustomers(List<String> customers) {
        this.customers = customers;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Payload withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Payload withManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public String getPayloadType() {
        return payloadType;
    }

    public void setPayloadType(String payloadType) {
        this.payloadType = payloadType;
    }

    public Payload withPayloadType(String payloadType) {
        this.payloadType = payloadType;
        return this;
    }

    public int getPayloadMassKg() {
        return payloadMassKg;
    }

    public void setPayloadMassKg(int payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
    }

    public Payload withPayloadMassKg(int payloadMassKg) {
        this.payloadMassKg = payloadMassKg;
        return this;
    }

    public double getPayloadMassLbs() {
        return payloadMassLbs;
    }

    public void setPayloadMassLbs(double payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
    }

    public Payload withPayloadMassLbs(double payloadMassLbs) {
        this.payloadMassLbs = payloadMassLbs;
        return this;
    }

    public String getOrbit() {
        return orbit;
    }

    public void setOrbit(String orbit) {
        this.orbit = orbit;
    }

    public Payload withOrbit(String orbit) {
        this.orbit = orbit;
        return this;
    }

    public OrbitParams getOrbitParams() {
        return orbitParams;
    }

    public void setOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
    }

    public Payload withOrbitParams(OrbitParams orbitParams) {
        this.orbitParams = orbitParams;
        return this;
    }

}