package com.capg;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.configuration.ConfigurationClass;
import com.capg.model.Employee;

@SpringBootApplication
public class ConfigurationClassReferenceDatatypeApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Object obj = context.getBean("empl");
		Employee e = (Employee) obj;
		System.out.println(e);
	}

}
