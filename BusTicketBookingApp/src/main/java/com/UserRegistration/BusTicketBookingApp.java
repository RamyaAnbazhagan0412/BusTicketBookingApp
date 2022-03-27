package com.UserRegistration;
import java.util.Scanner;

import com.BookingTicket.BookingTicket;
public class BusTicketBookingApp {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO ONLINE BUS  TICKET BOOKING");
		System.out.println("Enter 1 to Login as ADMIN");
		System.out.println("Enter 2 Login as USER");
		int login=sc.nextInt();
		if(login==1){		
		System.out.println("Enter 1 to SIGNUP "+'\n' +"Enter 2 to SIGNIN" );
		int integer=sc.nextInt();
		if(integer==1){
			UserRegistrationTest.userRegistration();
			System.out.println("To INSERT,UPDATE,DELETE buses enter 1");
			System.out.println("To VIEW Buses enter 2");
			System.out.println("To SEARCH Buses enter  3");
			int admin=sc.nextInt();
			if(admin==1)
			{
			ForAdmin.forAdmin();
			}
			else if(admin==2)
			{
			ForAdmin.displayBusCommon();
			}
			else if(admin==3) {
			ForAdmin.searchCommon();
			}
		}
		else if(integer==2)
		{
			LogIn.login();
			System.out.println("To INSERT,UPDATE,DELETE buses enter 1");
			System.out.println("To VIEW Buses enter 2");
			System.out.println("To SEARCH Buses enter  3");
			int admin=sc.nextInt();
			if(admin==1)
			{
			ForAdmin.forAdmin();
			}
			else if(admin==2)
			{
			ForAdmin.displayBusCommon();
			}
			else if(admin==3) {
			ForAdmin.searchCommon();
			}
		}
		
		}
		else if(login==2)
		{
			System.out.println("Enter 1 to SIGNUP "+'\n' +"Enter 2 to SIGNIN" );
			int integer=sc.nextInt();
			if(integer==1){
				UserRegistrationTest.userRegistration();
				System.out.println("To VIEW Buses enter 1");
				System.out.println("To SEARCH Buses enter  2");
				int user=sc.nextInt();
				if(user==1)
				{
					ForAdmin.displayBusCommon();
				}
				else if(user==2)
				{
					ForAdmin.searchCommon();
				}
				System.out.println("Enter 1 to BOOK BUS TICKET");
				int i=sc.nextInt();
				if(i==1)
				{
					BookingTicket.bookingTicket();
				}
				
				
			
		    }
			else if(integer==2)
			{
				LogIn.login();
				System.out.println("To VIEW Buses enter 1");
				System.out.println("To SEARCH Buses enter  2");
				int user=sc.nextInt();
				if(user==1)
				{
					ForAdmin.displayBusCommon();
				}
				else if(user==2)
				{
					ForAdmin.searchCommon();
				}
				System.out.println("Enter 1 to BOOK BUS TICKET");
				int i=sc.nextInt();
				if(i==1)
				{
					BookingTicket.bookingTicket();
				}
				
				}
			}
		
		}


	}


