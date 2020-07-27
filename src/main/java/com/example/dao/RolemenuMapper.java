package com.example.dao;

import com.example.pojo.RolemenuKey;

public interface RolemenuMapper {
    int deleteByPrimaryKey(RolemenuKey key);

    int insert(RolemenuKey record);

    int insertSelective(RolemenuKey record);
}