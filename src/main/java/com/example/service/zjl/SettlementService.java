package com.example.service.zjl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.OrderMapper;
import com.example.dao.SettlementMapper;
import com.example.pojo.Order;
import com.example.pojo.Settlement;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class SettlementService {
	
	@Autowired
	private SettlementMapper sm;
	
	@Autowired
	private OrderMapper om;
	
	
	
	public PageInfo<Settlement> querySettlement(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo <Settlement>(this.sm.querySettlement());
	}
	
	
	
}
