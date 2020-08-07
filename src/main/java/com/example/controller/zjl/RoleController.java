package com.example.controller.zjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Role;
import com.example.service.zjl.RoleService;

@RestController
@RequestMapping("/api/role")
public class RoleController {

	@Autowired
	private RoleService rs;
	
	@GetMapping
	public List<Role> RoleAll(){
		return this.rs.RoleAll();
	}
}
