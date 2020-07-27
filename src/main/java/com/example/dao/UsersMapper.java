package com.example.dao;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Users;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer uid);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    
    Users userLogin(@Param("account")String account,@Param("password") String password);
}