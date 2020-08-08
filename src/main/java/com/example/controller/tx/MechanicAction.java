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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Mechanic;
import com.example.service.tx.MechanicBiz;

@RestController
@RequestMapping("api/TX/mec")
public class MechanicAction {

	@Autowired
	private MechanicBiz mechanicBiz;

	//@GetMapping("queryAllMec")
	//public List<Mechanic> queryAllMec(){
	//	return mechanicBiz.queryAllMec();
	//}
	
	@PostMapping("add")
	public Map<String, Object> addMec(@RequestBody Mechanic pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(mechanicBiz.addMec(pojo) > 0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@PutMapping("updateMec")
	public Map<String, Object> updateMec(@RequestBody Mechanic pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(mechanicBiz.updateMec(pojo) > 0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@DeleteMapping("delMec/{mecid}")
	public Map<String, Object> delMec(@PathVariable Integer mecid){
		Map<String, Object> msg = new HashMap<String, Object>();
		if(mechanicBiz.delMec(mecid) > 0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
}
