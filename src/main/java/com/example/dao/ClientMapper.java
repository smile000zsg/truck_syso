package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.example.pojo.Client;

public interface ClientMapper {
	 int deleteByPrimaryKey(String clid);

	    int insert(Client record);

	    int insertSelective(Client record);

	    Client selectByPrimaryKey(String clid);

	    int updateByPrimaryKeySelective(Client record);

	    int updateByPrimaryKey(Client record);
	    
	    @Select("SELECT * FROM CLIENT")
	    List<Client> querys();
	    
	    @Delete("DELETE FROM `trucksystem`.`client` WHERE `clid` = #{clid}")
	    int del(String clid);
	    
	    @Select("SELECT * FROM CLIENT where clid=#{clid}")
	    Client queryByid(String clid);
}