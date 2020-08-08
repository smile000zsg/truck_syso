package com.example.pojo;

import java.util.List;

public class Carfile {
    private Integer carfileId;

    private Integer carfileTypeid;

    private Integer engineTypeid;
    
	private String CarfileName;

    private Integer carfileState;
    
    private Integer carfileprice;
   	
 	private List<Engine> engine;
 	
 	private List<Carfile_Type>  carfile_type;
 	
	

	public Integer getCarfileTypeid() {
		return carfileTypeid;
	}

	public void setCarfileTypeid(Integer carfileTypeid) {
		this.carfileTypeid = carfileTypeid;
	}

	public List<Engine> getEngine() {
		return engine;
	}

	public void setEngine(List<Engine> engine) {
		this.engine = engine;
	}

	public List<Carfile_Type> getCarfile_type() {
		return carfile_type;
	}

	public void setCarfile_type(List<Carfile_Type> carfile_type) {
		this.carfile_type = carfile_type;
	}

	public Integer getEngineTypeid() {
		return engineTypeid;
	}

	public void setEngineTypeid(Integer engineTypeid) {
		this.engineTypeid = engineTypeid;
	}

	public String getCarfileName() {
		return CarfileName;
	}

	public void setCarfileName(String carfileName) {
		CarfileName = carfileName;
	}



    public Integer getCarfileprice() {
		return carfileprice;
	}

	public void setCarfileprice(Integer carfileprice) {
		this.carfileprice = carfileprice;
	}

	public Integer getCarfileId() {
        return carfileId;
    }

    public void setCarfileId(Integer carfileId) {
        this.carfileId = carfileId;
    }

    public Integer getCarfileState() {
        return carfileState;
    }

    public void setCarfileState(Integer carfileState) {
        this.carfileState = carfileState;
    }
}