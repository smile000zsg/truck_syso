package com.example.dao;

import com.example.pojo.Service_Type;

public interface Service_TypeMapper {
    int deleteByPrimaryKey(Integer serviceTypeid);

    int insert(Service_Type record);

    int insertSelective(Service_Type record);

    Service_Type selectByPrimaryKey(Integer serviceTypeid);

    int updateByPrimaryKeySelective(Service_Type record);

    int updateByPrimaryKey(Service_Type record);
}