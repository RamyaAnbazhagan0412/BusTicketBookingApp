package com.UserRegistration;

public class UserRegistrationTest {

	public static void main(String[] args) throws Exception{
	UserRegistration ur=new UserRegistration("ramya","aramya@gmail.com","27t73frgvebdu","8847689037");
  //  System.out.println(userName" "+emailId"  "+password"  "+phoneNumber);
    UseRegistrationCommonDAO urDAO=new UseRegistrationCommonDAO();
    urDAO.userRegistrationCommonDAO();
	} 

}
