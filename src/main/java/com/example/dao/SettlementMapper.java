package com.example.dao;

import java.util.List;


import org.apache.ibatis.annotations.Param;

import org.apache.ibatis.annotations.Select;
import com.example.pojo.Settlement;

public interface SettlementMapper {
    int deleteByPrimaryKey(Integer settlementid);

    int insert(Settlement record);

    int insertSelective(Settlement record);

    Settlement selectByPrimaryKey(Integer settlementid);

    int updateByPrimaryKeySelective(Settlement record);
    
    int updateByPrimaryKey(Settlement record);
    
    List<Settlement> querySettlement();
    
    @Select("SELECT SUM(total) FROM settlement WHERE paymenttime=#{paymenttime}")
    int selectShouru(@Param("paymenttime")String paymenttime);

}