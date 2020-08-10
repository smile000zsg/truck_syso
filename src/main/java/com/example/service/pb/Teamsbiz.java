package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MechanicMapper;
import com.example.dao.TeamsMapper;
import com.example.pojo.Datum;
import com.example.pojo.Teams;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Teamsbiz {
	
	@Autowired
	private TeamsMapper  teamsmapper;
	
	@Autowired
	private MechanicMapper mechanicmapper;
	
	public List<Teams> querys() {
		return teamsmapper.querys();
	}
	
	public int updatemecstate(String mecname) {
		return mechanicmapper.updatemecstate(mecname);
	}
	
	public int updatemecstates(String mecname) {
		return mechanicmapper.updatemecstates(mecname);
	}
	
}
