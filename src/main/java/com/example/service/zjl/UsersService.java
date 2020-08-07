package com.example.service.zjl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.UsersMapper;
import com.example.pojo.Users;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

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
	
	public PageInfo<Users> selectAll(Integer pageNum,Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo <Users>(this.um.selectAll());
	}
	
	public Users selecyByCard(String vipcard) {
		return this.um.selecyByCard(vipcard);
	}
}
