package com.pratap.patterns.dao.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pratap.patterns.dao.EmployeeDAO;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Employee employee) {

		String sql = "insert into employee(first_name, last_name, email) values(?, ?, ?)";
		jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getEmailId());
	}

}
