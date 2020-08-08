package com.example.controller.pb;

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

import com.example.pojo.Client;
import com.example.pojo.Vbrand;
import com.example.service.pb.Clientbiz;
import com.example.service.pb.Vbrandbiz;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/client") // 命名空间
public class myaction {
	
	@Autowired
	private Clientbiz cli;
	
	@Autowired
	private Vbrandbiz vbrandbiz;
	
	//查询车辆品牌
	@GetMapping("/queryBrand")
	public List<Vbrand> queryBrand() {
		List<Vbrand> list=vbrandbiz.query();
		return list;
	}
	
	

	@GetMapping("queryByid/{id}")
	public Client queryByid(@PathVariable String id) {
		Client c=cli.queryByid(id);
		return c;
	}
	
	@GetMapping("{p}/{s}")
	public PageInfo<Client> querys(@PathVariable Integer p, @PathVariable Integer s) {
		return cli.query(p, s);
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
	
	
}
