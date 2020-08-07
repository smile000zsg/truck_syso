package com.example.controller.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Department;
import com.example.service.tx.DepartmentBiz;

@RestController
@RequestMapping("api/TX/dept")
public class DepartmentAction {

	  @Autowired
	  private DepartmentBiz departmentBiz;


	  @GetMapping("query") 
	  public List<Department> queryAllDept(){ 
		  return departmentBiz.queryAllDept(); 
	  }

}
