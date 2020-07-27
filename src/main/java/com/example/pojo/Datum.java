package com.example.pojo;

import java.util.Date;

public class Datum {
    private Integer did;

    private String clid;

    private String license;

    private String dbrand;

    private String dsignal;

    private String pilot;

    private String dphone;

    private String ownership;

    private Date ddate;

    private String dcolor;

    private String mileage;

    private String fuel;

    private String dremark;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid == null ? null : clid.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getDbrand() {
        return dbrand;
    }

    public void setDbrand(String dbrand) {
        this.dbrand = dbrand == null ? null : dbrand.trim();
    }

    public String getDsignal() {
        return dsignal;
    }

    public void setDsignal(String dsignal) {
        this.dsignal = dsignal == null ? null : dsignal.trim();
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot == null ? null : pilot.trim();
    }

    public String getDphone() {
        return dphone;
    }

    public void setDphone(String dphone) {
        this.dphone = dphone == null ? null : dphone.trim();
    }

    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership == null ? null : ownership.trim();
    }

    public Date getDdate() {
        return ddate;
    }

    public void setDdate(Date ddate) {
        this.ddate = ddate;
    }

    public String getDcolor() {
        return dcolor;
    }

    public void setDcolor(String dcolor) {
        this.dcolor = dcolor == null ? null : dcolor.trim();
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage == null ? null : mileage.trim();
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel == null ? null : fuel.trim();
    }

    public String getDremark() {
        return dremark;
    }

    public void setDremark(String dremark) {
        this.dremark = dremark == null ? null : dremark.trim();
    }
}