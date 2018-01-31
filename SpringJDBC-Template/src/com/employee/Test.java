package com.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("JDBC.xml");
		
		EmployeeDAO eDao = (EmployeeDAOImpl)context.getBean("emp");
		Employee employee = new Employee();
		employee.setId(1);
		employee.setEname("John");
		employee.setEaddress("Wooster");
		employee.setEdepartment("Reasearch");
		
		
		
		// inserting the data in the employeeinfo table
		eDao.saveEmployee(employee);
		
		Employee employee1 = new Employee();
		employee1.setId(2);
		employee1.setEname("Ajith");
		employee1.setEaddress("Florida");
		employee1.setEdepartment("Development");
		eDao.saveEmployee(employee1);
		System.out.println("Inserted successfully.");
		
		//getting the data from the employeeinfo table
		Employee emp1 = eDao.getEmployee(1);
		
		System.out.println("Employee id :"+emp1.getId());
		System.out.println("Employee name :"+emp1.getEname());
		System.out.println("Employee address :"+emp1.getEaddress());
		System.out.println("Employee department:"+emp1.getEdepartment());
		
	
		
		
		// deleting the data from the employeeinfo table
		eDao.deleteEmployee(1);
		System.out.println("Deleted successfully.");
		
		
		
		
		
	}


}