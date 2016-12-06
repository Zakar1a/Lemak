package com.zakar1a.employee.dao;

import java.util.List;

import com.zakar1a.employee.model.Employee;

public interface EmployeeDao {

	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public Employee getEntityByNRIC(String NRIC) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
}
