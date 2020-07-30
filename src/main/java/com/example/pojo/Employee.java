package com.example.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Employee {
    private Integer empid;

    private Integer deptid;

    private Integer postid;

    private String empname;

    private String empsex;

    private String empaccount;

    private String emppwd;

    private String empcard;

    private String empphone;

    private String empemail;

    private String empaddress;

    @JSONField(format = "yyyy-MM-dd")
    private Date empborne;

    @JSONField(format = "yyyy-MM-dd")
    private Date empentrydate;

    @JSONField(format = "yyyy-MM-dd")
    private Date empcorrectdate;

    private Integer empstate;
    
    private String deptname;
    
    private String postname;

    public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getPostname() {
		return postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }


    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname == null ? null : empname.trim();
    }

    public String getEmpsex() {
        return empsex;
    }

    public void setEmpsex(String empsex) {
        this.empsex = empsex == null ? null : empsex.trim();
    }

    public String getEmpaccount() {
        return empaccount;
    }

    public void setEmpaccount(String empaccount) {
        this.empaccount = empaccount == null ? null : empaccount.trim();
    }

    public String getEmppwd() {
        return emppwd;
    }

    public void setEmppwd(String emppwd) {
        this.emppwd = emppwd == null ? null : emppwd.trim();
    }

    public String getEmpcard() {
        return empcard;
    }

    public void setEmpcard(String empcard) {
        this.empcard = empcard == null ? null : empcard.trim();
    }

    public String getEmpphone() {
        return empphone;
    }

    public void setEmpphone(String empphone) {
        this.empphone = empphone == null ? null : empphone.trim();
    }

    public String getEmpemail() {
        return empemail;
    }

    public void setEmpemail(String empemail) {
        this.empemail = empemail == null ? null : empemail.trim();
    }

    public String getEmpaddress() {
        return empaddress;
    }

    public void setEmpaddress(String empaddress) {
        this.empaddress = empaddress == null ? null : empaddress.trim();
    }

    public Date getEmpborne() {
        return empborne;
    }

    public void setEmpborne(Date empborne) {
        this.empborne = empborne;
    }

    public Date getEmpentrydate() {
        return empentrydate;
    }

    public void setEmpentrydate(Date empentrydate) {
        this.empentrydate = empentrydate;
    }

    public Date getEmpcorrectdate() {
        return empcorrectdate;
    }

    public void setEmpcorrectdate(Date empcorrectdate) {
        this.empcorrectdate = empcorrectdate;
    }

    public Integer getEmpstate() {
        return empstate;
    }

    public void setEmpstate(Integer empstate) {
        this.empstate = empstate;
    }
}