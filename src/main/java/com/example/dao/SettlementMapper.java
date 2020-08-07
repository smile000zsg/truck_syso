package com.example.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Settlement;

public interface SettlementMapper {
    int deleteByPrimaryKey(Integer settlementid);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    Settlement selectByPrimaryKey(Integer settlementid);

    int updateByPrimaryKeySelective(Settlement record);

    int updateByPrimaryKey(Settlement record);
    
    Settlement selectByDayMoney(@Param("paymenttime") Date paymenttime);
    
    List<Settlement> query();
}