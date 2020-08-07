package com.example.service.zjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RechargeMapper;

@Service
public class RechargeService {
	 @Autowired
	 private RechargeMapper rm;
	 	
	 public int udateprice (Integer price,Integer uid) {
		 return this.rm.udateprice(price,uid);
	 }
}
