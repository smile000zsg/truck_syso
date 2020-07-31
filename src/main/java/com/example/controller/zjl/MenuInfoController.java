package com.example.controller.zjl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Menuinfo;
import com.example.service.zjl.MenuInfoService;

@RestController
@RequestMapping("/api/menuinfo")
public class MenuInfoController {
	@Autowired
	private MenuInfoService mis;
	
	@GetMapping
	public List<Menuinfo> queryAll() {
		return this.mis.queryAll();
	}
}
