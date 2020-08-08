package com.example.dao;

import com.example.pojo.Mechanic;

public interface MechanicMapper {
    int deleteByPrimaryKey(Integer mecid);

    int insert(Mechanic record);

    int insertSelective(Mechanic record);

    Mechanic selectByPrimaryKey(Integer mecid);

    int updateByPrimaryKeySelective(Mechanic record);

    int updateByPrimaryKey(Mechanic record);
}