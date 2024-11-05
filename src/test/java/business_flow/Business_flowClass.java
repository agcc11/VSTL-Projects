
package business_flow;



import org.openqa.selenium.WebDriver;

import basepackage.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import pompackage.AddtoCartPage;
import pompackage.LoginPage;
import pompackage.WebViewPage;

public class Business_flowClass extends BaseClass{

//	WebDriver driver;
//	AndroidDriver androiddriver;
	private LoginPage objLoginPage;
	private WebViewPage objwebviewpage;
	private AddtoCartPage objaddtocartpage;
	
	public void verifylogin() throws InterruptedException
	{
		objLoginPage=new LoginPage(androiddriver);
		objLoginPage.clickOnViewMenu();
		objLoginPage.clickOnLogbtnOpt();
		Thread.sleep(3000);
		objLoginPage.typeusername("username");
		objLoginPage.typepassword(pro.getProperty("password"));
		objLoginPage.ClickOnLogin();
	}

	public void verifyWebViewfunctionlity() throws InterruptedException
	{
		objwebviewpage=new WebViewPage(androiddriver);
		objwebviewpage.clickOnViewMenu();
		objwebviewpage.clickOnWebView();
		objwebviewpage.typeurl(pro.getProperty("otherAppUrl"));
		objwebviewpage.clickOnGotoSite();
	}
	
	public void verifyAddToCartfunctionlity() throws InterruptedException
	{
		objaddtocartpage=new AddtoCartPage(androiddriver);
		objaddtocartpage.selectItemAndAddtoCart();
		objaddtocartpage.EnterPersonalDetails();
		objaddtocartpage.EnterCardDetails();
	}
	

	
	
	
	
	
	
}
