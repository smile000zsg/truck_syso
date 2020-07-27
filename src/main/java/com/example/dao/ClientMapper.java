package com.example.dao;

import com.example.pojo.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(String clid);

    int insert(Client record);

    int insertSelective(Client record);

    Client selectByPrimaryKey(String clid);

    int updateByPrimaryKeySelective(Client record);

    int updateByPrimaryKey(Client record);
}