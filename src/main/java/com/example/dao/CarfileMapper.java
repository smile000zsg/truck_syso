package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.example.pojo.*;

public interface CarfileMapper {
	
    public List<Carfile> queryByengineAndType(@Param("abc")String abc);
    
    public Carfile queryByid(@Param("carfileId") Integer carfileId);
    
    public int addCarfile(@Param("Carfile") Carfile carfile);
    
    public int updateCarfile(@Param("Carfile") Carfile carfile);
    
    public int deteleCarfile(@Param("carfileId")Integer carfileid);
    
    public List<Carfile_Type> querycarfileType();
    
    public List<Engine> queryengine();
}