package com.example.controller.ymj;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Settlement;
import com.example.service.ymj.IndexBiz;

@RestController
@RequestMapping("/ymj/api/index")
public class IndexAction {

	@Autowired
	private IndexBiz biz;
	
//	@GetMapping("money")
//	public Settlement SelectByDayMoney() {
//		
//		Date paymenttime = new Date();
//		System.out.println("当前时间："+paymenttime);
//		return biz.selectByDayMoney(paymenttime);
//	}
	
//	@GetMapping
//	public List<Settlement> query(){
//		return this.biz.query();
//	}
}
