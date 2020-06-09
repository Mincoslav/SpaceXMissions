package com.example.spacexmissions.missionModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mission {

    @SerializedName("flight_number")
    @Expose
    private int flightNumber;
    @SerializedName("mission_name")
    @Expose
    private String missionName;
    @SerializedName("mission_id")
    @Expose
    private List<Object> missionId = null;
    @SerializedName("launch_year")
    @Expose
    private String launchYear;
    @SerializedName("launch_date_unix")
    @Expose
    private int launchDateUnix;
    @SerializedName("launch_date_utc")
    @Expose
    private String launchDateUtc;
    @SerializedName("launch_date_local")
    @Expose
    private String launchDateLocal;
    @SerializedName("is_tentative")
    @Expose
    private boolean isTentative;
    @SerializedName("tentative_max_precision")
    @Expose
    private String tentativeMaxPrecision;
    @SerializedName("tbd")
    @Expose
    private boolean tbd;
    @SerializedName("launch_window")
    @Expose
    private Object launchWindow;
    @SerializedName("rocket")
    @Expose
    private Rocket rocket;
    @SerializedName("ships")
    @Expose
    private List<Object> ships = null;
    @SerializedName("telemetry")
    @Expose
    private Telemetry telemetry;
    @SerializedName("launch_site")
    @Expose
    private LaunchSite launchSite;
    @SerializedName("launch_success")
    @Expose
    private boolean launchSuccess;
    @SerializedName("links")
    @Expose
    private Links links;
    @SerializedName("details")
    @Expose
    private String details;
    @SerializedName("upcoming")
    @Expose
    private boolean upcoming;
    @SerializedName("static_fire_date_utc")
    @Expose
    private String staticFireDateUtc;
    @SerializedName("static_fire_date_unix")
    @Expose
    private int staticFireDateUnix;
    @SerializedName("timeline")
    @Expose
    private Object timeline;
    @SerializedName("crew")
    @Expose
    private Object crew;
    @SerializedName("last_date_update")
    @Expose
    private String lastDateUpdate;
    @SerializedName("last_ll_launch_date")
    @Expose
    private String lastLlLaunchDate;
    @SerializedName("last_ll_update")
    @Expose
    private String lastLlUpdate;
    @SerializedName("last_wiki_launch_date")
    @Expose
    private String lastWikiLaunchDate;
    @SerializedName("last_wiki_revision")
    @Expose
    private String lastWikiRevision;
    @SerializedName("last_wiki_update")
    @Expose
    private String lastWikiUpdate;
    @SerializedName("launch_date_source")
    @Expose
    private String launchDateSource;

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Mission withFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public String getMissionName() {
        return missionName;
    }

    public void setMissionName(String missionName) {
        this.missionName = missionName;
    }

    public Mission withMissionName(String missionName) {
        this.missionName = missionName;
        return this;
    }

    public List<Object> getMissionId() {
        return missionId;
    }

    public void setMissionId(List<Object> missionId) {
        this.missionId = missionId;
    }

    public Mission withMissionId(List<Object> missionId) {
        this.missionId = missionId;
        return this;
    }

    public String getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(String launchYear) {
        this.launchYear = launchYear;
    }

    public Mission withLaunchYear(String launchYear) {
        this.launchYear = launchYear;
        return this;
    }

    public int getLaunchDateUnix() {
        return launchDateUnix;
    }

    public void setLaunchDateUnix(int launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
    }

    public Mission withLaunchDateUnix(int launchDateUnix) {
        this.launchDateUnix = launchDateUnix;
        return this;
    }

    public String getLaunchDateUtc() {
        return launchDateUtc;
    }

    public void setLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
    }

    public Mission withLaunchDateUtc(String launchDateUtc) {
        this.launchDateUtc = launchDateUtc;
        return this;
    }

    public String getLaunchDateLocal() {
        return launchDateLocal;
    }

    public void setLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
    }

    public Mission withLaunchDateLocal(String launchDateLocal) {
        this.launchDateLocal = launchDateLocal;
        return this;
    }

    public boolean isIsTentative() {
        return isTentative;
    }

    public void setIsTentative(boolean isTentative) {
        this.isTentative = isTentative;
    }

    public Mission withIsTentative(boolean isTentative) {
        this.isTentative = isTentative;
        return this;
    }

    public String getTentativeMaxPrecision() {
        return tentativeMaxPrecision;
    }

    public void setTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
    }

    public Mission withTentativeMaxPrecision(String tentativeMaxPrecision) {
        this.tentativeMaxPrecision = tentativeMaxPrecision;
        return this;
    }

    public boolean isTbd() {
        return tbd;
    }

    public void setTbd(boolean tbd) {
        this.tbd = tbd;
    }

    public Mission withTbd(boolean tbd) {
        this.tbd = tbd;
        return this;
    }

    public Object getLaunchWindow() {
        return launchWindow;
    }

    public void setLaunchWindow(Object launchWindow) {
        this.launchWindow = launchWindow;
    }

    public Mission withLaunchWindow(Object launchWindow) {
        this.launchWindow = launchWindow;
        return this;
    }

    public Rocket getRocket() {
        return rocket;
    }

    public void setRocket(Rocket rocket) {
        this.rocket = rocket;
    }

    public Mission withRocket(Rocket rocket) {
        this.rocket = rocket;
        return this;
    }

    public List<Object> getShips() {
        return ships;
    }

    public void setShips(List<Object> ships) {
        this.ships = ships;
    }

    public Mission withShips(List<Object> ships) {
        this.ships = ships;
        return this;
    }

    public Telemetry getTelemetry() {
        return telemetry;
    }

    public void setTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
    }

    public Mission withTelemetry(Telemetry telemetry) {
        this.telemetry = telemetry;
        return this;
    }

    public LaunchSite getLaunchSite() {
        return launchSite;
    }

    public void setLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
    }

    public Mission withLaunchSite(LaunchSite launchSite) {
        this.launchSite = launchSite;
        return this;
    }

    public boolean isLaunchSuccess() {
        return launchSuccess;
    }

    public void setLaunchSuccess(boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
    }

    public Mission withLaunchSuccess(boolean launchSuccess) {
        this.launchSuccess = launchSuccess;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Mission withLinks(Links links) {
        this.links = links;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Mission withDetails(String details) {
        this.details = details;
        return this;
    }

    public boolean isUpcoming() {
        return upcoming;
    }

    public void setUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
    }

    public Mission withUpcoming(boolean upcoming) {
        this.upcoming = upcoming;
        return this;
    }

    public String getStaticFireDateUtc() {
        return staticFireDateUtc;
    }

    public void setStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
    }

    public Mission withStaticFireDateUtc(String staticFireDateUtc) {
        this.staticFireDateUtc = staticFireDateUtc;
        return this;
    }

    public int getStaticFireDateUnix() {
        return staticFireDateUnix;
    }

    public void setStaticFireDateUnix(int staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
    }

    public Mission withStaticFireDateUnix(int staticFireDateUnix) {
        this.staticFireDateUnix = staticFireDateUnix;
        return this;
    }

    public Object getTimeline() {
        return timeline;
    }

    public void setTimeline(Object timeline) {
        this.timeline = timeline;
    }

    public Mission withTimeline(Object timeline) {
        this.timeline = timeline;
        return this;
    }

    public Object getCrew() {
        return crew;
    }

    public void setCrew(Object crew) {
        this.crew = crew;
    }

    public Mission withCrew(Object crew) {
        this.crew = crew;
        return this;
    }

    public String getLastDateUpdate() {
        return lastDateUpdate;
    }

    public void setLastDateUpdate(String lastDateUpdate) {
        this.lastDateUpdate = lastDateUpdate;
    }

    public Mission withLastDateUpdate(String lastDateUpdate) {
        this.lastDateUpdate = lastDateUpdate;
        return this;
    }

    public String getLastLlLaunchDate() {
        return lastLlLaunchDate;
    }

    public void setLastLlLaunchDate(String lastLlLaunchDate) {
        this.lastLlLaunchDate = lastLlLaunchDate;
    }

    public Mission withLastLlLaunchDate(String lastLlLaunchDate) {
        this.lastLlLaunchDate = lastLlLaunchDate;
        return this;
    }

    public String getLastLlUpdate() {
        return lastLlUpdate;
    }

    public void setLastLlUpdate(String lastLlUpdate) {
        this.lastLlUpdate = lastLlUpdate;
    }

    public Mission withLastLlUpdate(String lastLlUpdate) {
        this.lastLlUpdate = lastLlUpdate;
        return this;
    }

    public String getLastWikiLaunchDate() {
        return lastWikiLaunchDate;
    }

    public void setLastWikiLaunchDate(String lastWikiLaunchDate) {
        this.lastWikiLaunchDate = lastWikiLaunchDate;
    }

    public Mission withLastWikiLaunchDate(String lastWikiLaunchDate) {
        this.lastWikiLaunchDate = lastWikiLaunchDate;
        return this;
    }

    public String getLastWikiRevision() {
        return lastWikiRevision;
    }

    public void setLastWikiRevision(String lastWikiRevision) {
        this.lastWikiRevision = lastWikiRevision;
    }

    public Mission withLastWikiRevision(String lastWikiRevision) {
        this.lastWikiRevision = lastWikiRevision;
        return this;
    }

    public String getLastWikiUpdate() {
        return lastWikiUpdate;
    }

    public void setLastWikiUpdate(String lastWikiUpdate) {
        this.lastWikiUpdate = lastWikiUpdate;
    }

    public Mission withLastWikiUpdate(String lastWikiUpdate) {
        this.lastWikiUpdate = lastWikiUpdate;
        return this;
    }

    public String getLaunchDateSource() {
        return launchDateSource;
    }

    public void setLaunchDateSource(String launchDateSource) {
        this.launchDateSource = launchDateSource;
    }

    public Mission withLaunchDateSource(String launchDateSource) {
        this.launchDateSource = launchDateSource;
        return this;
    }

}