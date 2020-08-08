package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.example.dao.GoodsMapper;
import com.example.pojo.Goods;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Goodsbiz {
	
	@Autowired
	private GoodsMapper goodsmapper;
	
	public List<Goods> querys() {
		List<Goods> lists=goodsmapper.querys();
		return lists;
	}
	
	public  List<Goods> queryByid(Integer gid) {
		 List<Goods> g=goodsmapper.queryByid(gid);
		return g;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int update(Integer ginventory,Integer gid) {
		int count=goodsmapper.update(ginventory, gid);
		return count;
	}
	
}
