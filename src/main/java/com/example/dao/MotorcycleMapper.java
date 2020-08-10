package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Motorcycle;

public interface MotorcycleMapper {
    int deleteByPrimaryKey(Integer mid);

    int insert(Motorcycle record);

    int insertSelective(Motorcycle record);

    Motorcycle selectByPrimaryKey(Integer mid);

    int updateByPrimaryKeySelective(Motorcycle record);

    int updateByPrimaryKey(Motorcycle record);
    
    //根据车辆品牌查询车型
    @Select("SELECT * FROM Motorcycle WHERE  bid=#{bid}")
    List<Motorcycle> list(Integer bid);
}