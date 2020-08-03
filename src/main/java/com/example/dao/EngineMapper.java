package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.pojo.Engine;

public interface EngineMapper {
	 
	public List<Engine> queryAll();
	
	public Engine queryById(@Param("engineId")Integer engineId);
	
	public int addAll(@Param("Engine")Engine engine);
	
	public int updateAll(@Param("Engine")Engine engine);
	
	public int deleteAllById(@Param("engineId")Integer engineId);
}