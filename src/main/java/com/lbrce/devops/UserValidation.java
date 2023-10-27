package com.lbrce.devops;
import java.util.ResourceBundle;
public class UserValidation {
	public boolean check(String inUID,String inPSW)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String UID=rb.getString("uname");
		String Pswd=rb.getString("psw");
		if(UID.equals(inUID)&&Pswd.equals(inPSW))
		{
			return true;
		}
		else {
			return false;
		}
	}

}
