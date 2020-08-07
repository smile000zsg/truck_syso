package com.example.pojo;

import java.util.List;

public class Menuinfo {
    private Integer fid;

    private String menuname;
    
    private List<Menu_Next> ment_next;
    
    private List<Next_Er> next_er;
    
    
    public List<Menu_Next> getMent_next() {
		return ment_next;
	}

	public void setMent_next(List<Menu_Next> ment_next) {
		this.ment_next = ment_next;
	}

	public List<Next_Er> getNext_er() {
		return next_er;
	}

	public void setNext_er(List<Next_Er> next_er) {
		this.next_er = next_er;
	}

	public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname == null ? null : menuname.trim();
    }
}