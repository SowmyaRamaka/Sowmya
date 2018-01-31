package com.employee;

public interface EmployeeDAO {
	
	
	public void saveEmployee(Employee emp);
	public void updateEmployee(Employee emp);
	public Employee getEmployee(int eid);
	public void deleteEmployee(int eid);
	

}
