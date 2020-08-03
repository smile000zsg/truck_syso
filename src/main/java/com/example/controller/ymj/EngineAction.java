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
import com.example.pojo.Engine;
import com.example.service.ymj.EngineBiz;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/ymj/api/engines")
public class EngineAction {
	@Autowired
	private EngineBiz enginebiz;
	
@GetMapping("{p}/{s}")
public PageInfo<Engine> queryPage(@PathVariable Integer p, @PathVariable Integer s) {
	System.out.println("分页");
	return enginebiz.findPersonListByPage(p, s);
}

@GetMapping(value = "{p}/{s}/jsonp")
public JSONPObject getPersonListByPageToJSONP(@PathVariable Integer p, @PathVariable Integer s) throws Exception {
	System.out.println("分页jsonp");
	// 跨域函数名称
	JSONPObject jsonp = new JSONPObject("callback");// 非常重要。对应jquery中jsonpCallback设置
	// 追加json数据
	// callback({})
	jsonp.addParameter(enginebiz.findPersonListByPage(p, s));
	return jsonp;
}

@GetMapping("engine/{engineId}")
public Engine queryById(@PathVariable Integer engineId) {
	return enginebiz.getEngineById(engineId);
}

@GetMapping("engine")
public List<Engine> selectAll(){
	return enginebiz.seleteAll();
}
@PostMapping("engine")
public Map<String,Object> insertAll(@RequestBody Engine engine){
	enginebiz.insertEngine(engine);
	Map<String,Object> message = new HashMap<String,Object>();
	message.put("code", "200");
	message.put("msg", "ok");
	return message;
}

@PutMapping("engine")
public Map<String,Object> updateAll(@RequestBody Engine engine){
	enginebiz.updateEngine(engine);
	Map<String,Object> message = new HashMap<String,Object>();
	message.put("code", "200");
	message.put("msg", "ok");
	return message;
}

@DeleteMapping("engine/{engineId}")
public Map<String,Object> deleteById(@PathVariable Integer engineId){
	enginebiz.deleteById(engineId);
	Map<String,Object> message = new HashMap<String,Object>();
	message.put("code", "200");
	message.put("msg", "ok");
	return message;
}
}
