package com.example.service.tx;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.PostMapper;
import com.example.pojo.Post;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class PostBiz {
	
	@Autowired
	private PostMapper postDao;
	
	public List<Post> queryAllPost(){
		return postDao.queryAllPost();
	}
}
