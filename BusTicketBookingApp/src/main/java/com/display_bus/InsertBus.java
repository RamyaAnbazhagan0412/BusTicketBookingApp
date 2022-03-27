package com.display_bus;

import java.util.Scanner;
public class InsertBus {
	public static void insertBus() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name ");
		String busName=sc.nextLine();
		System.out.println("Enter Bus From ");
		String busFrom=sc.nextLine();
		System.out.println("Enter Bus To");
		String busTo=sc.nextLine();
		System.out.println("Enter bus Timing ");
		String busTiming=sc.nextLine();
		DisplayBus ur=new DisplayBus(busName, busFrom,busTo ,busTiming);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAO(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusFrom= "+ur.busFrom+'\n'+"BusTo= "+ur.busTiming);
  	
	} 
		
		
	}




