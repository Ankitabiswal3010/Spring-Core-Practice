package SpringCore.Program04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringCore/Program04/application-context.xml");
		Book bean=context.getBean("Book",Book.class);
		bean.display();    

        System.out.println("Constructor Injection");
        Book bean2=context.getBean("Book2",Book.class);
		bean2.display();    
    }
    
}