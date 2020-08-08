package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Fieldvehicle;

public interface FieldvehicleMapper {
    int deleteByPrimaryKey(Integer fieldid);

    int insert(Fieldvehicle record);

    int insertSelective(Fieldvehicle record);

    Fieldvehicle selectByPrimaryKey(Integer fieldid);

    int updateByPrimaryKeySelective(Fieldvehicle record);

    int updateByPrimaryKey(Fieldvehicle record);
    
    @Select("select f.*,teamsname from fieldvehicle f inner join teams t on f.teamsid = t.teamsid")
    List<Fieldvehicle> queryAll();
}