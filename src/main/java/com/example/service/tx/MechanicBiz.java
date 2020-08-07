package com.example.service.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MechanicMapper;
import com.example.pojo.Mechanic;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class MechanicBiz {

	@Autowired
	private MechanicMapper mechanicDao;
	
	public List<Mechanic> queryAllMec(){
		return mechanicDao.queryAllMec();
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int addMec(Mechanic pojo) {
		return mechanicDao.insertSelective(pojo);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int updateMec(Mechanic pojo) {
		return mechanicDao.updateByPrimaryKeySelective(pojo);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int delMec(Integer id) {
		return mechanicDao.deleteByPrimaryKey(id);
	}
}
