package com.example.service.zjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.MenuinfoMapper;
import com.example.pojo.Menuinfo;

@Service
public class MenuInfoService {
			
	@Autowired
	private MenuinfoMapper mm;
	
	public List<Menuinfo> queryAll() {
		return this.mm.queryAll();
	}
}
