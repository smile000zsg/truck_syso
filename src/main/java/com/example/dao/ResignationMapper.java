package com.example.dao;

import java.util.List;

import com.example.pojo.Resignation;

public interface ResignationMapper {
    int deleteByPrimaryKey(Integer resid);

    int insert(Resignation record);

    int insertSelective(Resignation record);

    Resignation selectByPrimaryKey(Integer resid);

    int updateByPrimaryKeySelective(Resignation record);

    int updateByPrimaryKey(Resignation record);
    
    List<Resignation> queryAllRes();
}