package com.search_bus;
import java.util.List;
import java.util.Scanner;

import com.display_bus.DisplayBus;
public class SearchClass {
	public static void ByBusFrom() throws Exception {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Bus from");
	String busFrom=sc.next();
	DisplayBus ur=new DisplayBus(busFrom);
	SearchBusDAO searchBusTest2=new SearchBusDAO();
	List<DisplayBus> obj2=searchBusTest2.SelectByBusTo(ur);
	for(DisplayBus busList:obj2){
		System.out.println(busList);
	}}
	//SearchBusDAO.SelectByBusFrom(ur);
	public static void ByBusTo() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bus To");
		String busFrom=sc.next();
		DisplayBus ur=new DisplayBus(busFrom);
		SearchBusDAO searchBusTest2=new SearchBusDAO();
		List<DisplayBus> obj2=searchBusTest2.SelectByBusTo(ur);
		for(DisplayBus busList:obj2){
			System.out.println(busList);
		}
	}
		public static void ByBusFromAndTo() throws Exception {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Bus from,Bus to");
			String busFrom=sc.next();
			DisplayBus ur=new DisplayBus(busFrom);
			SearchBusDAO searchBusTest2=new SearchBusDAO();
			List<DisplayBus> obj2=searchBusTest2.SelectByBusFrom_and_BusTo(ur);
			for(DisplayBus busList:obj2){
				System.out.println(busList);
			}
		}
			public static void ByBusToAndFrom() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Bus To,Bus from");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				SearchBusDAO searchBusTest2=new SearchBusDAO();
				List<DisplayBus> obj2=searchBusTest2.SelectBy_BusTo_and_BusFrom(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByNameandBusFromandTo() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter BusName,BusFrom,BusTo");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				SearchBusDAO searchBusTest2=new SearchBusDAO();
				List<DisplayBus> obj2=searchBusTest2.SelectByName_and_BusFrom_and_BusTo(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByBusFromAndToAndName() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Bus from ,Bus to,bus Name");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				SearchBusDAO searchBusTest2=new SearchBusDAO();
				List<DisplayBus> obj2=searchBusTest2.SelectByBusFrom_and_BusTo_and_BusName(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByBusToAndFromAndName() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Bus to ,Bus from,bus Name");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				SearchBusDAO searchBusTest2=new SearchBusDAO();
				List<DisplayBus> obj2=searchBusTest2.SelectByBusTo_and_BusFrom_and_BusName(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByBusFromAndNameAndTo() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Bus from ,Bus name,bus to");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				SearchBusDAO searchBusTest2=new SearchBusDAO();
				List<DisplayBus> obj2=searchBusTest2.SelectByBusFrom_and_BusName_and_BusTo(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByToAndNameAndBusFrom() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter bus to,Bus from ,Bus name");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				SearchBusDAO searchBusTest2=new SearchBusDAO();
				List<DisplayBus> obj2=searchBusTest2.SelectByBusTo_and_BusName_and_BusFrom(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByBusTiming() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Bus from ,Bus name,bus to");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				List<DisplayBus> obj2=SearchBusDAO.SelectByBusTiming(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}
			public static void ByBusName() throws Exception {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Bus from name");
				String busFrom=sc.next();
				DisplayBus ur=new DisplayBus(busFrom);
				List<DisplayBus> obj2=SearchBusDAO.selectByName(ur);
				for(DisplayBus busList:obj2){
					System.out.println(busList);
				}
				}





			

			
	}
	
	


