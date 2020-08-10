package com.example.controller.pb;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Datum;
import com.example.pojo.Order;
import com.example.service.pb.Datumbiz;
import com.example.service.pb.Teamsbiz;
import com.example.service.pb.orderbiz;


@RestController
@RequestMapping("/api/weixiu") 
public class weixiuaction {
	
	@Autowired
	private orderbiz orderbi;
	
	@Autowired
	private Teamsbiz teamsbiz;

	@GetMapping("queryByid/{olicense}")
	public Map<String , Object> queryByid(@PathVariable("olicense")String olicense) {
		Map<String , Object> message=new HashMap<String, Object>();
		Datum datum=orderbi.queryByid(olicense);
		if(datum==null) {
			message.put("code","500");
			System.out.println("12");
		}else {
			Order o=orderbi.queryByolicense(olicense);
			if(o!=null) {
				message.put("code", "300");
			}else {
				Datum d=orderbi.queryByid(olicense);
				message.put("zhi", d);
				message.put("code", "200");
			}
		}		
		return message;
	}
	
	
	
	
	@PostMapping("order")
	public Map<String, Object> insert(@RequestBody Order o) {
		int coun=orderbi.adddate(o);
		Map<String, Object> message=new HashMap<String, Object>();
		if(coun>0) {
			int count=teamsbiz.updatemecstate(o.getCrew());
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
	
	@PostMapping("zwwx/order")
	public Map<String, Object> insert1(@RequestBody Order o) {
		
		int coun=orderbi.adddate(o);
		Map<String, Object> message=new HashMap<String, Object>();
		if(coun>0) {
			int c=orderbi.updateByid(o.getOvehicle());
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
	
	@PostMapping("zwwx/order1")
	public Map<String, Object> insert2(@RequestBody Order o) {
		int coun=orderbi.adddate(o);
		Map<String, Object> message=new HashMap<String, Object>();
		if(coun>0) {
			int count=teamsbiz.updatemecstate(o.getCrew());
			int c=orderbi.updateByid(o.getOvehicle());
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
}
