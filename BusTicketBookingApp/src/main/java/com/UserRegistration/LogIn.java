package com.UserRegistration;
import java.util.Scanner;
public class LogIn {

	public static void login() throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your EmailId ");
		String userEmailId=sc.nextLine();
		System.out.println("Enter  Password");
		String userPassword=sc.nextLine();
       // System.out.println(userEmailId+userPassword);
		UserRegistration ur=new UserRegistration(userEmailId,userPassword);
		boolean isValid =LoginValidation.loginValidation(ur)	;

	  	if (isValid==true) {
	  		//  System.out.println(userName" "+emailId"  "+password"  "+phoneNumber);
	   UseRegistrationCommonDAO urDAO=new UseRegistrationCommonDAO();
	    urDAO.login(ur);
	    System.err.println("Sign in successful"+'\n'+" welcome to bus booking");
	    
		}
	  	else {
	  		System.err.println("Entered  data is invalid"+'\n'+"Please Login");
	  		System.out.println("EmailId= "+ur.emailId+'\n'+"Password= "+ur.password);
	  		System.out.println("");
	  	}
	    

	}

}
