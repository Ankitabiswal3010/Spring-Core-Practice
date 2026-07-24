package com.SetterInjec_Lambok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/SetterInjec_Lambok/application-context.xml");

        Employee emp = context.getBean("emp", Employee.class);

        System.out.println(emp);

        ((ClassPathXmlApplicationContext) context).close();

    }

}
