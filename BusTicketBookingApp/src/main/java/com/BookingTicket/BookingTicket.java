package com.BookingTicket;

import java.util.Scanner;

import com.display_bus.BusDAO;
import com.display_bus.DisplayBus;

public class BookingTicket {
             public static void bookingTicket() throws Exception {
            	Scanner sc=new Scanner(System.in );
         		System.out.println("Enter Bus Name ");
         		String busName=sc.nextLine();
         		System.out.println("Enter Bus From");
         		String busFrom=sc.nextLine();
         		System.out.println("Enter Bus To");
         		String busTo=sc.nextLine();
         		System.out.println("Enter the  way of travel");
         		System.out.println("Enter pickUp location");
         		String pickUpLocation=sc.nextLine();
         		System.out.println("Enter dropOff location");
         		String dropOffLocation=sc.nextLine();;
         		BookingModel ur=new BookingModel(pickUpLocation,dropOffLocation,busName, busFrom,busTo);
         		BookingDAO.busDAOBooking(ur);
         		System.out.println("Thanks for Booking"+'\n'+"Happy journey");
         		
                 
             }      
}
