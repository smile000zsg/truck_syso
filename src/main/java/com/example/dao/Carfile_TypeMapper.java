package com.example.dao;

import com.example.pojo.Carfile_Type;

public interface Carfile_TypeMapper {
    int deleteByPrimaryKey(Integer carfileTypeid);

    int insert(Carfile_Type record);

    int insertSelective(Carfile_Type record);

    Carfile_Type selectByPrimaryKey(Integer carfileTypeid);

    int updateByPrimaryKeySelective(Carfile_Type record);

    int updateByPrimaryKey(Carfile_Type record);
}