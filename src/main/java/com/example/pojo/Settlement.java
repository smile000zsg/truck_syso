package com.example.pojo;

import java.util.Date;

public class Settlement {
    private Integer settlementid;

    private String oid;

    private String saleon;

    private String billtype;

    private String settlementmode;

    private Integer state;

    private Date paymenttime;

    private Float total;

    private Float deductionprice;

    private String customername;

    private String businesstype;

    private String carbrand;

    public Integer getSettlementid() {
        return settlementid;
    }

    public void setSettlementid(Integer settlementid) {
        this.settlementid = settlementid;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public String getSaleon() {
        return saleon;
    }

    public void setSaleon(String saleon) {
        this.saleon = saleon == null ? null : saleon.trim();
    }

    public String getBilltype() {
        return billtype;
    }

    public void setBilltype(String billtype) {
        this.billtype = billtype == null ? null : billtype.trim();
    }

    public String getSettlementmode() {
        return settlementmode;
    }

    public void setSettlementmode(String settlementmode) {
        this.settlementmode = settlementmode == null ? null : settlementmode.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Float getDeductionprice() {
        return deductionprice;
    }

    public void setDeductionprice(Float deductionprice) {
        this.deductionprice = deductionprice;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }
}