package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MotorcycleMapper;
import com.example.dao.VbrandMapper;
import com.example.pojo.Motorcycle;
import com.example.pojo.Vbrand;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Vbrandbiz {

	@Autowired
	private VbrandMapper vbrandmapper;
	
	@Autowired
	private MotorcycleMapper motormapper;
	
	public List<Vbrand> query(){
		List<Vbrand> list=vbrandmapper.list();
		return list;
	}
	
	public List<Motorcycle> queryBybid(Integer bid){
		return motormapper.list(bid);
	}
}
