package com.example.service.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ResignationMapper;
import com.example.pojo.Resignation;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class ResignationBiz {

	@Autowired
	private ResignationMapper resignationDao;

	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addResignation(Resignation pojo) {
		return resignationDao.insertSelective(pojo);
	}
	
	public List<Resignation> queryAllRes(String name){
		return resignationDao.queryAllRes(name);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delResignation(Integer id) {
		return resignationDao.deleteByPrimaryKey(id);
	}
}
