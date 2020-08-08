package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Recharge;

public interface RechargeMapper {
    int deleteByPrimaryKey(Integer rechargeid);

    int insert(Recharge record);

    int insertSelective(Recharge record);

    Recharge selectByPrimaryKey(Integer rechargeid);

    int updateByPrimaryKeySelective(Recharge record);

    int updateByPrimaryKey(Recharge record);
    
    int udateprice(@Param("price") int price,@Param("uid") int uid);
}