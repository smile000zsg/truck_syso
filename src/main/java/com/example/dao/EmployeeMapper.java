package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.pojo.Employee;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
    
    List<Employee> queryAllEmp();
    
    @Update("update employee set empstate = 1 where empid = #{id}")
    int resignationById(Integer id);
    
    @Update("update employee set empstate = 0 where empid = #{id}")
    int rollbackById(Integer id);
}