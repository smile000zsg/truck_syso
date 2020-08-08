package com.example.controller.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Category;
import com.example.service.pb.Categorybiz;


@RestController
@RequestMapping("/api/catebiz") 
public class Categoryaction {

	@Autowired
	private Categorybiz catebiz;
	
	
	@GetMapping("/cate")
	public List<Category> querys() {
		return catebiz.querys(); 
	}
	
	
}
