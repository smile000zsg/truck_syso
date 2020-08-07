package com.example.controller.tx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Resignation;
import com.example.service.tx.EmployeeBiz;
import com.example.service.tx.ResignationBiz;

@RestController
@RequestMapping("api/TX/res")
public class ResignationAction {

	@Autowired
	private ResignationBiz resignationBiz;
	
	@Autowired
	private EmployeeBiz employeeBiz;
	
	@GetMapping("query")
	public List<Resignation> queryAllRes(){
		return resignationBiz.queryAllRes();
	}
	
	@DeleteMapping("rollback/{empid}/{resid}")
	public Map<String, Object> rollbackById(@PathVariable("empid") Integer empid,@PathVariable("resid")Integer resid){
		Map<String, Object> msg = new HashMap<String, Object>();
		int count = resignationBiz.delResignation(resid);
		if(count > 0) {
			int result = employeeBiz.rollbackById(empid);
			if(result>0) {
				msg.put("code", "200");
			}else {
				msg.put("code", "300");
			}
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@DeleteMapping("commit/{resid}")
	public Map<String, Object> commitById(@PathVariable Integer resid){
		Map<String, Object> msg = new HashMap<String, Object>();
		int count = resignationBiz.delResignation(resid);
		if(count > 0) {
			msg.put("code", "200");
		}else{
			msg.put("code", "300");
		}
		return msg;
	}
}
