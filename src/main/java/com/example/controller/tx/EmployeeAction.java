package com.example.controller.tx;

import java.util.HashMap;
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

import com.example.pojo.Employee;
import com.example.service.tx.EmployeeBiz;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("api/TX/emp")
public class EmployeeAction {
	
	@Autowired
	private EmployeeBiz employeeBiz;

	@GetMapping("{p}/{s}")
	public PageInfo<Employee> queryAll(@PathVariable("p") int p,@PathVariable("s") int s){
		return employeeBiz.queryAll(p, s);
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
}
