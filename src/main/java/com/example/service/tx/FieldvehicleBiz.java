package com.example.service.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.FieldvehicleMapper;
import com.example.pojo.Fieldvehicle;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class FieldvehicleBiz {

	@Autowired
	private FieldvehicleMapper fieldvehicleDao;
	
	public List<Fieldvehicle> queryAll(){
		return fieldvehicleDao.queryAll();
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addFieldvehicle(Fieldvehicle pojo) {
		return fieldvehicleDao.insertSelective(pojo);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateFieldvehicle(Fieldvehicle pojo) {
		return fieldvehicleDao.updateByPrimaryKeySelective(pojo);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delFieldvehicle(Integer id) {
		return fieldvehicleDao.deleteByPrimaryKey(id);
	}
}
