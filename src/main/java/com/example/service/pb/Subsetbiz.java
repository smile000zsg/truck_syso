package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.SubsetMapper;
import com.example.pojo.Subset;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Subsetbiz {
	
	@Autowired
	private SubsetMapper subsetmapper;
	
	public List<Subset> queryByid(Integer cid) {
		List<Subset> list=subsetmapper.queryByid(cid);
		return list;
	}
}
