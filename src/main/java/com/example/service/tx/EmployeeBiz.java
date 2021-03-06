package com.example.service.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.EmployeeMapper;
import com.example.pojo.Employee;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class EmployeeBiz {

	@Autowired
	private EmployeeMapper employeeDao;
	
	public PageInfo<Employee> queryAll(int pageNum,int pageSize,String name,String phone,String deptid){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Employee>(employeeDao.queryAllEmp(name,phone,deptid));
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int addEmployee(Employee emp) {
		return employeeDao.insertSelective(emp);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateEmployee(Employee emp) {
		return employeeDao.updateByPrimaryKeySelective(emp);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int resignationById(Integer id) {
		return employeeDao.resignationById(id);
	}
	
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int rollbackById(Integer id) {
		return employeeDao.rollbackById(id);
	}
}
