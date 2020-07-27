package com.example.dao;

import com.example.pojo.Service;

public interface ServiceMapper {
    int deleteByPrimaryKey(Integer serviceId);

    int insert(Service record);

    int insertSelective(Service record);

    Service selectByPrimaryKey(Integer serviceId);

    int updateByPrimaryKeySelective(Service record);

    int updateByPrimaryKey(Service record);
}