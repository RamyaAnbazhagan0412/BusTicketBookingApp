package com.UserRegistration;
import java.util.Scanner;
public class UserRegistrationTest {

	public static void userRegistration() throws Exception{
		Scanner sc=new Scanner(System.in );
		System.out.println("Enter your Name ");
		String userName=sc.nextLine();
		System.out.println("Enter your EmailId ");
		String userEmailId=sc.nextLine();
		System.out.println("Enter  Password");
		String userPassword=sc.nextLine();
		System.out.println("Enter your PhoneNumber ");
		String userPhoneNumber=sc.nextLine();
  	UserRegistration ur=new UserRegistration(userName, userEmailId,userPassword,userPhoneNumber);
  	boolean isValid = UserRegistrationValidation.userRegistrationValidation(ur)	;

  	if (isValid==true) {
  		
  	
  //  System.out.println(userName" "+emailId"  "+password"  "+phoneNumber);
   UseRegistrationCommonDAO urDAO=new UseRegistrationCommonDAO();
    urDAO.userRegistrationCommonDAO(ur);
	}
  	else {
  		System.err.println("  Data is invalid.Login again");
  		System.out.println("Name= "+ur.userName+'\n' +"EmailId= "+ur.emailId+'\n'+"Password= "+ur.password+'\n'+"PhoneNumber= "+ur.phoneNumber);
  	}
    
	} 

}
