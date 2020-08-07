package com.example.controller.tx;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("add")
	public Map<String, Object> addPost(@RequestBody Post pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		int count = postBiz.addPost(pojo);
		if(count > 0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@DeleteMapping("delete/{postid}")
	public Map<String, Object> delPost(@PathVariable("postid") Integer postid){
		Map<String, Object> msg = new HashMap<String, Object>();
		int count = postBiz.delPost(postid);
		if(count > 0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
	
	@PutMapping("update")
	public Map<String , Object> updatePost(@RequestBody Post pojo){
		Map<String, Object> msg = new HashMap<String, Object>();
		int count = postBiz.updatePost(pojo);
		if(count > 0) {
			msg.put("code", "200");
		}else {
			msg.put("code", "300");
		}
		return msg;
	}
}
