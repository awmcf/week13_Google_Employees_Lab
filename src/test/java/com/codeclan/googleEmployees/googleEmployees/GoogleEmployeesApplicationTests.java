package com.codeclan.googleEmployees.googleEmployees;

import com.codeclan.googleEmployees.googleEmployees.models.Department;
import com.codeclan.googleEmployees.googleEmployees.models.Employee;
import com.codeclan.googleEmployees.googleEmployees.models.Project;
import com.codeclan.googleEmployees.googleEmployees.repositories.DepartmentRepository;
import com.codeclan.googleEmployees.googleEmployees.repositories.EmployeeRepository;
import com.codeclan.googleEmployees.googleEmployees.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GoogleEmployeesApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment() {
		Department department = new Department("Spying Department");
		departmentRepository.save(department);


		Employee employee = new Employee("Jonas", "McShady", 7, department);
		employeeRepository.save(employee);
	}

	@Test
	public void addEmployeesAndProjects() {
		Department department = new Department("Spying Department");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Jonas", "McShady", 7, department);
		employeeRepository.save(employee1);

		Project project1 = new Project("Operation Brainworm", 400);
		projectRepository.save(project1);

		department.addEmployee(employee1);
		departmentRepository.save(department);

		project1.addEmployee(employee1);
		projectRepository.save(project1);
	}

}
