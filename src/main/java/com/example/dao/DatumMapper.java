package com.example.dao;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Datum;

public interface DatumMapper {
    int deleteByPrimaryKey(Integer did);

    int insert(Datum record);

    int insertSelective(Datum record);

    Datum selectByPrimaryKey(Integer did);

    int updateByPrimaryKeySelective(Datum record);

    int updateByPrimaryKey(Datum record);
    
    @Select("SELECT * FROM datum WHERE license=#{license}")
    Datum queryByid(String license);
}