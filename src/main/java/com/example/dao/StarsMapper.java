package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Stars;

public interface StarsMapper {
    int deleteByPrimaryKey(Integer starsid);

    int insert(Stars record);

    int insertSelective(Stars record);

    Stars selectByPrimaryKey(Integer starsid);

    int updateByPrimaryKeySelective(Stars record);

    int updateByPrimaryKey(Stars record);
    
    @Select("select * from stars")
    List<Stars> queryAll();
}