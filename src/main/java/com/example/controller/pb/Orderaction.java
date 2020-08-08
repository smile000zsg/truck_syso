package com.example.controller.pb;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Fieldvehicle;
import com.example.pojo.Order;
import com.example.service.pb.orderbiz;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/order") // 命名空间
public class Orderaction {
	
	@Autowired
	private orderbiz orderbi;
	
	@GetMapping("{p}/{s}")
	public PageInfo<Order> querys(@PathVariable Integer p, @PathVariable Integer s) {
		return orderbi.query(p, s);
	}
	
	@GetMapping("{oid}")
	public Order queryorder(@PathVariable("oid")String oid) {
		Order o=orderbi.queryorder(oid);
		return o;
	}
	
	@PutMapping("{oid}")
	public Map<String, Object> updateBywstate(@PathVariable("oid")String oid) {
		Map<String, Object> message=new HashMap<String, Object>();
		String finishtime=LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println(finishtime);
		int count=orderbi.updateBywstate(oid,finishtime);
		if(count>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
	@PutMapping("update/{oid}/{crew}/{penaltyamount}/{reworkreason}")
	public Map<String, Object> update(@PathVariable("oid")String oid,@PathVariable("crew")String crew,@PathVariable("penaltyamount")BigDecimal penaltyamount,@PathVariable("reworkreason")String reworkreason) {
			Map<String, Object> message=new HashMap<String, Object>();
			int count=orderbi.update(oid, crew, reworkreason, penaltyamount);
			if(count>0) {
				message.put("code", "200");
			}else {
				message.put("code", "300");
			}
			return message;
	}
	
	//查询外派车辆
	@GetMapping("/fiequery")
	public List<Fieldvehicle>  fiequery() {
		List<Fieldvehicle> list=orderbi.fiequery();
		return list;
	}
	
}
