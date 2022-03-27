package com.UserRegistration;

public class LoginValidation {
	public static boolean loginValidation(UserRegistration ur) {
		boolean isValid = true;
		 if(ur.emailId.isEmpty()||(!ur.emailId.contains("@gmail.com")))
			{
				System.out.println("Invalid EmailId");
				isValid = false;
				
			}

			if(ur.password.isEmpty()||(!(ur.password.length()>=8)))
			{
				System.out.println("Invalid Password");
				isValid = false;
			}
			return isValid;


	}

}
