package com.lbrce.devops;
import com.lbrce.devops.UserValidation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTest {
		@Test
		public void UserValidationTest1()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("", ""));
		}
		@Test
		public void UserValidationTest2()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(false,uv.check("sai", ""));
		}
		@Test
		public void UserValidationTest3()
		{
			UserValidation uv=new UserValidation();
			Assert.assertEquals(true,uv.check("sai", "sai@123"));
		}

}
