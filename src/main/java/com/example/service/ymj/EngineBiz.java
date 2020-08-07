package com.example.service.ymj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EngineMapper;
import com.example.pojo.Engine;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class EngineBiz {

	@Autowired
	private EngineMapper enginemapper;
	
	public PageInfo<Engine> findPersonListByPage(Integer pageNum, Integer pageSize,String engineNumber) {
		//pageNum 当前是第几页 pageSize每一页需要显示多少页数
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Engine>(enginemapper.queryAll(engineNumber));
	}

	public List<Engine> EngineByLikename(String engineName){
		return enginemapper.EngineByLikename(engineName);
	}
	public Engine getEngineById(Integer engineId) {
		return enginemapper.queryById(engineId);
	}
	
	public void insertEngine(Engine engine) {
		enginemapper.addAll(engine);
	}
	
	public void updateEngine(Engine engine) {
		enginemapper.updateAll(engine);
	}
	
	public void deleteById(Integer engineId) {
		enginemapper.deleteAllById(engineId);
	}
}
