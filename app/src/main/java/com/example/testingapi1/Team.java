package com.example.testingapi1;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("strTeam")
    private String name;

    @SerializedName("strStadium")
    private String stadium;

    @SerializedName("strBadge")
    private String badgeUrl;

    public String getName() { return name; }
    public String getStadium() { return stadium; }
    public String getBadgeUrl() { return badgeUrl; }
}

