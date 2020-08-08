package com.example.pojo;

import java.math.BigDecimal;

public class Goods {
    private Integer gid;

    private String gname;

    private String gbrand;

    private Integer ginventory;

    private String gaddress;

    private String gsupplier;

    private BigDecimal gprice;

    private Integer gstate;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGbrand() {
        return gbrand;
    }

    public void setGbrand(String gbrand) {
        this.gbrand = gbrand == null ? null : gbrand.trim();
    }

    public Integer getGinventory() {
        return ginventory;
    }

    public void setGinventory(Integer ginventory) {
        this.ginventory = ginventory;
    }

    public String getGaddress() {
        return gaddress;
    }

    public void setGaddress(String gaddress) {
        this.gaddress = gaddress == null ? null : gaddress.trim();
    }

    public String getGsupplier() {
        return gsupplier;
    }

    public void setGsupplier(String gsupplier) {
        this.gsupplier = gsupplier == null ? null : gsupplier.trim();
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public Integer getGstate() {
        return gstate;
    }

    public void setGstate(Integer gstate) {
        this.gstate = gstate;
    }
}