package com.example.controller.pb;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.pojo.Client;
import com.example.pojo.Datum;
import com.example.pojo.Motorcycle;
import com.example.pojo.Order;
import com.example.pojo.Vbrand;
import com.example.service.pb.Clientbiz;
import com.example.service.pb.Datumbiz;
import com.example.service.pb.Vbrandbiz;
import com.example.service.pb.orderbiz;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/client") // 命名空间
public class myaction {
	
	@Autowired
	private Clientbiz cli;
	
	@Autowired
	private Vbrandbiz vbrandbiz;

	@Autowired
	private Datumbiz datumbiz;
	
	@Autowired
	private orderbiz orderbiz;
	
	//查询车辆维修历史记录
	@GetMapping("/queryhistory/{clid}")
	public List<Order> queryhistory(@PathVariable("clid")String clid) {
		Datum datum=datumbiz.queryByclid(clid);
		List<Order> list=orderbiz.list(datum.getLicense(), new Date());
		return list;
	}
	
	
	//查询车辆品牌
	@GetMapping("/queryBrand")
	public List<Vbrand> queryBrand() {
		List<Vbrand> list=vbrandbiz.query();
		return list;
	}
	
	

	@GetMapping("queryByid/{id}")
	public Client queryByid(@PathVariable String id) {
		Client c=cli.queryByclid(id);
		return c;
	}
	
	@GetMapping("{p}/{s}")
	public PageInfo<Client> querys(@PathVariable Integer p, @PathVariable Integer s) {
		return cli.query(p, s);
	}
	
	//根据客户名称查询
	@GetMapping("{p}/{s}/{name}")
	public PageInfo<Client> queryByname(@PathVariable Integer p, @PathVariable Integer s,@PathVariable String name) {
		return cli.queryByname(p, s,name);
	}
	
	@DeleteMapping("person/{clid}")
	public Map<String, Object> deletePersonById(@PathVariable String clid) {
		cli.removePersonById(clid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PostMapping("client")
	public Map<String, Object> addPerson(@RequestBody Client record) {
		cli.addPerson(record);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	@PutMapping("client")
	public Map<String, Object> updateByPrimaryKeySelective(@RequestBody Client record) {
		cli.updateByPrimaryKeySelective(record);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	//根据车辆品牌id查询车型
	@GetMapping("queryBybid/{bid}")
	public List<Motorcycle> queryBybid(@PathVariable("bid")Integer bid) {
		List<Motorcycle> list=vbrandbiz.queryBybid(bid);
		return list;
	}
	
	
}
