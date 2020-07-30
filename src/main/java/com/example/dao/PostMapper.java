package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Post;

public interface PostMapper{
    int deleteByPrimaryKey(Integer postid);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Integer postid);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
    @Select("select * from post")
    List<Post> queryAllPost();
}