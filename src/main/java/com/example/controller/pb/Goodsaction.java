package com.example.controller.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Commodity;
import com.example.pojo.Goods;
import com.example.service.pb.Goodsbiz;


@RestController
@RequestMapping("/api/goods") // 命名空间
public class Goodsaction {

	@Autowired
	private Goodsbiz goodsbiz;
	
	@GetMapping("/good")
	public List<Goods> querys() {
		System.out.println("进入");
		List<Goods> list=goodsbiz.querys();
		return list;
	}
	
	@GetMapping("/good/{gid}")
	public  List<Goods> queryByid(@PathVariable("gid")Integer gid) {
		 List<Goods> g=goodsbiz.queryByid(gid);
		return g;
	}
}
