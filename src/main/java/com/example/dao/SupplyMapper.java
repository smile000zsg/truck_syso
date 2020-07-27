package com.example.dao;

import com.example.pojo.Supply;

public interface SupplyMapper {
    int deleteByPrimaryKey(Integer supplierProvinceid);

    int insert(Supply record);

    int insertSelective(Supply record);

    Supply selectByPrimaryKey(Integer supplierProvinceid);

    int updateByPrimaryKeySelective(Supply record);

    int updateByPrimaryKey(Supply record);
}