package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DetailsMapper;
import com.example.pojo.Details;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Detailsbiz {

	@Autowired
	private DetailsMapper detailsmapper;
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int adddate(Details record) {
		int count =detailsmapper.insertSelective(record);
		return count;
	}
	
	//查询站内维修项目结果集
	public List<Details> queryByoid(String oid) {
		List<Details> list=detailsmapper.queryByoid(oid);
		return list;
	}
	
		
	
	public List<Details> queryByoidstate(String oid) {
		List<Details> list=detailsmapper.queryByoidstate(oid);
		return list;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deldeta(Integer detailsId) {
		int count =detailsmapper.deldeta(detailsId);
		return count;
	}
	
	public Details queryBys(String oid,String detailsname) {
		Details details=detailsmapper.queryBys(oid, detailsname);
		return details;
	}
	
	public int updatedetailsdate(String oid) {
		int count=detailsmapper.updatedetailsdate(oid);
		return count;
	}
}
