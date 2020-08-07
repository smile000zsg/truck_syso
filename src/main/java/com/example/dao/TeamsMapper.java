package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Teams;

public interface TeamsMapper {
    int deleteByPrimaryKey(Integer teamsid);

    int insert(Teams record);

    int insertSelective(Teams record);

    Teams selectByPrimaryKey(Integer teamsid);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKey(Teams record);
    
    @Select("select * from teams")
    List<Teams> queryAll();
}