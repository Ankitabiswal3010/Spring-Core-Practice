package com.EmployeeStereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("com/EmployeeStereotype/application-context.xml");
	EmployeeService bean=context.getBean(EmployeeService.class);
	bean.displayEmployee();

	}

}
