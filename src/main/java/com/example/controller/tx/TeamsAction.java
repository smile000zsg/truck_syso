package com.example.controller.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Teams;
import com.example.service.tx.TeamsBiz;

@RestController
@RequestMapping("api/TX/teams")
public class TeamsAction {

	@Autowired
	private TeamsBiz teamsBiz;
	
	@GetMapping("queryAllTeams")
	public List<Teams> queryAll(){
		return teamsBiz.queryAll();
	}
}
