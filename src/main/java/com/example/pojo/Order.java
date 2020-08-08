package com.example.pojo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Order {
    private String oid;

    private Integer settlementid;

    private Integer ostate;

    private String ovehicle;

    private String oremark;

    private String crew;

    private String olicense;

    private String ophone;

    private String oname;

    private String obrand;

    private String omodel;

    private BigDecimal sums;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date odatetime;

    private Integer wstate;
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date finishtime;

    private Integer rework;

    private Integer cause;

    private String reworkreason;

    private BigDecimal penaltyamount;
    
    
    private List<Details> details;
    
    

    public List<Details> getDetails() {
		return details;
	}

	public void setDetails(List<Details> details) {
		this.details = details;
	}

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

    public String getOvehicle() {
        return ovehicle;
    }

    public void setOvehicle(String ovehicle) {
        this.ovehicle = ovehicle == null ? null : ovehicle.trim();
    }

    public String getOremark() {
        return oremark;
    }

    public void setOremark(String oremark) {
        this.oremark = oremark == null ? null : oremark.trim();
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew == null ? null : crew.trim();
    }

    public String getOlicense() {
        return olicense;
    }

    public void setOlicense(String olicense) {
        this.olicense = olicense == null ? null : olicense.trim();
    }
   
    
    public String getOphone() { 
        return ophone;
    }

    public void setOphone(String ophone) {
        this.ophone = ophone == null ? null : ophone.trim();
    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname == null ? null : oname.trim();
    }

    public String getObrand() {
        return obrand;
    }

    public void setObrand(String obrand) {
        this.obrand = obrand == null ? null : obrand.trim();
    }

    public String getOmodel() {
        return omodel;
    }

    public void setOmodel(String omodel) {
        this.omodel = omodel == null ? null : omodel.trim();
    }

    public BigDecimal getSums() {
        return sums;
    }

    public void setSums(BigDecimal sums) {
        this.sums = sums;
    }

    public Date getOdatetime() {
        return odatetime;
    }

    public void setOdatetime(Date odatetime) {
        this.odatetime = odatetime;
    }

    public Integer getWstate() {
        return wstate;
    }

    public void setWstate(Integer wstate) {
        this.wstate = wstate;
    }

    public Date getFinishtime() {
        return finishtime;
    }

    public void setFinishtime(Date finishtime) {
        this.finishtime = finishtime;
    }

    public Integer getRework() {
        return rework;
    }

    public void setRework(Integer rework) {
        this.rework = rework;
    }

    public Integer getCause() {
        return cause;
    }

    public void setCause(Integer cause) {
        this.cause = cause;
    }

    public String getReworkreason() {
        return reworkreason;
    }

    public void setReworkreason(String reworkreason) {
        this.reworkreason = reworkreason == null ? null : reworkreason.trim();
    }

    public BigDecimal getPenaltyamount() {
        return penaltyamount;
    }

    public void setPenaltyamount(BigDecimal penaltyamount) {
        this.penaltyamount = penaltyamount;
    }
}