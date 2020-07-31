package com.example.service.zjl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UsersMapper;
import com.example.pojo.Users;

@Service
public class UsersService {
	@Autowired
	private UsersMapper um;
	public Users userLogin(String account,String password) {
		return this.um.userLogin(account, password);
	}
	public int insert(Users record) {
		return this.um.insert(record);
	}
}
