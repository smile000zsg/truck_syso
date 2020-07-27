package com.example.dao;

import com.example.pojo.Fieldvehicle;

public interface FieldvehicleMapper {
    int deleteByPrimaryKey(Integer fieldid);

    int insert(Fieldvehicle record);

    int insertSelective(Fieldvehicle record);

    Fieldvehicle selectByPrimaryKey(Integer fieldid);

    int updateByPrimaryKeySelective(Fieldvehicle record);

    int updateByPrimaryKey(Fieldvehicle record);
}