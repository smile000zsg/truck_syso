package com.example.dao;

import com.example.pojo.Teams;

public interface TeamsMapper {
    int deleteByPrimaryKey(Integer teamsid);

    int insert(Teams record);

    int insertSelective(Teams record);

    Teams selectByPrimaryKey(Integer teamsid);

    int updateByPrimaryKeySelective(Teams record);

    int updateByPrimaryKey(Teams record);
}