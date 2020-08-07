package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(String oid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    List<Order> queryDetails(@Param("oid") String oid);
}