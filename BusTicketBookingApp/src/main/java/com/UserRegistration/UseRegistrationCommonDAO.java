package com.UserRegistration;
	import java.sql.Connection;
	import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.display_bus.DisplayBus;

	public class UseRegistrationCommonDAO{

		public static void userRegistrationCommonDAO( UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query="INSERT INTO bus_ticket_booking_app_registration(full_name,email_id,PASSWORD,phone_number)VALUES( '"+us.userName+"','"+us.emailId+"', '"+us.password+"','"+us.phoneNumber+"')";
			Statement statement=connection.createStatement();
			int rows=statement.executeUpdate(query);
			System.out.println("Successfully Registerd");
		}
		
		public List<UserRegistration>userRegistrationList( UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query="SELECT *FROM bus_ticket_booking_app_registration";
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				//userName, String emailId, String password, String phoneNumber
				
				String userName=rs.getString("full_name");
				String emailId=rs.getString("email_id");
				String password=rs.getString("PASSWORD");
				String phoneNumber=rs.getString("phone_number");
				
				
				UserRegistration busObj=new UserRegistration(userName,emailId,password,phoneNumber);
				userRegistrationList.add(busObj);			
				
			}
			connection.close();
			return userRegistrationList;
		}
		
		
		public List<UserRegistration>updatePhoneumberByusername(UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query2="UPDATE bus_ticket_booking_app_display SET phone_number='"+us.phoneNumber+"' WHERE full_name='"+us.userName+"'";
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(query2);// userName emailId password phoneNumber;
			if(rs.next())
			{
				//userName, String emailId, String password, String phoneNumber
				
				String userName=rs.getString("full_name");
				String emailId=rs.getString("email_id");
				String password=rs.getString("PASSWORD");
				String phoneNumber=rs.getString("phone_number");
				
				
				UserRegistration busObj=new UserRegistration(userName,emailId,password,phoneNumber);
				userRegistrationList.add(busObj);			
				
			}
			connection.close();
			return userRegistrationList;
		}
		public List<UserRegistration>updatePasswordByEmailId(UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query2="UPDATE bus_ticket_booking_app_display SET PASSWORD='"+us.password+"' where email_id='"+us.emailId+"'";
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(query2);// userName emailId password phoneNumber;
			if(rs.next())
			{
				//userName, String emailId, String password, String phoneNumber
				
				String userName=rs.getString("full_name");
				String emailId=rs.getString("email_id");
				String password=rs.getString("PASSWORD");
				String phoneNumber=rs.getString("phone_number");
				
				
				UserRegistration busObj=new UserRegistration(userName,emailId,password,phoneNumber);
				userRegistrationList.add(busObj);			
				
			}
			connection.close();
			return userRegistrationList;
		}
		public List<UserRegistration>updateEmailIdbyPhoneNumber(UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query2="UPDATE bus_ticket_booking_app_display SET phone_number ='"+us.phoneNumber+"' WHERE email_id='"+us.emailId+"'";
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(query2);// userName emailId password phoneNumber;
			if(rs.next())
			{
				//userName, String emailId, String password, String phoneNumber
				
				String userName=rs.getString("full_name");
				String emailId=rs.getString("email_id");
				String password=rs.getString("PASSWORD");
				String phoneNumber=rs.getString("phone_number");
				
				
				UserRegistration busObj=new UserRegistration(userName,emailId,password,phoneNumber);
				userRegistrationList.add(busObj);			
				
			}
			connection.close();
			return userRegistrationList;
		}
		public List<UserRegistration>updateUsernameByEmailId(UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query2="UPDATE bus_ticket_booking_app_display SET full_name ='"+us.userName+"' WHERE email_id='"+us.emailId+"'";
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(query2);// userName emailId password phoneNumber;
			if(rs.next())
			{
				//userName, String emailId, String password, String phoneNumber
				
				String userName=rs.getString("full_name");
				String emailId=rs.getString("email_id");
				String password=rs.getString("PASSWORD");
				String phoneNumber=rs.getString("phone_number");
				
				
				UserRegistration busObj=new UserRegistration(userName,emailId,password,phoneNumber);
				userRegistrationList.add(busObj);			
				
			}
			connection.close();
			return userRegistrationList;
		}

		public List<UserRegistration>login( UserRegistration us) throws Exception {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			List<UserRegistration> userRegistrationList=new ArrayList<UserRegistration>();
			Connection connection =DriverManager.getConnection("jdbc:mysql://101.53.133.59:3306/revature_training_db","rev_user","rev_user");
			String query="SELECT email_id,PASSWORD FROM bus_ticket_booking_app_registration WHERE email_id='"+us.emailId+"' AND PASSWORD='"+us.password+"'";
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery(query);
			while(rs.next())
			{
				//userName, String emailId, String password, String phoneNumber
				
				//String userName=rs.getString("full_name");
				String emailId=rs.getString("email_id");
				String password=rs.getString("PASSWORD");
				//String phoneNumber=rs.getString("phone_number");
				
				
				UserRegistration busObj=new UserRegistration(emailId,password);
				userRegistrationList.add(busObj);			
				
			}
			connection.close();
			return userRegistrationList;
		}
	
		
	}



