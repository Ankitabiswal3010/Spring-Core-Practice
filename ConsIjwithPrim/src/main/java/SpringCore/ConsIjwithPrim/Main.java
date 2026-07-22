package SpringCore.ConsIjwithPrim;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringCore/ConsIjwithprim/application-context.xml");
		Teacher bean=context.getBean("Teacher",Teacher.class);
		IO.println(bean);       
	}

}
