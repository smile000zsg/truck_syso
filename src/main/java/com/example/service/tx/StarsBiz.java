package com.example.service.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.StarsMapper;
import com.example.dao.TeamsMapper;
import com.example.pojo.Stars;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class StarsBiz {

	@Autowired
	private StarsMapper starsDao;

	public List<Stars> queryAll(){
		return starsDao.queryAll();
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int addStars(Stars pojo) {
		return starsDao.insertSelective(pojo);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int updateStars(Stars pojo) {
		return starsDao.updateByPrimaryKeySelective(pojo);
	}
	
	@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
	public int delStars(Integer id) {
		return starsDao.deleteByPrimaryKey(id);
	}
}
