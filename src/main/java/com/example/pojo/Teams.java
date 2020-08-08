package com.example.pojo;

import java.util.List;

public class Teams {
    private Integer teamsid;

    private String teamsname;
  
  
    private List<Mechanic> mechanic;
    
    
    
	public List<Mechanic> getMechanic() {
		return mechanic;
	}

	public void setMechanic(List<Mechanic> mechanic) {
		this.mechanic = mechanic;
	}

	public Integer getTeamsid() {
		return teamsid;
	}

	public void setTeamsid(Integer teamsid) {
        this.teamsid = teamsid;
    }

    public String getTeamsname() {
        return teamsname;
    }

    public void setTeamsname(String teamsname) {
        this.teamsname = teamsname == null ? null : teamsname.trim();
    }
}