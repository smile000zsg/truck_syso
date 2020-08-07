package com.example.pojo;

import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class Users {
    private Integer uid;

    private String account;

    private String password;
    @JSONField(format = "yyyy-MM-dd")
    private Date cratetime;

    private String vipcard;
   
    private String username;

    private String sex;

    private String phone;

    private Integer integral;

    private Float balance;
    
    private List<Recharge> recharge;
    
    public List<Object> setObject;
    
    public List<Object> getSetObject() {
		return setObject;
	}

	public void setSetObject(List<Object> setObject) {
		this.setObject = setObject;
	}

	public List<Recharge> getRecharge() {
		return recharge;
	}
	public void setRecharge(List<Recharge> recharge) {
		this.recharge = recharge;
	}

	public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getVipcard() {
        return vipcard;
    }

    public void setVipcard(String vipcard) {
        this.vipcard = vipcard == null ? null : vipcard.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
   
	public Date getCratetime() {
		return cratetime;
	}
	
	public void setCratetime(Date cratetime) {
		this.cratetime = cratetime;
	}
    
}