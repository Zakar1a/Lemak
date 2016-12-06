package com.zakar1a.employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zakar1a.employee.dao.EmployeeDao;
import com.zakar1a.employee.model.Employee;

public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		return employeeDao.addEntity(employee);
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		return employeeDao.getEntityById(id);
	}
	
	@Override
	public Employee getEntityByNRIC(String NRIC) throws Exception {
		return employeeDao.getEntityByNRIC(NRIC);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		return employeeDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return employeeDao.deleteEntity(id);
	}

}
