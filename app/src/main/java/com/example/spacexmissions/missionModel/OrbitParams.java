package com.example.spacexmissions.missionModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OrbitParams {

    @SerializedName("reference_system")
    @Expose
    private String referenceSystem;
    @SerializedName("regime")
    @Expose
    private String regime;
    @SerializedName("longitude")
    @Expose
    private Object longitude;
    @SerializedName("semi_major_axis_km")
    @Expose
    private Object semiMajorAxisKm;
    @SerializedName("eccentricity")
    @Expose
    private Object eccentricity;
    @SerializedName("periapsis_km")
    @Expose
    private Object periapsisKm;
    @SerializedName("apoapsis_km")
    @Expose
    private Object apoapsisKm;
    @SerializedName("inclination_deg")
    @Expose
    private Object inclinationDeg;
    @SerializedName("period_min")
    @Expose
    private Object periodMin;
    @SerializedName("lifespan_years")
    @Expose
    private Object lifespanYears;
    @SerializedName("epoch")
    @Expose
    private Object epoch;
    @SerializedName("mean_motion")
    @Expose
    private Object meanMotion;
    @SerializedName("raan")
    @Expose
    private Object raan;
    @SerializedName("arg_of_pericenter")
    @Expose
    private Object argOfPericenter;
    @SerializedName("mean_anomaly")
    @Expose
    private Object meanAnomaly;

    public String getReferenceSystem() {
        return referenceSystem;
    }

    public void setReferenceSystem(String referenceSystem) {
        this.referenceSystem = referenceSystem;
    }

    public OrbitParams withReferenceSystem(String referenceSystem) {
        this.referenceSystem = referenceSystem;
        return this;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public OrbitParams withRegime(String regime) {
        this.regime = regime;
        return this;
    }

    public Object getLongitude() {
        return longitude;
    }

    public void setLongitude(Object longitude) {
        this.longitude = longitude;
    }

    public OrbitParams withLongitude(Object longitude) {
        this.longitude = longitude;
        return this;
    }

    public Object getSemiMajorAxisKm() {
        return semiMajorAxisKm;
    }

    public void setSemiMajorAxisKm(Object semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
    }

    public OrbitParams withSemiMajorAxisKm(Object semiMajorAxisKm) {
        this.semiMajorAxisKm = semiMajorAxisKm;
        return this;
    }

    public Object getEccentricity() {
        return eccentricity;
    }

    public void setEccentricity(Object eccentricity) {
        this.eccentricity = eccentricity;
    }

    public OrbitParams withEccentricity(Object eccentricity) {
        this.eccentricity = eccentricity;
        return this;
    }

    public Object getPeriapsisKm() {
        return periapsisKm;
    }

    public void setPeriapsisKm(Object periapsisKm) {
        this.periapsisKm = periapsisKm;
    }

    public OrbitParams withPeriapsisKm(Object periapsisKm) {
        this.periapsisKm = periapsisKm;
        return this;
    }

    public Object getApoapsisKm() {
        return apoapsisKm;
    }

    public void setApoapsisKm(Object apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
    }

    public OrbitParams withApoapsisKm(Object apoapsisKm) {
        this.apoapsisKm = apoapsisKm;
        return this;
    }

    public Object getInclinationDeg() {
        return inclinationDeg;
    }

    public void setInclinationDeg(Object inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
    }

    public OrbitParams withInclinationDeg(Object inclinationDeg) {
        this.inclinationDeg = inclinationDeg;
        return this;
    }

    public Object getPeriodMin() {
        return periodMin;
    }

    public void setPeriodMin(Object periodMin) {
        this.periodMin = periodMin;
    }

    public OrbitParams withPeriodMin(Object periodMin) {
        this.periodMin = periodMin;
        return this;
    }

    public Object getLifespanYears() {
        return lifespanYears;
    }

    public void setLifespanYears(Object lifespanYears) {
        this.lifespanYears = lifespanYears;
    }

    public OrbitParams withLifespanYears(Object lifespanYears) {
        this.lifespanYears = lifespanYears;
        return this;
    }

    public Object getEpoch() {
        return epoch;
    }

    public void setEpoch(Object epoch) {
        this.epoch = epoch;
    }

    public OrbitParams withEpoch(Object epoch) {
        this.epoch = epoch;
        return this;
    }

    public Object getMeanMotion() {
        return meanMotion;
    }

    public void setMeanMotion(Object meanMotion) {
        this.meanMotion = meanMotion;
    }

    public OrbitParams withMeanMotion(Object meanMotion) {
        this.meanMotion = meanMotion;
        return this;
    }

    public Object getRaan() {
        return raan;
    }

    public void setRaan(Object raan) {
        this.raan = raan;
    }

    public OrbitParams withRaan(Object raan) {
        this.raan = raan;
        return this;
    }

    public Object getArgOfPericenter() {
        return argOfPericenter;
    }

    public void setArgOfPericenter(Object argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
    }

    public OrbitParams withArgOfPericenter(Object argOfPericenter) {
        this.argOfPericenter = argOfPericenter;
        return this;
    }

    public Object getMeanAnomaly() {
        return meanAnomaly;
    }

    public void setMeanAnomaly(Object meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
    }

    public OrbitParams withMeanAnomaly(Object meanAnomaly) {
        this.meanAnomaly = meanAnomaly;
        return this;
    }

}