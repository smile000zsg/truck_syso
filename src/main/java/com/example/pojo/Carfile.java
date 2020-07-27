package com.example.pojo;

public class Carfile {
    private Integer carfileId;

    private Integer carfileTypeid;

    private String carfileNumber;

    private String carfileType;

    private String carfileName;

    private Integer carfileState;

    public Integer getCarfileId() {
        return carfileId;
    }

    public void setCarfileId(Integer carfileId) {
        this.carfileId = carfileId;
    }

    public Integer getCarfileTypeid() {
        return carfileTypeid;
    }

    public void setCarfileTypeid(Integer carfileTypeid) {
        this.carfileTypeid = carfileTypeid;
    }

    public String getCarfileNumber() {
        return carfileNumber;
    }

    public void setCarfileNumber(String carfileNumber) {
        this.carfileNumber = carfileNumber == null ? null : carfileNumber.trim();
    }

    public String getCarfileType() {
        return carfileType;
    }

    public void setCarfileType(String carfileType) {
        this.carfileType = carfileType == null ? null : carfileType.trim();
    }

    public String getCarfileName() {
        return carfileName;
    }

    public void setCarfileName(String carfileName) {
        this.carfileName = carfileName == null ? null : carfileName.trim();
    }

    public Integer getCarfileState() {
        return carfileState;
    }

    public void setCarfileState(Integer carfileState) {
        this.carfileState = carfileState;
    }
}