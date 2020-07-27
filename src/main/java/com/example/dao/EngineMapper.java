package com.example.dao;

import com.example.pojo.Engine;

public interface EngineMapper {
    int deleteByPrimaryKey(Integer engineId);

    int insert(Engine record);

    int insertSelective(Engine record);

    Engine selectByPrimaryKey(Integer engineId);

    int updateByPrimaryKeySelective(Engine record);

    int updateByPrimaryKey(Engine record);
}