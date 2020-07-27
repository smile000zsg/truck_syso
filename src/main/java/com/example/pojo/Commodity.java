package com.example.pojo;

public class Commodity {
    private Integer commodityMeansid;

    private String commodityMeansnumber;

    private String commodityMeanstype;

    private String commodityMeansnama;

    private Integer commodityMeansinventory;

    private String commodityMeansdizi;

    private String commodityMeansdiziname;

    private Integer commodityMeansstate;

    public Integer getCommodityMeansid() {
        return commodityMeansid;
    }

    public void setCommodityMeansid(Integer commodityMeansid) {
        this.commodityMeansid = commodityMeansid;
    }

    public String getCommodityMeansnumber() {
        return commodityMeansnumber;
    }

    public void setCommodityMeansnumber(String commodityMeansnumber) {
        this.commodityMeansnumber = commodityMeansnumber == null ? null : commodityMeansnumber.trim();
    }

    public String getCommodityMeanstype() {
        return commodityMeanstype;
    }

    public void setCommodityMeanstype(String commodityMeanstype) {
        this.commodityMeanstype = commodityMeanstype == null ? null : commodityMeanstype.trim();
    }

    public String getCommodityMeansnama() {
        return commodityMeansnama;
    }

    public void setCommodityMeansnama(String commodityMeansnama) {
        this.commodityMeansnama = commodityMeansnama == null ? null : commodityMeansnama.trim();
    }

    public Integer getCommodityMeansinventory() {
        return commodityMeansinventory;
    }

    public void setCommodityMeansinventory(Integer commodityMeansinventory) {
        this.commodityMeansinventory = commodityMeansinventory;
    }

    public String getCommodityMeansdizi() {
        return commodityMeansdizi;
    }

    public void setCommodityMeansdizi(String commodityMeansdizi) {
        this.commodityMeansdizi = commodityMeansdizi == null ? null : commodityMeansdizi.trim();
    }

    public String getCommodityMeansdiziname() {
        return commodityMeansdiziname;
    }

    public void setCommodityMeansdiziname(String commodityMeansdiziname) {
        this.commodityMeansdiziname = commodityMeansdiziname == null ? null : commodityMeansdiziname.trim();
    }

    public Integer getCommodityMeansstate() {
        return commodityMeansstate;
    }

    public void setCommodityMeansstate(Integer commodityMeansstate) {
        this.commodityMeansstate = commodityMeansstate;
    }
}