package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import business_flow.Business_flowClass;

public class AddToCartTest extends BaseClass {

	private Business_flowClass objBusiness_flowClass;
	
	
	
	@Test
	public void verifyAddToCartTest() throws InterruptedException
	{
		objBusiness_flowClass=new Business_flowClass();
		objBusiness_flowClass.verifylogin();
		Thread.sleep(3000);
		objBusiness_flowClass.verifyAddToCartfunctionlity();
	}
	
	
}
