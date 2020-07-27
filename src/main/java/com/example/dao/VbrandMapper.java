package com.example.dao;

import com.example.pojo.Vbrand;

public interface VbrandMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(Vbrand record);

    int insertSelective(Vbrand record);

    Vbrand selectByPrimaryKey(Integer bid);

    int updateByPrimaryKeySelective(Vbrand record);

    int updateByPrimaryKey(Vbrand record);
}