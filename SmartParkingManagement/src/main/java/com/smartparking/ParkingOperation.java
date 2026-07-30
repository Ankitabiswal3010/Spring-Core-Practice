package com.smartparking;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("service")
public class ParkingOperation {
	
	 private int availableSlots = 100;

	    public void vehicleEntry() {

	        if (availableSlots > 0) {

	            availableSlots--;
	            System.out.println("Vehicle Entered Successfully.");
	        }
	        else {

	            System.out.println("Parking Full!");
	        }
	    }

	    public void vehicleExit() {

	        availableSlots++;
	        System.out.println("Vehicle Exited Successfully.");
	    }

	    public void showSlots() {

	        System.out.println("Available Slots : " + availableSlots);
	    }

}