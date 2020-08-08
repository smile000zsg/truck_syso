package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pojo.Fieldvehicle;

public interface FieldvehicleMapper {
    int deleteByPrimaryKey(Integer fieldid);

    int insert(Fieldvehicle record);

    int insertSelective(Fieldvehicle record);

    Fieldvehicle selectByPrimaryKey(Integer fieldid);

    int updateByPrimaryKeySelective(Fieldvehicle record);

    int updateByPrimaryKey(Fieldvehicle record);
    
    @Select("SELECT * FROM `fieldvehicle`  WHERE `state`=0")
    List<Fieldvehicle> query();
    
    @Update("UPDATE `trucksystem`.`fieldvehicle` SET `state` = 1 WHERE `carbrand` = #{carbrand}")
    int updateByid(String carbrand);
}