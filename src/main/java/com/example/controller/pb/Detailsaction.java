package com.example.controller.pb;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.OrderMapper;
import com.example.pojo.Details;
import com.example.service.pb.Detailsbiz;
import com.example.service.pb.Goodsbiz;


@RestController
@RequestMapping("/api/detailsbiz") 
public class Detailsaction {

	@Autowired
	private Detailsbiz detailsbiz;
	
	@Autowired
	private OrderMapper ordermapper;
	
	@Autowired
	private Goodsbiz goodsbiz;
	
	
	@PostMapping("details")
	public Map<String, Object> add(@RequestBody Details d) {
		Details details=detailsbiz.queryBys(d.getOid(), d.getDetailsname());
		Map<String, Object> message=new HashMap<String, Object>();
		if(details==null) {
			int count=detailsbiz.adddate(d);
			if(count>0) {
				message.put("code", "200");
			}else {
				message.put("code", "300");
			}
			}else {
			message.put("code", "400");
			}
		return message;		
	}
	//查询站内维修项目结果集
	@GetMapping("{oid}")
	public List<Details> querysByoid(@PathVariable("oid")String oid) {
		List<Details> list=detailsbiz.queryByoid(oid);
		return list;
	}

	
	@GetMapping("state/{oid}")
	public List<Details> queryByoidstate(@PathVariable("oid")String oid) {
		System.out.println(oid);
		List<Details> list=detailsbiz.queryByoidstate(oid);
		return list;
	}
	

	
	@DeleteMapping("{detailsId}")
	public Map<String, Object> deldeta(@PathVariable("detailsId")Integer detailsId) {
		System.out.println(detailsId);
		int counnt=detailsbiz.deldeta(detailsId);
		Map<String, Object> message=new HashMap<String, Object>();
		if(counnt>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
	@PostMapping("adds/details/{gid}")
	public Map<String, Object> adds(@RequestBody Details dd,@PathVariable("gid")Integer gid) {
			Map<String, Object> message=new HashMap<String,Object>();
			int count=detailsbiz.adddate(dd);
			if(count>0) {
				message.put("code", "200");
				int c=goodsbiz.update(dd.getDetailscount(), gid);
			}else {
				message.put("code", "300");
			}
			return message;
	}
	
	
	//添加接车费用
	@PostMapping("add/zwwx/{oid}/{cost}")
	public Map<String, Object> add(@PathVariable("oid")String oid,@PathVariable("cost")BigDecimal cost) {
			Map<String, Object> message=new HashMap<String,Object>();
			Details d=new Details(oid,"接车费",cost,0,0);
			int c=detailsbiz.adddate(d);
			if(c>0) {
				message.put("code", "200");
			}else {
				message.put("code", "300");
			}
			return message;
	}
	
	@PostMapping("updateprice/{oid}/{upsums}/{reworkcost}")
	public Map<String, Object> updateprice(@PathVariable("oid")String oid,@PathVariable("upsums")BigDecimal sums,@PathVariable("reworkcost")BigDecimal reworkcost) {
		Details d=new Details(oid,"反工费",reworkcost,0,0);
		int c=detailsbiz.updatedetailsdate(oid);
		int count=detailsbiz.adddate(d);
		int count1=ordermapper.updateBy(sums, oid);
		Map<String, Object> message=new HashMap<String, Object>();
		if(count1>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
}
