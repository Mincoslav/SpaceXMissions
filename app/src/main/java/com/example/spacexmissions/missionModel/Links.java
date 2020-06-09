package com.example.spacexmissions.missionModel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("mission_patch")
    @Expose
    private String missionPatch;
    @SerializedName("mission_patch_small")
    @Expose
    private String missionPatchSmall;
    @SerializedName("reddit_campaign")
    @Expose
    private String redditCampaign;
    @SerializedName("reddit_launch")
    @Expose
    private String redditLaunch;
    @SerializedName("reddit_recovery")
    @Expose
    private Object redditRecovery;
    @SerializedName("reddit_media")
    @Expose
    private Object redditMedia;
    @SerializedName("presskit")
    @Expose
    private String presskit;
    @SerializedName("article_link")
    @Expose
    private Object articleLink;
    @SerializedName("wikipedia")
    @Expose
    private Object wikipedia;
    @SerializedName("video_link")
    @Expose
    private String videoLink;
    @SerializedName("youtube_id")
    @Expose
    private String youtubeId;
    @SerializedName("flickr_images")
    @Expose
    private List<String> flickrImages = null;

    public String getMissionPatch() {
        return missionPatch;
    }

    public void setMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
    }

    public Links withMissionPatch(String missionPatch) {
        this.missionPatch = missionPatch;
        return this;
    }

    public String getMissionPatchSmall() {
        return missionPatchSmall;
    }

    public void setMissionPatchSmall(String missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
    }

    public Links withMissionPatchSmall(String missionPatchSmall) {
        this.missionPatchSmall = missionPatchSmall;
        return this;
    }

    public String getRedditCampaign() {
        return redditCampaign;
    }

    public void setRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
    }

    public Links withRedditCampaign(String redditCampaign) {
        this.redditCampaign = redditCampaign;
        return this;
    }

    public String getRedditLaunch() {
        return redditLaunch;
    }

    public void setRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
    }

    public Links withRedditLaunch(String redditLaunch) {
        this.redditLaunch = redditLaunch;
        return this;
    }

    public Object getRedditRecovery() {
        return redditRecovery;
    }

    public void setRedditRecovery(Object redditRecovery) {
        this.redditRecovery = redditRecovery;
    }

    public Links withRedditRecovery(Object redditRecovery) {
        this.redditRecovery = redditRecovery;
        return this;
    }

    public Object getRedditMedia() {
        return redditMedia;
    }

    public void setRedditMedia(Object redditMedia) {
        this.redditMedia = redditMedia;
    }

    public Links withRedditMedia(Object redditMedia) {
        this.redditMedia = redditMedia;
        return this;
    }

    public String getPresskit() {
        return presskit;
    }

    public void setPresskit(String presskit) {
        this.presskit = presskit;
    }

    public Links withPresskit(String presskit) {
        this.presskit = presskit;
        return this;
    }

    public Object getArticleLink() {
        return articleLink;
    }

    public void setArticleLink(Object articleLink) {
        this.articleLink = articleLink;
    }

    public Links withArticleLink(Object articleLink) {
        this.articleLink = articleLink;
        return this;
    }

    public Object getWikipedia() {
        return wikipedia;
    }

    public void setWikipedia(Object wikipedia) {
        this.wikipedia = wikipedia;
    }

    public Links withWikipedia(Object wikipedia) {
        this.wikipedia = wikipedia;
        return this;
    }

    public String getVideoLink() {
        return videoLink;
    }

    public void setVideoLink(String videoLink) {
        this.videoLink = videoLink;
    }

    public Links withVideoLink(String videoLink) {
        this.videoLink = videoLink;
        return this;
    }

    public String getYoutubeId() {
        return youtubeId;
    }

    public void setYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
    }

    public Links withYoutubeId(String youtubeId) {
        this.youtubeId = youtubeId;
        return this;
    }

    public List<String> getFlickrImages() {
        return flickrImages;
    }

    public void setFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
    }

    public Links withFlickrImages(List<String> flickrImages) {
        this.flickrImages = flickrImages;
        return this;
    }

}