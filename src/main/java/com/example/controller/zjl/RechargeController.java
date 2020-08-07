package com.example.controller.zjl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.zjl.RechargeService;

@RestController
@RequestMapping("/api/recharge")
public class RechargeController {
	@Autowired
	private RechargeService rs;
	
	@PutMapping("{price}/{uid}")
	public Map<String,Object> udateprice (@PathVariable Integer price,@PathVariable Integer uid) {
		Map<String,Object> message = new HashMap<String,Object>();
		if(this.rs.udateprice(price,uid)!=0) {
			message.put("code","200");
		}
		return message;
	}
}
