package com.BookingTicket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//import com.display_bus.DisplayBus;

public class BookingDAO {
	public static void busDAOBooking(BookingModel ds) throws Exception {
		Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
		//System.out.println(connection);
		String query="INSERT INTO bus_booking(bus_name,bus_from,bus_to,pick_up location,drop_off location )VALUES('"+ds.busName+"','"+ds.busFrom+"','"+ds.busTo+"','"+ds.pickUpLocation+"','"+ds.dropOfflocation+"')";
		Statement statement=connection.createStatement();
		int rows=statement.executeUpdate(query);
		System.out.println("Bus Booked:"+rows);
		connection.close();
	}
}
