package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Category;

public interface CategoryMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Category record);

    int insertSelective(Category record);

    Category selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
    
    @Select("SELECT * FROM category")
    List<Category> querys();
}