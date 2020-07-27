package com.example.pojo;

import java.util.Date;

public class Client {
    private String clid;

    private Integer did;

    private String clname;

    private Date cldate;

    private String clsex;

    private String clidentity;

    private String clphone;

    private String province;

    private String city;

    private String district;

    private String address;

    private String remark;

    private Integer clstate;

    public String getClid() {
        return clid;
    }

    public void setClid(String clid) {
        this.clid = clid == null ? null : clid.trim();
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getClname() {
        return clname;
    }

    public void setClname(String clname) {
        this.clname = clname == null ? null : clname.trim();
    }

    public Date getCldate() {
        return cldate;
    }

    public void setCldate(Date cldate) {
        this.cldate = cldate;
    }

    public String getClsex() {
        return clsex;
    }

    public void setClsex(String clsex) {
        this.clsex = clsex == null ? null : clsex.trim();
    }

    public String getClidentity() {
        return clidentity;
    }

    public void setClidentity(String clidentity) {
        this.clidentity = clidentity == null ? null : clidentity.trim();
    }

    public String getClphone() {
        return clphone;
    }

    public void setClphone(String clphone) {
        this.clphone = clphone == null ? null : clphone.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getClstate() {
        return clstate;
    }

    public void setClstate(Integer clstate) {
        this.clstate = clstate;
    }
}