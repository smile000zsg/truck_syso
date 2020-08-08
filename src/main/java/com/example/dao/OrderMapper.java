package com.example.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pojo.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(String oid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String oid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
    
    @Select("SELECT * FROM `order` WHERE wstate=0 OR wstate=2")
    List<Order> querys();
    
    @Select("SELECT * FROM `order` WHERE wstate=0 OR wstate=2 AND olicense=#{olicense}")
    Order queryByid(String olicense);
    
    Order queryorder(String oid);
    
    @Update("UPDATE `trucksystem`.`order` SET `wstate` = 1,`finishtime`=#{finishtime} WHERE `oid` = #{oid}")
    int updateBywstate(String oid,String finishtime);
    
    @Update("UPDATE `trucksystem`.`order` SET `crew` = #{crew},`rework` = `rework`+1,`reworkreason` = #{reworkreason},`penaltyamount` = #{penaltyamount},wstate=2 WHERE `oid` = #{oid}")
    int update(@Param("crew")String crew,@Param("reworkreason")String reworkreason,@Param("penaltyamount")BigDecimal penaltyamount,@Param("oid")String oid);
    
    @Update("UPDATE `trucksystem`.`order` SET `rework` = `rework`+1,`sums`=`sums`+#{sums},wstate=2 WHERE `oid` = #{oid}")
    int updateBy(@Param("sums")BigDecimal sums,@Param("oid")String oid);
}