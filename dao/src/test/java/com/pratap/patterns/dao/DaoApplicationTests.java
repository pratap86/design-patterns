package com.pratap.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pratap.patterns.dao.model.Employee;

@SpringBootTest
class DaoApplicationTests {

	@Autowired
	EmployeeDAO dao;
	
	@Test
	void testCreate() {
		Employee employee = new Employee();
		employee.setFirstName("test1");
		employee.setLastName("test2");
		employee.setEmailId("test1@test.com");
		dao.create(employee);
	}

}
