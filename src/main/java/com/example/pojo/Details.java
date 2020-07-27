package com.example.pojo;

import java.math.BigDecimal;

public class Details {
    private Integer detailsid;

    private String oid;

    private String detailsname;

    private BigDecimal detailsprice;

    private Integer detailsdate;

    private Integer detailscount;

    public Integer getDetailsid() {
        return detailsid;
    }

    public void setDetailsid(Integer detailsid) {
        this.detailsid = detailsid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getDetailsname() {
        return detailsname;
    }

    public void setDetailsname(String detailsname) {
        this.detailsname = detailsname == null ? null : detailsname.trim();
    }

    public BigDecimal getDetailsprice() {
        return detailsprice;
    }

    public void setDetailsprice(BigDecimal detailsprice) {
        this.detailsprice = detailsprice;
    }

    public Integer getDetailsdate() {
        return detailsdate;
    }

    public void setDetailsdate(Integer detailsdate) {
        this.detailsdate = detailsdate;
    }

    public Integer getDetailscount() {
        return detailscount;
    }

    public void setDetailscount(Integer detailscount) {
        this.detailscount = detailscount;
    }
}