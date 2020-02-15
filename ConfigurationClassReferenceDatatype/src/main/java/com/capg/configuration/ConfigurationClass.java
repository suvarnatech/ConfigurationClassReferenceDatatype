package com.capg.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.capg.model.Address;
import com.capg.model.Employee;

@Configuration
public class ConfigurationClass {
	@Bean(value="empl")
	public Employee empObj() {
		Employee emp = new Employee();
		emp.setEmpId("25");
		emp.setEmpName("Sukanya");
		emp.setAddress(addObj());
		return emp;
	}

	@Bean(value = "addr")
	public Address addObj() {
		Address add = new Address();
		add.setAddId(12);
		add.setLoc("Mangalore");
		return add;
	}

}
