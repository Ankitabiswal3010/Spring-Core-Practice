package com.nit.bank;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.nit.bank");

        Bankoperation bankOperation = context.getBean(Bankoperation.class);

        while(true)
        {
        IO.println("1. Deposit Amount");
        IO.println("2. Withdraw Amount");
        IO.println("3. Check Balance");
        IO.println("4. Generate Report");
        IO.println("5. Exit");
        int choice=Integer.parseInt(IO.readln("Enter your choice : "));
        
        switch(choice)
        {
        case 1:
        {
        	double amount =Double.parseDouble(IO.readln("enter the deposite amount "));
        	bankOperation.deposit(amount);
        	break;
        }
        case 2 :
        {
        
             double amount = Double.parseDouble(IO.readln("Enter withdrawal amount"));
             bankOperation.withdraw(amount);
             break;
        }
        case 3:
        {
        	 bankOperation.checkBalance();
        	 break;
        }
        case 4:
        {
        	bankOperation.generateReport();
        	break;
        }
        case 5:
        {
        	IO.println("Thank you for using");
        	System.exit(0);
        }
        default :
        {
        	IO.println("invalid choice");
        }
       }
      }
    }
}
