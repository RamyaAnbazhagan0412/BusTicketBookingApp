package com.display_bus;

import java.util.Scanner;

public class Update {
	public static void UpdateBusFrom() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name ");
		String busName=sc.nextLine();
		System.out.println("Enter Bus From  to be Updated");
		String busFrom=sc.nextLine();
		DisplayBus ur=new DisplayBus(busName, busFrom);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Bus_from(ur);
  	      System.out.println("Updated bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusFrom= "+ur.busFrom);
  	
	} 
	public static void UpdateBusName() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name ");
		String busName=sc.nextLine();
		System.out.println("Enter Bus name to be  update ");
		String busUpdatedName=sc.nextLine();
		
				DisplayBus ur=new DisplayBus(busName,busUpdatedName);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdateBus_Name(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusFrom= "+ur.busFrom+'\n'+"BusTo= "+ur.busTiming);
  	
	} 


	public static void UpdateBusTo() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name ");
		String busName=sc.nextLine();
		System.out.println("Enter Bus To");
		String busTo=sc.nextLine();
		DisplayBus ur=new DisplayBus(busName,busTo);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdateBus_To(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusTo= "+ur.busTo);
  	
	} 


	public static void UpdateBusTiming() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name ");
		String busName=sc.nextLine();
		System.out.println("Enter bus Timing  to be Updated");
		String busTiming=sc.nextLine();
		DisplayBus ur=new DisplayBus(busName ,busTiming);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAOUpdate_Timing(ur);
  	      System.out.println("Entered bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusFrom= "+ur.busFrom+'\n'+"BusTo= "+ur.busTiming);
  	
	} 




}
