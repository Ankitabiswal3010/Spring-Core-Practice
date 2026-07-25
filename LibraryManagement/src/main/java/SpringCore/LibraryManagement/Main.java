package SpringCore.LibraryManagement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=
				new ClassPathXmlApplicationContext
				("SpringCore/LibraryManagement/application-context.xml");
		LibraryService bean= context.getBean("libraryService",LibraryService.class);
		IO.println(bean.getCodeName());
		
		Library bean2= context.getBean("library",Library.class);
		int code=bean2.getLibraryCode();
		Library detail=bean.getDetails(code);
		if(detail!=null)
		{
			IO.println(detail);
		}
		else
		{
			IO.println("No matching found");
		}
	}

}
