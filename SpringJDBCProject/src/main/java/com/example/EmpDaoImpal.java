package com.example;

import org.springframework.jdbc.core.JdbcTemplate;

import com.example.Insert.Emp;

public class EmpDaoImpal implements EmpDao {
	private JdbcTemplate jdbcTemplate;


	public int insert(Emp emp) {
	   String sql = "INSERT into Emp(empName,empEmail) values(?,?)";
	   int r = this.jdbcTemplate.update(sql,"durgeshkumar","durg@gmail.com");
		return r;
	}

	public int chnage(Emp emp) {
		String sql = "update emp set empMail=?,where empName=?";
		int r = this.jdbcTemplate.update(sql,"kumar@gmail","Durgesh");
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}