package com.example.controller.ymj;

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

import com.alibaba.fastjson.JSONPObject;
import com.example.pojo.*;
import com.example.service.ymj.CarfileBiz;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/ymj/api/carfiles")
public class CarfileAction {

	@Autowired
	private CarfileBiz carfilebiz;
	
	@GetMapping("carfile")
	public PageInfo<Carfile> queryPage(String p,String s,String abc){
		return carfilebiz.findPersonListByPage(Integer.parseInt(p), Integer.parseInt(s),abc);
	}
	@GetMapping(value = "{p}/{s}/jsonp")
	public JSONPObject getPersonListByPageToJSONP(@PathVariable Integer p, @PathVariable Integer s,String abc) throws Exception {
		System.out.println("分页jsonp");
		// 跨域函数名称
		JSONPObject jsonp = new JSONPObject("callback");// 非常重要。对应jquery中jsonpCallback设置
		// 追加json数据
		// callback({})
		jsonp.addParameter(carfilebiz.findPersonListByPage(p, s,abc));
		return jsonp;
	}
	@GetMapping("carfile/{carfileId}")
	public Carfile queryById(@PathVariable Integer carfileId) {
		return carfilebiz.queryByid(carfileId);
	}
	@PostMapping("carfile")
	public Map<String, Object> InsertCarfile(@RequestBody Carfile carfile){
		carfilebiz.addCarfile(carfile);
		Map<String,Object> message = new HashMap<String,Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@PutMapping("carfile")
	public Map<String, Object> updateCarfile(@RequestBody Carfile carfile){
		carfilebiz.updateCarfile(carfile);
		Map<String,Object> message = new HashMap<String,Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@DeleteMapping("carfile/{carfileId}")
	public Map<String, Object> daleteCarfile(@PathVariable Integer carfileId){
		carfilebiz.deleteCarfile(carfileId);
		Map<String,Object> message = new HashMap<String,Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	@GetMapping("carfileType")
	public List<Carfile_Type> QueryCarfileType(){
		return carfilebiz.querycarfileType();
	}
	@GetMapping("engine")
	public List<Engine> QeuryEngine(){
		System.out.println(carfilebiz.queryEngine().toString());
		return carfilebiz.queryEngine();
	}
}
