package com.example.pojo;

public class Carfile_Type {
    private Integer carfileTypeid;

    private String carfileTypenumber;

    private String carfileTypename;

    private String carfileTypeabc;

    private Integer carfileTypestate;

    public Integer getCarfileTypeid() {
        return carfileTypeid;
    }

    public void setCarfileTypeid(Integer carfileTypeid) {
        this.carfileTypeid = carfileTypeid;
    }

    public String getCarfileTypenumber() {
        return carfileTypenumber;
    }

    public void setCarfileTypenumber(String carfileTypenumber) {
        this.carfileTypenumber = carfileTypenumber == null ? null : carfileTypenumber.trim();
    }

    public String getCarfileTypename() {
        return carfileTypename;
    }

    public void setCarfileTypename(String carfileTypename) {
        this.carfileTypename = carfileTypename == null ? null : carfileTypename.trim();
    }

    public String getCarfileTypeabc() {
        return carfileTypeabc;
    }

    public void setCarfileTypeabc(String carfileTypeabc) {
        this.carfileTypeabc = carfileTypeabc == null ? null : carfileTypeabc.trim();
    }

    public Integer getCarfileTypestate() {
        return carfileTypestate;
    }

    public void setCarfileTypestate(Integer carfileTypestate) {
        this.carfileTypestate = carfileTypestate;
    }
}