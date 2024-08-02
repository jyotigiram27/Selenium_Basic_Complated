package TestCases;


import org.testng.annotations.Test;

import Com.Crm.BaseClass.Vtiger_Baseclass;
import Com.Crm.Pom.Login_Page;


public class CreateOrginization extends Vtiger_Baseclass

{
	@Test
	public void login()
	{
		Login_Page  ref = new Login_Page (driver);
		ref.userName("admin");
		ref.password("root");
		ref.loginbutton();
		
		
	}
	
	
	
}
