package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Carfile_Type;

public interface Carfile_TypeMapper {
	public List<Carfile_Type> queryByTypeAll();
	
	public List<Carfile_Type> queryByABC(@Param("Carfile_typeABC") String abc);
	
	public Carfile_Type queryById(@Param("Carfile_typeid")Integer typeid);
	
	public int addType(@Param("Carfile_Type") String carfiletype);
	
	public int updateType(@Param("Carfile_Type") String carfiletype);
	
	public int deleteByTypeId(@Param("Carfile_typeid") String typeid);
}