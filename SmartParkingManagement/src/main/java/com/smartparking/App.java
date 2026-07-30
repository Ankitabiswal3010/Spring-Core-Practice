package com.smartparking;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.smartparking");

        ParkingOperation parkingOperation = context.getBean(ParkingOperation.class);
        while(true)
        {
        	System.out.println(" \n***Smart Parking Management System *** ");
            System.out.println("1. Vehicle Entry");
            System.out.println("2. Vehicle Exit");
            System.out.println("3. Show Available Parking Slots");
            System.out.println("4. Generate Daily Parking Report");
            System.out.println("5. Exit");
            int choice=Integer.parseInt(IO.readln("Enter your choice : "));
            
            switch(choice)
            {
            case 1 :
            {
            	parkingOperation.vehicleEntry();
            	break;
            }
            case 2:
            {
            	parkingOperation.vehicleExit();
            	break;
            }
            case 3:
            {
            	parkingOperation.showSlots();
            	break;
            }
            case 4:
            {
            	parkingReportGenerator repo=context.getBean(parkingReportGenerator.class);
            	repo.generateDailyReport();
            	break;
            }
            case 5 :
            {
            	IO.println("Thank you for using");
            	System.exit(0);
            }
           }
            
           
        }
    }
}
