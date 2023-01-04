package com.example.Insert;

import org.springframework.jdbc.core.JdbcTemplate;

public class Dao implements DaoIn {

	private JdbcTemplate  jdbcTemplate;
	
	public int change(Emp emp) {
		String sql = "update emp set empName=?,empEmail=?,city=?  where empId=?";
		int r = this.jdbcTemplate.update(sql,emp.getEmpName(),emp.getEmpEmail(),emp.getCity(),emp.getEmpId());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



}
