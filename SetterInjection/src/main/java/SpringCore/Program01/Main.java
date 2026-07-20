package SpringCore.Program01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringCore/Program01/application-context.xml");
		Employee bean=context.getBean("Employee",Employee.class);
		bean.display();       
	}

}
