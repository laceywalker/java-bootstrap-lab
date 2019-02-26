package com.example.EmployeeLab;

import com.example.EmployeeLab.models.Department;
import com.example.EmployeeLab.models.Employee;
import com.example.EmployeeLab.repositories.DepartmentRepository;
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


	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSaveEmployee(){
		Department techDepartment = new Department("Tech");
		departmentRepository.save(techDepartment);
		Employee employee = new Employee("Jim Jones", 27, 1234, "jimmyJ@cult.net", techDepartment);
		employeeRepository.save(employee);
	}

//	@Test
//	public void canSaveDepartment(){
//		Department department = new Department("Hamburger Investigation");
//		departmentRepository.save(department);
//	}







}
