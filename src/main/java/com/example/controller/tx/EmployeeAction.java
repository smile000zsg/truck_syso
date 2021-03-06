package com.example.controller.tx;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.pojo.Employee;
import com.example.pojo.Resignation;
import com.example.service.tx.EmployeeBiz;
import com.example.service.tx.ResignationBiz;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/TX/emp")
public class EmployeeAction {
	
	@Autowired
	private EmployeeBiz employeeBiz;
	
	@Autowired
	private ResignationBiz resignationBiz;

	@GetMapping("query")
	public PageInfo<Employee> queryAll(String p,String s,String name,String phone,String deptid){
		return employeeBiz.queryAll(Integer.parseInt(p),Integer.parseInt(s),name,phone,deptid);
	}
	
	@PostMapping("add")
	public Map<String, Object> addEmployee(@RequestBody Employee emp){
		Map<String, Object> msg = new HashMap<String, Object>();
		int count = employeeBiz.addEmployee(emp);
		if(count>0) {
			msg.put("code", 200);
		}else {
			msg.put("code", 300);
		}
		return msg;
	}
	
	@PutMapping("update")
	public Map<String, Object> updateEmployee(@RequestBody Employee emp){
		Map<String, Object> msg = new HashMap<>();
		int count = employeeBiz.updateEmployee(emp);
		if(count>0) {
			msg.put("code", 200);
		}else {
			msg.put("code", 300);
		}
		return msg;
	}
	
	@PutMapping("res/{id}/{deptid}/{reason}")
	public Map<String, Object> resignationById(@PathVariable("id") Integer id ,@PathVariable("deptid") Integer deptid,
			@PathVariable("reason")String reason){
		Map<String, Object> msg = new HashMap<>();
		int count = employeeBiz.resignationById(id);
		if(count>0) {
			Resignation res = new Resignation();
			res.setEmpid(id);
			res.setDeptid(deptid);
			res.setResdate(new Date());
			res.setResignationreson(reason);
			int result = resignationBiz.addResignation(res);
			if(result > 0) {
				msg.put("code", "200");
			}else {
				msg.put("code", "300");
			}
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@PutMapping("update2")
	public Map<String, Object> updateDirectory(@RequestBody List<Employee> empList){
		Map<String, Object> msg = new HashMap<>();
		List<Employee> emp = JSONObject.parseArray(JSON.toJSONString(empList), Employee.class);
		for (Employee employee : emp) {
			employeeBiz.updateEmployee(employee);
		}
		msg.put("code", "200");
		return msg;
	}
}
