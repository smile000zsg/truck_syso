package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pojo.Goods;

public interface GoodsMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(Goods record);

    int insertSelective(Goods record);

    Goods selectByPrimaryKey(Integer gid);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
    
    @Select("SELECT * FROM goods")
    List<Goods> querys();
    
    @Select("SELECT * FROM goods WHERE gid=#{gid}")
    List<Goods> queryByid(Integer gid);
    
    @Update("UPDATE `trucksystem`.`goods` SET `ginventory` =ginventory-#{ginventory}  WHERE `gid` = #{gid}")
    int update(@Param("ginventory")Integer ginventory,@Param("gid")Integer gid);
}