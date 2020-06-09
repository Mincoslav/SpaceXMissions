package com.example.spacexmissions.missionModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LaunchSite {

    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("site_name")
    @Expose
    private String siteName;
    @SerializedName("site_name_long")
    @Expose
    private String siteNameLong;

    public String getSiteId() {
        return siteId;
    }

    public void setSiteId(String siteId) {
        this.siteId = siteId;
    }

    public LaunchSite withSiteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public LaunchSite withSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    public String getSiteNameLong() {
        return siteNameLong;
    }

    public void setSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
    }

    public LaunchSite withSiteNameLong(String siteNameLong) {
        this.siteNameLong = siteNameLong;
        return this;
    }

}