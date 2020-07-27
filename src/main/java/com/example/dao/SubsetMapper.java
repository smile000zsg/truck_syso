package com.example.dao;

import com.example.pojo.Subset;

public interface SubsetMapper {
    int deleteByPrimaryKey(Integer sid);

    int insert(Subset record);

    int insertSelective(Subset record);

    Subset selectByPrimaryKey(Integer sid);

    int updateByPrimaryKeySelective(Subset record);

    int updateByPrimaryKey(Subset record);
}