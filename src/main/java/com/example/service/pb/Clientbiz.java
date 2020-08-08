package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.ClientMapper;
import com.example.pojo.Client;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Clientbiz {
	
	@Autowired
	private ClientMapper clientmapper;
	
	public PageInfo<Client> query(Integer pageNum, Integer pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Client>(clientmapper.querys());
	}
	
	public Client queryByid(String clid) {
		return clientmapper.queryByid(clid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void removePersonById(String clid) {
		clientmapper.del(clid);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void addPerson(Client record) {
		clientmapper.insertSelective(record);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public void updateByPrimaryKeySelective(Client record) {
		clientmapper.updateByPrimaryKeySelective(record);
	}
	

}
