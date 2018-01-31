package com.employee;

public class Employee {
	
	private int eid;
	private String ename;
	private String eaddress;
	private String edepartment;
	
	public int getId() {
		return eid;
	}
	public void setId(int id) {
		this.eid = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public String getEdepartment() {
		return edepartment;
	}
	public void setEdepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	@Override
	public String toString() {
		return "Employee [id=" + eid + ", ename=" + ename + ", eaddress=" + eaddress + ", edepartment=" + edepartment
				+ "]";
	}
	
	
	
	

}
