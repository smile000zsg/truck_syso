package com.example.controller.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.Post;
import com.example.service.tx.PostBiz;

@RestController
@RequestMapping("api/TX/post")
public class PostAction {

	@Autowired
	private PostBiz postBiz;
	
	
	@GetMapping("query")
	public List<Post> queryAllPost(){
		return postBiz.queryAllPost();
	}
}
