package com.UserRegistration;

import java.util.List;
import java.util.Scanner;
import com.display_bus.BusDAO;
import com.display_bus.DeleteBusDetails;
import com.display_bus.DisplayBus;
import com.display_bus.InsertBus;
import com.display_bus.Update;
import com.search_bus.SearchClass;

public class ForAdmin {
public static void forAdmin() throws Exception {
	Scanner sc=new Scanner(System.in);
   		System.out.println("Enter 1 to Insert bus"+'\n'+"Enter 2 to Update Exting bus"+'\n'+"Enter 3 to Delete bus");
		int choose=sc.nextInt();
		if(choose==1)
		{
			InsertBus.insertBus();
		}
		else if(choose==2) 
		{
		System.out.println("To update Bus Details : follow the below details");
		System.out.println("Enter 1 to update BusName"+'\n'+"Enter 2 to update BusFrom"+'\n'+"Enter 3 to update BusTo"+'\n'+"Enter 4 to update BusTiming");
		int n=sc.nextInt();
		if(n==1) {
			Update.UpdateBusName();
		}
		else if(n==2) {
			Update.UpdateBusFrom();
		}
		else if(n==3) {
			Update.UpdateBusTo();
		}
		else if(n==4) {
			Update.UpdateBusTiming();
         }
		}
		else if(choose==3)
		{ 
			DeleteBusDetails.deleteBus();
		}

	}
	public static void displayBusCommon() throws Exception
	{
		//BusDAO.busDAOSelect();
		BusDAO display=new BusDAO();
		List<DisplayBus> obj=display.busDAOSelect();
		System.out.println("No of buses"+ obj.size());//id,busName,busFrom,busTo,busDate
	
		for(DisplayBus busList:obj){
			//System.out.println("\nbusList.id \t\t busList.busName  \t\t busList.busFrom \t\t busList.busTo \t\t busList.busTiming ");
			System.out.println(busList);
		}
	}

	public static void searchCommon() throws Exception{
	Scanner sc=new Scanner(System.in);
    System.out.println("To 1 search for bus");
	int searchBus=sc.nextInt();
	System.out.println("Enter 1 to search bus by bus from Location"+'\n'+"Enter 2 to search bus by to location"+'\n'+"Enter 3 to search bus by busfrom and busTo  location"+'\n'+"Enter 4 to search bus by bus by Busto and Busfrom location"+'\n'+"Enter 5 to search by BusTiming "+'\n'+"Enter 6 to search bus by BusName");
	int bus =sc.nextInt();

	
	if(searchBus==1)
	{
		SearchClass.ByBusFrom();	
		}
	else if(searchBus==2)
	{
		SearchClass.ByBusTo();
	}
	else if(searchBus==3)
	{
		SearchClass.ByBusFromAndTo();
	}

	else if(searchBus==4)
	{
		SearchClass.ByBusToAndFrom();
	}

	else if(searchBus==5)
	{
		SearchClass.ByBusTiming();
	}
	else if(searchBus==6)
	{
		SearchClass.ByBusName();
	}

}
}

