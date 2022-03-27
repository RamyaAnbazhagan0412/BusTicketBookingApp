package com.search_bus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import com.display_bus.*;
public class SearchBusDAO{
	public List<DisplayBus>selectAll()throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
//		System.out.println(connection);
		String query="SELECT*FROM  bus_ticket_booking_app_display";
	//	System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}
	public static  List<DisplayBus>selectByName(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
//		System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_name='"+ds.busName+"'";
	//	System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");

		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}
connection.close();
return displayBusList;
		
	}
	public static List<DisplayBus>SelectByBusFrom(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_from='"+ds.busFrom+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
		     String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
		//	System.out.format("\n%d \t\t %s  \t\t %s \t\t %s \t\t %s\t\t %s ",id,busName,busFrom,busTo,busDate,busTiming);
			displayBusList.add(busObj);			
			
		}
connection.close();
return displayBusList;
}
	public List<DisplayBus>SelectByBusTo(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT* FROM  bus_ticket_booking_app_display WHERE bus_to='"+ds.busTo+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectByNameAndBusFrom(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_name='"+ds.busName+"' AND bus_from='"+ds.busFrom+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");

		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectByNameAndBusTo(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_name='"+ds.busName+"' AND bus_to='"+ds.busTo+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectByName_and_BusFrom_and_BusTo(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT* FROM  bus_ticket_booking_app_display WHERE bus_name='"+ds.busName+"' AND bus_from='"+ds.busFrom+"'AND bus_to='"+ds.busTo+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectByBusFrom_and_BusTo_and_BusName(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
    	Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
	//	System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_from='"+ds.busFrom+"' AND bus_to='"+ds.busTo+"'AND bus_name='"+ds.busName+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");

		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectByBusTo_and_BusFrom_and_BusName(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_to='"+ds.busTo+"' AND bus_from='"+ds.busFrom+"'AND bus_name='"+ds.busName+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectByBusFrom_and_BusName_and_BusTo(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT* FROM  bus_ticket_booking_app_display WHERE bus_from='"+ds.busFrom+"' AND bus_name='"+ds.busName+"'AND bus_to='"+ds.busTo+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}


	public List<DisplayBus>SelectByBusTo_and_BusName_and_BusFrom(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT* FROM  bus_ticket_booking_app_display WHERE bus_to='"+ds.busTo+"' AND bus_name='"+ds.busName+"'AND bus_from='"+ds.busFrom+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}


	public List<DisplayBus>SelectByBusFrom_and_BusTo(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_from='"+ds.busFrom+"'AND bus_to='"+ds.busTo+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}

	public List<DisplayBus>SelectBy_BusTo_and_BusFrom(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_to='"+ds.busTo+"' AND bus_from='"+ds.busFrom+ "'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
			String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
			 displayBusList.add(busObj);			
			
		}

		
		//System.out.println("no of rows selected"+rows);
		connection.close();
		return displayBusList;
		
	}
	public static List<DisplayBus>SelectByBusTiming(DisplayBus ds)throws Exception
	{
		List<DisplayBus> displayBusList=new ArrayList<DisplayBus>();
		Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="SELECT *FROM  bus_ticket_booking_app_display WHERE bus_from='"+ds.busTiming+"'";
		//System.out.println(query);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery(query);
		System.out.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
		while(rs.next())
		{
			Integer id=rs.getInt("bus_id");
		     String busName=rs.getString("bus_name");
			String busFrom=rs.getString("bus_from");
			String busTo=rs.getString("bus_to");
			String busDate=rs.getString("bus_date");
			String busTiming=rs.getString("bus_timing");
			DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busTiming);
		//	System.out.format("\n%d \t\t %s  \t\t %s \t\t %s \t\t %s\t\t %s ",id,busName,busFrom,busTo,busDate,busTiming);
			displayBusList.add(busObj);			
			
		}
connection.close();
return displayBusList;
}

	
	
	

}
