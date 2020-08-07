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
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addPost(Post post) {
		return postDao.insertSelective(post);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int delPost(Integer id) {
		return postDao.deleteByPrimaryKey(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updatePost(Post pojo) {
		return postDao.updateByPrimaryKeySelective(pojo);
	}
}
