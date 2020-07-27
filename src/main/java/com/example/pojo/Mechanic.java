package com.example.pojo;

import java.util.Date;

public class Mechanic {
    private Integer mecid;

    private Integer teamsid;

    private Integer starsid;

    private String oid;

    private String mecname;

    private String mecsex;

    private String mecphone;

    private Date mecborndate;

    private String mecaddress;

    private String meccard;

    private Integer mecstate;

    private Float mecprice;

    public Integer getMecid() {
        return mecid;
    }

    public void setMecid(Integer mecid) {
        this.mecid = mecid;
    }

    public Integer getTeamsid() {
        return teamsid;
    }

    public void setTeamsid(Integer teamsid) {
        this.teamsid = teamsid;
    }

    public Integer getStarsid() {
        return starsid;
    }

    public void setStarsid(Integer starsid) {
        this.starsid = starsid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getMecname() {
        return mecname;
    }

    public void setMecname(String mecname) {
        this.mecname = mecname == null ? null : mecname.trim();
    }

    public String getMecsex() {
        return mecsex;
    }

    public void setMecsex(String mecsex) {
        this.mecsex = mecsex == null ? null : mecsex.trim();
    }

    public String getMecphone() {
        return mecphone;
    }

    public void setMecphone(String mecphone) {
        this.mecphone = mecphone == null ? null : mecphone.trim();
    }

    public Date getMecborndate() {
        return mecborndate;
    }

    public void setMecborndate(Date mecborndate) {
        this.mecborndate = mecborndate;
    }

    public String getMecaddress() {
        return mecaddress;
    }

    public void setMecaddress(String mecaddress) {
        this.mecaddress = mecaddress == null ? null : mecaddress.trim();
    }

    public String getMeccard() {
        return meccard;
    }

    public void setMeccard(String meccard) {
        this.meccard = meccard == null ? null : meccard.trim();
    }

    public Integer getMecstate() {
        return mecstate;
    }

    public void setMecstate(Integer mecstate) {
        this.mecstate = mecstate;
    }

    public Float getMecprice() {
        return mecprice;
    }

    public void setMecprice(Float mecprice) {
        this.mecprice = mecprice;
    }
}