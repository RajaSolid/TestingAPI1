package com.example.testingapi1;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TeamsResponse {
    @SerializedName("teams")
    private List<Team> teams;

    public List<Team> getTeams() {
        return teams;
    }
}