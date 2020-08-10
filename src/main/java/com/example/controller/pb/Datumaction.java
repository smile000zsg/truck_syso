package com.example.controller.pb;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Datum;
import com.example.service.pb.Datumbiz;

@RestController
@RequestMapping("/api/datum") 
public class Datumaction {

	@Autowired
	private Datumbiz datumbiz;
	
	@PostMapping("datum")
	public Map<String, Object> insert(@RequestBody Datum datum) {
		Map<String, Object> message=new HashMap<String, Object>();
		int count=datumbiz.insert(datum);
		if(count>0) {
			message.put("code", "200");
		}else {
			message.put("code", "300");
		}
		return message;
	}
	
}
