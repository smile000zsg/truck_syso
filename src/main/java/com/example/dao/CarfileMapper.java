package com.example.dao;

import com.example.pojo.Carfile;

public interface CarfileMapper {
    int deleteByPrimaryKey(Integer carfileId);

    int insert(Carfile record);

    int insertSelective(Carfile record);

    Carfile selectByPrimaryKey(Integer carfileId);

    int updateByPrimaryKeySelective(Carfile record);

    int updateByPrimaryKey(Carfile record);
}