package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import business_flow.Business_flowClass;
import pompackage.LoginPage;

public class LoginTest extends BaseClass {

	private Business_flowClass objBusiness_flowClass;
	
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		objBusiness_flowClass=new Business_flowClass();
		objBusiness_flowClass.verifylogin();
	}
	
}
