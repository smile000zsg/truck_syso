package com.example.pojo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

public class Recharge {
    private Integer rechargeid;

    private Integer uid;
    
    @JSONField(format = "yyyy-MM-dd")
    private Date rechargetime;

    private Integer pricestate;
    
    private int price;
    

    public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Integer getRechargeid() {
        return rechargeid;
    }

    public void setRechargeid(Integer rechargeid) {
        this.rechargeid = rechargeid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getRechargetime() {
        return rechargetime;
    }

    public void setRechargetime(Date rechargetime) {
        this.rechargetime = rechargetime;
    }

    public Integer getPricestate() {
        return pricestate;
    }

    public void setPricestate(Integer pricestate) {
        this.pricestate = pricestate;
    }
}