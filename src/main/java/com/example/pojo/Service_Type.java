package com.example.pojo;

public class Service_Type {
    private Integer serviceTypeid;

    private String serviceTypenumber;

    private String serviceTypename;

    private Integer serviceState;

    public Integer getServiceTypeid() {
        return serviceTypeid;
    }

    public void setServiceTypeid(Integer serviceTypeid) {
        this.serviceTypeid = serviceTypeid;
    }

    public String getServiceTypenumber() {
        return serviceTypenumber;
    }

    public void setServiceTypenumber(String serviceTypenumber) {
        this.serviceTypenumber = serviceTypenumber == null ? null : serviceTypenumber.trim();
    }

    public String getServiceTypename() {
        return serviceTypename;
    }

    public void setServiceTypename(String serviceTypename) {
        this.serviceTypename = serviceTypename == null ? null : serviceTypename.trim();
    }

    public Integer getServiceState() {
        return serviceState;
    }

    public void setServiceState(Integer serviceState) {
        this.serviceState = serviceState;
    }
}