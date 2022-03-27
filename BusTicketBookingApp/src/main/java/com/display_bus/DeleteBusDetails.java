package com.display_bus;
import java.util.Scanner;
public class DeleteBusDetails {
	public static void deleteBus() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter Bus Name for deletion");
		String busName=sc.nextLine();
		System.out.println("Also enter Bus From  for deletion");
		String busFrom=sc.nextLine();
		DisplayBus ur=new DisplayBus(busName, busFrom);

         BusDAO urDAO=new BusDAO();
         urDAO.busDAODelete(ur);
  	      System.out.println("Deleted bus details");
  		System.out.println("BusName= "+ur.busName+'\n'+"BusFrom= "+ur.busFrom);
  	
	} 


}
