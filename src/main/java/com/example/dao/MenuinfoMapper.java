package com.example.dao;

import java.util.List;

import com.example.pojo.Menuinfo;

public interface MenuinfoMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Menuinfo record);

    int insertSelective(Menuinfo record);

    Menuinfo selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Menuinfo record);

    int updateByPrimaryKey(Menuinfo record);
    
    List<Menuinfo> queryAll();
}