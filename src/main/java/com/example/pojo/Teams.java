package com.example.pojo;

public class Teams {
    private Integer teamsid;

    private String teamsname;

    public Integer getTeamsid() {
        return teamsid;
    }

    public void setTeamsid(Integer teamsid) {
        this.teamsid = teamsid;
    }

    public String getTeamsname() {
        return teamsname;
    }

    public void setTeamsname(String teamsname) {
        this.teamsname = teamsname == null ? null : teamsname.trim();
    }
}