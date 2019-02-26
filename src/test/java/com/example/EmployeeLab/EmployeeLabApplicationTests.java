package com.example.EmployeeLab;

import com.example.EmployeeLab.models.Department;
import com.example.EmployeeLab.models.Employee;
import com.example.EmployeeLab.models.Project;
import com.example.EmployeeLab.repositories.DepartmentRepository;
import com.example.EmployeeLab.repositories.EmployeeRepository;
import com.example.EmployeeLab.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest

public class EmployeeLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;


	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

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

	@Test
	public void canAddEmployeesToDepartment(){
		Department department = new Department("Candy");
		Employee employee = new Employee("Tim", 50, 12345, "hi@hello.com", department);
		department.addToEmployeesList(employee);
		assertEquals(1, department.employeeListCount());
	}

	@Test
	public void canAddEmployeeToProject(){
		Project project = new Project("Experiments with FartyPants", 10);
		Department department = new Department("Human experimentation and pranks");
		Employee employee = new Employee("Janice", 28, 0001, "winner@projects.com", department);
		project.addToEmployeesToProject(employee);
		assertEquals(1, project.employeesProjectCount());
	}

	@Test
	public void canAddProjectToEmployee(){
		Project project = new Project("Experiments with FartyPants", 10);
		Department department = new Department("Human experimentation and pranks");
		Employee employee = new Employee("Janice", 28, 0001, "winner@projects.com", department);
		employee.assignProjectToEmployee(project);
		assertEquals(1, employee.employeeProjectCount());
	}

	@Test
	public void canSaveProject(){


		Department techDepartment = new Department("Tech");
		departmentRepository.save(techDepartment);


		Project project = new Project("Experiments with FartyPants", 10);
		Employee employee = new Employee("Jim Jones", 27, 1234, "jimmyJ@cult.net", techDepartment);
		project.addToEmployeesToProject(employee);
		employee.assignProjectToEmployee(project);

		projectRepository.save(project);
		employeeRepository.save(employee);

	}









}
