package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/application-context.xml");
        FoodCart cart= context.getBean("foodCart",FoodCart.class);
        System.out.println(cart);
    }
}
