package com.display_bus;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BusDAO {
				public void busDAO(DisplayBus ds) throws Exception {
				Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
				System.out.println(connection);
				String query="INSERT INTO bus_ticket_booking_app_display (bus_name,bus_from,bus_to,bus_date,bus_timing )VALUES('"+ds.busName+"','"+ds.busFrom+"','"+ds.busTo+"',NOW(),'"+ds.busTiming+"')";
				Statement statement=connection.createStatement();
				int rows=statement.executeUpdate(query);
				System.out.println("no of rows inserted:"+rows);
				connection.close();
			}
				public void busDAOUpdate(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					System.out.println(connection);
					String query2="update bus_ticket_booking_app_display set bus_from='"+ds.busFrom+"' where bus_name='"+ds.busName+"'";
					System.out.println(query2);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query2);
					System.out.println("no of rows updated"+rows);
					connection.close();
					
				}
				public void busDAOSelect()throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					System.out.println(connection);
					String query3="SELECT*FROM  bus_ticket_booking_app_display";
					System.out.println(query3);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query3);
					System.out.println("no of rows updated"+rows);
					connection.close();
					
				}
				public void busDAODelete(DisplayBus ds)throws Exception
				{
					Connection connection=DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
					System.out.println(connection);
					String query3="DELETE FROM  bus_ticket_booking_app_display WHERE  bus_name='"+ds.busName+"'";
					System.out.println(query3);
					Statement statement=connection.createStatement();
					int rows=statement.executeUpdate(query3);
					System.out.println("no of rows updated"+rows);
					connection.close();
					
				}
				

		}


