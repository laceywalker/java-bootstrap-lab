package com.example.EmployeeLab;

import com.example.EmployeeLab.models.Employee;
import com.example.EmployeeLab.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Employee employee = new Employee("Jim Jones", 27, 1234, "jimmyJ@cult.net");
		employeeRepository.save(employee);
	}







}
