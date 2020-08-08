package com.example.service.pb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.CategoryMapper;
import com.example.pojo.Category;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class Categorybiz {
	@Autowired
	private CategoryMapper cate;
	
	
	public List<Category> querys(){
		return cate.querys();
	}
}
