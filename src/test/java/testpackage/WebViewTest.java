package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import business_flow.Business_flowClass;

public class WebViewTest extends BaseClass {

private Business_flowClass objBusiness_flowClass;
	
	@Test
	public void verifyWebViewTest() throws InterruptedException
	{
		objBusiness_flowClass=new Business_flowClass();
		objBusiness_flowClass.verifyWebViewfunctionlity();
	}
	
	
	
	
	
	
	
	
}
