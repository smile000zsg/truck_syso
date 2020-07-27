package com.example.pojo;

import java.util.Date;

public class Resignation {
    private Integer resid;

    private Integer deptid;

    private Integer empid;

    private Date resdate;

    private String resignationreson;

    private Integer resstate;

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Date getResdate() {
        return resdate;
    }

    public void setResdate(Date resdate) {
        this.resdate = resdate;
    }

    public String getResignationreson() {
        return resignationreson;
    }

    public void setResignationreson(String resignationreson) {
        this.resignationreson = resignationreson == null ? null : resignationreson.trim();
    }

    public Integer getResstate() {
        return resstate;
    }

    public void setResstate(Integer resstate) {
        this.resstate = resstate;
    }
}