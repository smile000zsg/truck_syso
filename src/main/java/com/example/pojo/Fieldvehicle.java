package com.example.pojo;

public class Fieldvehicle {
    private Integer fieldid;

    private Integer teamsid;

    private String carno;

    private String carbrand;

    private String cartype;

    private Float carmilion;

    private Integer state;

    private Float price;
    
    private String	teamsname;
   
    public String getTeamsname() {
		return teamsname;
	}

	public void setTeamsname(String teamsname) {
		this.teamsname = teamsname;
	}

	public Integer getFieldid() {
        return fieldid;
    }

    public void setFieldid(Integer fieldid) {
        this.fieldid = fieldid;
    }

    public Integer getTeamsid() {
        return teamsid;
    }

    public void setTeamsid(Integer teamsid) {
        this.teamsid = teamsid;
    }

    public String getCarno() {
        return carno;
    }

    public void setCarno(String carno) {
        this.carno = carno == null ? null : carno.trim();
    }

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand == null ? null : carbrand.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public Float getCarmilion() {
        return carmilion;
    }

    public void setCarmilion(Float carmilion) {
        this.carmilion = carmilion;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}