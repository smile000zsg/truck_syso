package com.example.controller.zjl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Order;
import com.example.pojo.Settlement;
import com.example.service.zjl.SettlementService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/settlement")
public class SettlementController {

	@Autowired
	private SettlementService ss;
	
	@GetMapping("{pageNum}/{pageSize}")
	public PageInfo<Settlement> querySettlement(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
		return this.ss.querySettlement(pageNum,pageSize);
	}
	@GetMapping("queryDetails/{oid}")
	public List<Order> queryDetails(@PathVariable String oid){
		return this.ss.queryDetails(oid);
	}
}
