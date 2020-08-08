package com.example.service.zjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.RoleMapper;
import com.example.pojo.Role;

@Service
public class RoleService {

	@Autowired
	private RoleMapper rm;
 
	public List<Role> RoleAll(){
		return this.rm.RoleAll();
	}
}
