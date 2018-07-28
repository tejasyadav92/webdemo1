package com.web.login;

public class UserValidationService {
	
	public boolean isValid(String name, String password)
	{
		if(name.equals("tejas") && password.equals("password"))
		{
			return true;
		}
		return false;
	}

}
