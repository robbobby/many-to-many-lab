package com.example.manyToManyLab;

import com.example.manyToManyLab.models.Department;
import com.example.manyToManyLab.models.Employee;
import com.example.manyToManyLab.repositories.DepartmentRepository;
import com.example.manyToManyLab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ManyToManyLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("HR");
		departmentRepository.save(department);

		Employee employee = new Employee("Jack", "Sparrow", 983748974, department);
		employeeRepository.save(employee);
	}

}
