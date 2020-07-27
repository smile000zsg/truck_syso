package com.example.pojo;

public class Stars {
    private Integer starsid;

    private String starslevel;

    public Integer getStarsid() {
        return starsid;
    }

    public void setStarsid(Integer starsid) {
        this.starsid = starsid;
    }

    public String getStarslevel() {
        return starslevel;
    }

    public void setStarslevel(String starslevel) {
        this.starslevel = starslevel == null ? null : starslevel.trim();
    }
}