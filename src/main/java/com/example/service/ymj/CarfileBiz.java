package com.example.service.ymj;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CarfileMapper;
import com.example.dao.EngineMapper;
import com.example.pojo.Carfile;
import com.example.pojo.Carfile_Type;
import com.example.pojo.Engine;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CarfileBiz {
	@Autowired
	private CarfileMapper carfilemapper;
	@Autowired
	private EngineMapper enginemapper;
	
	public PageInfo<Carfile> findPersonListByPage(Integer pageNum, Integer pageSize,String abc) {
		//pageNum 当前是第几页 pageSize每一页需要显示多少页数
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Carfile>(carfilemapper.queryByengineAndType(abc));
	}
	
	public Carfile queryByid(Integer carfileId) {
		return carfilemapper.queryByid(carfileId);
	}
	
	public int addCarfile(Carfile carfile) {
		return carfilemapper.addCarfile(carfile);
	}
	
	public int updateCarfile(Carfile carfile) {
		return carfilemapper.updateCarfile(carfile);
	}
	
	public int deleteCarfile(Integer carfileid) {
		return carfilemapper.deteleCarfile(carfileid);
	}
	
	public List<Carfile_Type> querycarfileType(){
		return carfilemapper.querycarfileType();
	}
	
	public List<Engine> queryEngine(){
		return enginemapper.queryengine();
	}
}
