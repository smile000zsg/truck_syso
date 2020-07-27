package com.example.controller.zjl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Users;
import com.example.service.zjl.UsersService;

@RestController
@RequestMapping("/api")
public class UsersController {
	@Autowired
	private UsersService us;
	
	@GetMapping("{account}/{password}")
 	public Map<String,String> usersLogin(@PathVariable String account,@PathVariable String password) {
		Map<String,String> message = new HashMap<String,String>();
		if(this.us.userLogin(account, password)!=null) {
			message.put("code","200");
		} 
		return message;
	}
	@PostMapping("Users")
	public Map<String,String> insert(@RequestBody Users users) {
		Map<String,String> message = new HashMap<String,String>();
		if(this.us.insert(users)==1) {
			message.put("code","200");
		}	
		return message;
	}
}
