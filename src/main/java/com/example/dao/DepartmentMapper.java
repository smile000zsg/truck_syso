package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.pojo.Department;

public interface DepartmentMapper {

	  int deleteByPrimaryKey(Integer deptid);
	  
	  int insert(Department record);
	 
	  int insertSelective(Department record);
	  
	  Department selectByPrimaryKey(Integer deptid);
	  
	  int updateByPrimaryKeySelective(Department record);
	  
	  int updateByPrimaryKey(Department record);
	  
	  @Select("select * from department") List<Department> queryAllDept();
}