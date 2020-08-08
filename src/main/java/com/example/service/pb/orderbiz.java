package com.example.service.pb;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.DatumMapper;
import com.example.dao.FieldvehicleMapper;
import com.example.dao.OrderMapper;
import com.example.pojo.Client;
import com.example.pojo.Datum;
import com.example.pojo.Fieldvehicle;
import com.example.pojo.Order;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class orderbiz {

	@Autowired
	private DatumMapper  datummapper;
	
	@Autowired
	private FieldvehicleMapper fieldvehiclemapper;
	
	@Autowired
	private OrderMapper ordermapper;
	
	public Datum queryByid(String license) {
		return datummapper.queryByid(license);
	}
	
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int adddate(Order record) {
		int count =ordermapper.insertSelective(record);
		return count;
	}
	
	public PageInfo<Order> query(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Order>(ordermapper.querys());
	}
	
	
	public Order queryByolicense(String olicense) {
		Order o=ordermapper.queryByid(olicense);
		return o;
	}
	
	public Order queryorder(String oid) {
		Order order=ordermapper.queryorder(oid);
		return order;
	} 
	
	public int updateBywstate(@Param("oid")String oid,@Param("finishtime")String finishtime) {
		int count=ordermapper.updateBywstate(oid,finishtime);
		return count;
	}
	
	public int update(String oid,String crew,String reworkreason,BigDecimal penaltyamount) {
		int count=ordermapper.update(crew, reworkreason, penaltyamount, oid);
		return count;
	}
	
	public int updateBy(BigDecimal sums,String oid) {
		int count=ordermapper.updateBy(sums, oid);
		return count;
	}
	
	public List<Fieldvehicle> fiequery(){
		List<Fieldvehicle> list=fieldvehiclemapper.query();
		return list;
	}
	
	public int updateByid(String carbrand) {
		int count=fieldvehiclemapper.updateByid(carbrand);
		return count;
	}
}
