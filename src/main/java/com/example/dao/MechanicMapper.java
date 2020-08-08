package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Mechanic;

public interface MechanicMapper {
    int deleteByPrimaryKey(Integer mecid);

    int insert(Mechanic record);

    int insertSelective(Mechanic record);

    Mechanic selectByPrimaryKey(Integer mecid);

    int updateByPrimaryKeySelective(Mechanic record);

    int updateByPrimaryKey(Mechanic record);
    
    List<Mechanic> queryAllMec(@Param("name")String name ,@Param("phone")String phone,@Param("teamsid") String teamsid);
}