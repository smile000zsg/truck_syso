package com.example.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Service {
    private Integer serviceId;

    private Integer serviceTypeid;

    private String serviceNumber;

    private String serviceName;

    private BigDecimal servicePrice;

    private BigDecimal serviceVipprice;

    private Date serviceStarttime;

    private Date serviceEndtime;

    private Integer state;

    public Integer getServiceId() {
        return serviceId;
    }

    public void setServiceId(Integer serviceId) {
        this.serviceId = serviceId;
    }

    public Integer getServiceTypeid() {
        return serviceTypeid;
    }

    public void setServiceTypeid(Integer serviceTypeid) {
        this.serviceTypeid = serviceTypeid;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(String serviceNumber) {
        this.serviceNumber = serviceNumber == null ? null : serviceNumber.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public BigDecimal getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(BigDecimal servicePrice) {
        this.servicePrice = servicePrice;
    }

    public BigDecimal getServiceVipprice() {
        return serviceVipprice;
    }

    public void setServiceVipprice(BigDecimal serviceVipprice) {
        this.serviceVipprice = serviceVipprice;
    }

    public Date getServiceStarttime() {
        return serviceStarttime;
    }

    public void setServiceStarttime(Date serviceStarttime) {
        this.serviceStarttime = serviceStarttime;
    }

    public Date getServiceEndtime() {
        return serviceEndtime;
    }

    public void setServiceEndtime(Date serviceEndtime) {
        this.serviceEndtime = serviceEndtime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}