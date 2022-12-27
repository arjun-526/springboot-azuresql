package com.valmiki.azure.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringbootAzuresqlApplication {
	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzuresqlApplication.class, args);
	}
    @PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee){
       return employeeRepository.save(employee);
	}
	@GetMapping("/employees")
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}

}
