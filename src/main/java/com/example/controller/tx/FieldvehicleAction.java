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

import com.example.pojo.Fieldvehicle;
import com.example.service.tx.FieldvehicleBiz;

@RestController
@RequestMapping("api/TX/fieldvehicle")
public class FieldvehicleAction {
	
	@Autowired
	private FieldvehicleBiz fieldvehicleBiz;

	@GetMapping("query")
	public List<Fieldvehicle> queryAll(){
		return fieldvehicleBiz.queryAll();
	}
	
	@PostMapping("add")
	public Map<String, Object> addFieldvehicle(@RequestBody Fieldvehicle pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(fieldvehicleBiz.addFieldvehicle(pojo)>0) {
			msg.put("code", "200");
		}else {
			msg.put("code","300");
		}
		return msg;
	}
	
	@PutMapping("update")
	public Map<String, Object> updateFieldvehicle(@RequestBody Fieldvehicle pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(fieldvehicleBiz.updateFieldvehicle(pojo)>0) {
			msg.put("code", "200");
		}else {
			msg.put("code","300");
		}
		return msg;
	}
	
	@DeleteMapping("del/{fieldid}")
	public Map<String, Object> delFieldvehicle(@PathVariable Integer fieldid){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(fieldvehicleBiz.delFieldvehicle(fieldid)>0) {
			msg.put("code", "200");
		}else {
			msg.put("code","300");
		}
		return msg;
	}
}
