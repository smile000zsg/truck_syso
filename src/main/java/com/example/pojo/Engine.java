package com.example.pojo;

public class Engine {
    private Integer engineId;

    private String engineNumber;

    private String engineName;

    private Integer engineState;

    public Integer getEngineId() {
        return engineId;
    }

    public void setEngineId(Integer engineId) {
        this.engineId = engineId;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber == null ? null : engineNumber.trim();
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName == null ? null : engineName.trim();
    }

    public Integer getEngineState() {
        return engineState;
    }

    public void setEngineState(Integer engineState) {
        this.engineState = engineState;
    }
}