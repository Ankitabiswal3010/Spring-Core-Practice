package SpringCore.SIwithref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringCore/SIwithref"
				+ "/application-context.xml");
		Employee bean=context.getBean("Employee",Employee.class);
		IO.println(bean);  
		Address bean2=context.getBean("AddressSetter",Address.class);
		IO.println(bean2);  
	}

}
