package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import basepackage.BaseClass;
import io.appium.java_client.android.AndroidDriver;

public class LoginPage {

	AndroidDriver androiddriver;
	
	By ViewMenu = By.xpath("//android.widget.ImageView[@content-desc='View menu']");

	By LoginBtnOpt = By.xpath("//android.widget.TextView[@content-desc='Login Menu Item']");
	
	By Username = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/nameET']");
	
	By Password = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/passwordET']");
	
	By LoginBtn = By.xpath("//android.widget.Button[@content-desc='Tap to login with given credentials']");
	
	public void clickOnViewMenu()
	{
		androiddriver.findElement(ViewMenu).click();	
	}
	public void clickOnLogbtnOpt()
	{
		androiddriver.findElement(LoginBtnOpt).click();	
	}
	public void typeusername(String username)
	{
		androiddriver.findElement(Username).sendKeys(username);
	}
	public void typepassword(String password)
	{
		androiddriver.findElement(Password).sendKeys(password);
	}
	public void ClickOnLogin()
	{
		androiddriver.findElement(LoginBtn).click();	
	}

	public LoginPage(AndroidDriver androiddriver)
	{
		this.androiddriver = androiddriver;
	}
	
	
	
	
	
	
	
	
	
	
	
}
