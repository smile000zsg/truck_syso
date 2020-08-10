package com.example.service.pb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DatumMapper;
import com.example.pojo.Datum;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Datumbiz {
	
	@Autowired
	private DatumMapper datummapper;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insert(Datum record) {
		int coutn=datummapper.insertSelective(record);
		return coutn;
	}

	
	public Datum queryByclid(String clid) {
		Datum d=datummapper.queryByclid(clid);
		return d;
	}
	
}
