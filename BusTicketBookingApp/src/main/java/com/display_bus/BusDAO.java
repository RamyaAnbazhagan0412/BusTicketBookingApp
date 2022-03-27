package com.display_bus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.UserRegistration.UserRegistration;

public class BusDAO {
				public void busDAO(DisplayBus ds) throws Exception {
				Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				//System.out.println(connection);
				String query="INSERT INTO bus_ticket_booking_app_display (bus_name,bus_from,bus_to,bus_date,bus_timing )VALUES('"+ds.busName+"','"+ds.busFrom+"','"+ds.busTo+"',NOW(),'"+ds.busTiming+"')";
				Statement statement=connection.createStatement();
				int rows=statement.executeUpdate(query);
				System.out.println("Bus inserted:"+rows);
				connection.close();
			}
				public void busDAOUpdate_Bus_from(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_from='"+ds.busFrom+"' where bus_name='"+ds.busName+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus details updated"+rows);
					connection.close();
					
				}
				public void busDAOUpdateBus_To(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_to='"+ds.busTo+"' where bus_name='"+ds.busName+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus details updated"+rows);
					connection.close();
					
				}
				public void busDAOUpdate_Timing(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_timing='"+ds.busTiming+"' where bus_name='"+ds.busName+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus details updated"+rows);
					connection.close();
					
				}
				public void busDAOUpdateBus_Name(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					//System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_from='"+ds.busFrom+"' where bus_name='"+ds.busName+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("Bus details updated"+rows);
					connection.close();
					
				}
			 public static  List<DisplayBus>busDAOSelect() throws Exception {
						//Class.forName("com.mysql.cj.jdbc.Driver");
						List<DisplayBus> displayBus=new ArrayList<DisplayBus>();
						Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
						String query="SELECT *FROM bus_ticket_booking_app_display";
						Statement statement=connection.createStatement();
						ResultSet rs=statement.executeQuery(query);
						System.err.println("\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
						while(rs.next())
						{
							//userName, String emailId, String password, String phoneNumber
//bus_id INT PRIMARY KEY AUTO_INCREMENT,

							Integer id=rs.getInt("bus_id");
							String busName=rs.getString("bus_name");
							String busFrom=rs.getString("bus_from");
							String busTo=rs.getString("bus_to");
							String busDate=rs.getString("bus_date");
							String busTiming=rs.getString("bus_timing");
						//	System.out.println(  "\nBus Id \t\t Bus Name  \t\t Bus From \t\t Bus To \t\t Bus Date\t\t Bus Timing ");
							DisplayBus busObj=new DisplayBus(id,busName,busFrom,busTo,busDate);
			                displayBus.add(busObj);
							
						}
						connection.close();
						return displayBus;
					}	
				
				public void busDAODelete(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					System.out.println(connection);
					String query3="DELETE FROM  bus_ticket_booking_app_display WHERE  bus_name='"+ds.busName+"' AND bus_from='"+ds.busFrom+"'";
					System.out.println(query3);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query3);
					System.out.println("no of rows deleted"+rows);
					connection.close();
					
				}
				
				

		}


