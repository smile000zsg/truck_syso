package com.example.pojo;

public class Supply {
    private Integer supplierProvinceid;

    private String supplierProvincename;

    private Integer supplierProvincestate;

    public Integer getSupplierProvinceid() {
        return supplierProvinceid;
    }

    public void setSupplierProvinceid(Integer supplierProvinceid) {
        this.supplierProvinceid = supplierProvinceid;
    }

    public String getSupplierProvincename() {
        return supplierProvincename;
    }

    public void setSupplierProvincename(String supplierProvincename) {
        this.supplierProvincename = supplierProvincename == null ? null : supplierProvincename.trim();
    }

    public Integer getSupplierProvincestate() {
        return supplierProvincestate;
    }

    public void setSupplierProvincestate(Integer supplierProvincestate) {
        this.supplierProvincestate = supplierProvincestate;
    }
}