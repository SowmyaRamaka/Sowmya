package com.employee;

import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDAOImpl implements EmployeeDAO{
	JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
	
	private final String employee_Select= "select *from employeeinfo where eid=?";
	private final String employee_Insert= "insert into employeeinfo(eid, ename, eaddress, edepartment) values(?,?,?,?)";
	private final String employee_update= "update employeeinfo set  ename=?, eaddress=?, edepartment=? WHERE eid = ?";
	

	
	public void saveEmployee(Employee e) {
		this.jdbcTemplate.update(this.employee_Insert, new Object[]{e.getId(),e.getEname(),e.getEaddress(), e.getEdepartment()});
		
	}

	public void updateEmployee(Employee e) {
		this.jdbcTemplate.update(this.employee_update, new Object[]{e.getId(),e.getEname(),e.getEaddress(), e.getEdepartment()} );
		
	}

		
	public Employee getEmployee(final int eid) {
		Employee e = (Employee)jdbcTemplate.queryForObject(this.employee_Select, 
				new Object[]{new Integer(eid)}, 
				new RowMapper(){

			public Object mapRow(java.sql.ResultSet rs, int arg1) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(eid));
				e.setEname(rs.getString("ename"));
				e.setEaddress(rs.getString("eaddress"));
				e.setEdepartment(rs.getString("edepartment"));
				
				
				return e;
			}
	
});
return e;
}
	
	public void deleteEmployee(int eid)
	{
		jdbcTemplate.update("delete from employeeinfo where eid = "+eid);
		
	}

	
	
}
