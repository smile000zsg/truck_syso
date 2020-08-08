package com.example.controller.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Subset;
import com.example.service.pb.Subsetbiz;


@RestController
@RequestMapping("/api/sub") 
public class Subsetaction {

	@Autowired
	private Subsetbiz subsetbiz;
	
	@GetMapping("subset/{cid}")
	public List<Subset> queryByid(@PathVariable("cid")Integer cid) {
		List<Subset> list=subsetbiz.queryByid(cid);
		return list;
	}
	
	
}
