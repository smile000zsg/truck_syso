package com.example.dao;

import com.example.pojo.Motorcycle;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Motorcycle record);

    int insertSelective(Motorcycle record);

    Motorcycle selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Motorcycle record);

    int updateByPrimaryKey(Motorcycle record);
}