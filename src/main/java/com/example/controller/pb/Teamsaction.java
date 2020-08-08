package com.example.controller.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Teams;
import com.example.service.pb.Teamsbiz;


@RestController
@RequestMapping("/api/teams") 
public class Teamsaction {

	@Autowired
	private Teamsbiz teamsbiz;
	
	@GetMapping("/querys")
	public List<Teams> querys() {
		System.out.println("进入");
		List<Teams> lists=teamsbiz.querys();
		return lists;
	}
}
