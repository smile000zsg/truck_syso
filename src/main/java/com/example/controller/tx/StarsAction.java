package com.example.controller.tx;

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

import com.example.pojo.Stars;
import com.example.service.tx.StarsBiz;

@RestController
@RequestMapping("api/TX/stars")
public class StarsAction {

	@Autowired
	private StarsBiz starsBiz;

	@GetMapping("queryAllStars")
	public List<Stars> queryAll(){
		return starsBiz.queryAll();
	}
	
	@PostMapping("addStars")
	public Map<String, Object> addStars(@RequestBody Stars pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(starsBiz.addStars(pojo)>0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@PutMapping("update")
	public Map<String, Object> updateStars(@RequestBody Stars pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(starsBiz.updateStars(pojo)>0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@DeleteMapping("del/{starsid}")
	public Map<String, Object> delStars(@PathVariable Integer starsid){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(starsBiz.delStars(starsid)>0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
}
