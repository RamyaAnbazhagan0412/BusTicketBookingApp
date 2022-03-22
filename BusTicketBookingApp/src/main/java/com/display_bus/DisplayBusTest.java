package com.display_bus;
import java.util.logging.Logger;
import com.search_bus.SearchBusDAO;
import java.sql.ResultSet;
import java.util.List;

public class DisplayBusTest {

	public static void main(String[] args)throws Exception {
	DisplayBus bus=new DisplayBus(24,"r bus services","chennai","mathurantagam","7:00");
		/*BusDAO busTest=new BusDAO();
		busTest.busDAO(bus);
	    busTest.busDAOUpdate(bus);
		busTest.busDAODelete(bus);
		busTest.busDAOSelect();*/
		Logger logger=Logger.getLogger(DisplayBusTest.class.getName());
		logger.info("enter the logger");
		SearchBusDAO searchBusTest=new SearchBusDAO();
		List<DisplayBus> obj=searchBusTest.selectAll();
		for(DisplayBus busList:obj){
			System.out.println(busList);
		}
		SearchBusDAO searchBusTest1=new SearchBusDAO();
		List<DisplayBus> obj1=searchBusTest1.selectByName(bus);
		for(DisplayBus busList:obj1){
			System.out.println(busList);
		}
		SearchBusDAO searchBusTest2=new SearchBusDAO();
		List<DisplayBus> obj2=searchBusTest2.SelectByBusFrom(bus);
		for(DisplayBus busList:obj2){
			System.out.println(busList);
		}
		SearchBusDAO searchBusTest3=new SearchBusDAO();
		List<DisplayBus> obj3=searchBusTest3.SelectByBusTo(bus);
		for(DisplayBus busList:obj3){
			System.out.println(busList);
		}
		SearchBusDAO searchBusTest4=new SearchBusDAO();
		List<DisplayBus> obj4=searchBusTest4.SelectByNameAndBusFrom(bus);
		for(DisplayBus busList:obj4){
			System.out.println(busList);
		}

		SearchBusDAO searchBusTest5=new SearchBusDAO();
		List<DisplayBus> obj5=searchBusTest5.SelectByNameAndBusTo(bus);
		for(DisplayBus busList:obj5){
			System.out.println(busList);
		}

		SearchBusDAO searchBusTest6=new SearchBusDAO();
		List<DisplayBus> obj6=searchBusTest6.SelectByName_and_BusFrom_and_BusTo(bus);
		for(DisplayBus busList:obj6){
			System.out.println(busList);
		}

		SearchBusDAO searchBusTest7=new SearchBusDAO();
		List<DisplayBus> obj7=searchBusTest7.SelectByBusFrom_and_BusTo_and_BusName(bus);
		for(DisplayBus busList:obj7){
			System.out.println(busList);
		}

		SearchBusDAO searchBusTest8=new SearchBusDAO();
		List<DisplayBus> obj8=searchBusTest8.SelectByBusTo_and_BusFrom_and_BusName(bus);
		for(DisplayBus busList:obj8){
			System.out.println(busList);
		}

		SearchBusDAO searchBusTest9=new SearchBusDAO();
		List<DisplayBus> obj9=searchBusTest9.SelectByBusFrom_and_BusName_and_BusTo(bus);
		for(DisplayBus busList:obj9){
			System.out.println(busList);
		}

		SearchBusDAO searchBusTest10=new SearchBusDAO();
		List<DisplayBus> obj10=searchBusTest10.SelectByBusTo_and_BusName_and_BusFrom(bus);
		for(DisplayBus busList:obj10){
			System.out.println(busList);
		}
		SearchBusDAO searchBusTest11=new SearchBusDAO();
		List<DisplayBus> obj11=searchBusTest11.SelectByBusFrom_and_BusTo(bus);
		for(DisplayBus busList:obj11){
			System.out.println(busList);
		}
		SearchBusDAO searchBusTest12=new SearchBusDAO();
		List<DisplayBus> obj12=searchBusTest12.SelectBy_BusTo_and_BusFrom(bus);
		for(DisplayBus busList:obj12){
			System.out.println(busList);
		}
		
	}

}
