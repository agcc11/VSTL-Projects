package pompackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.SupportsLocation;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AddtoCartPage {

	AndroidDriver androiddriver;
	
	By redbag = By.xpath("(//android.widget.ImageView[@content-desc='Product Image'])[4]");

	By AddtoCart = By.xpath("//android.widget.Button[@content-desc='Tap to add product to cart']");

//	By productname = By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/titleTV']");
	
//	By checkout = By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/titleTV']");

	By cart = By.xpath("//android.widget.ImageView[@content-desc='Displays number of items in your cart']");

	By checkout = By.xpath("//android.widget.Button[@content-desc='Confirms products for checkout']");
	
	By name = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/fullNameET']");
	
	By address = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/address1ET']");
	
	By city = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/cityET']");

	By zipcode = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/zipET']");
	
	By country = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/countryET']");
	
	By topayment = By.xpath("//android.widget.Button[@content-desc='Saves user info for checkout']");
	
	By fullname = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/nameET']");

	By cardnumber = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/cardNumberET']");
	
	By expiredate = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/expirationDateET']");
	
	By securitycode = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/securityCodeET']");

	By revieworder = By.xpath("//android.widget.Button[@content-desc='Saves payment info and launches screen to review checkout data']");
	
	By placeorder = By.xpath("//android.widget.Button[@content-desc='Completes the process of checkout']");
	
	By orderConfirmMsg = By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/thankYouTV']");

	public void selectItemAndAddtoCart() throws InterruptedException
	{
		androiddriver.findElement(redbag).click();
		TouchAction action = new TouchAction(androiddriver);
		PointOption pointStart = PointOption.point(873, 1680);
		PointOption pointEnd = PointOption.point(840, 802);
		action.press(pointStart).moveTo(pointEnd).release().perform();
		androiddriver.findElement(AddtoCart).click();
		androiddriver.findElement(cart).click();
		Thread.sleep(3000);
		androiddriver.findElement(checkout).click();
		Thread.sleep(3000);
	}
	
	public void EnterPersonalDetails() throws InterruptedException
	{
		androiddriver.findElement(name).sendKeys("Rahul");
		androiddriver.findElement(address).sendKeys("c building");
		androiddriver.findElement(city).sendKeys("pune");
		androiddriver.findElement(zipcode).sendKeys("31245");
		androiddriver.findElement(country).sendKeys("India");
		Thread.sleep(3000);
//		MobileElement topaymentbtn=(MobileElement)androiddriver.findElement(MobileBy.AndroidUIAutomator(
//				"new Uiscrollable(new UiSelector()).scrollIntoView("+"new UiSelector().description(\"To Payment\"));"));

//		TouchAction action = new TouchAction(androiddriver);
//		PointOption pointStart = PointOption.point(982, 1560);
//		PointOption pointEnd = PointOption.point(1006, 934);
//		action.press(pointStart).moveTo(pointEnd).release().perform();
//		androiddriver.findElement(topayment).click();
		
		androiddriver.findElement(
				new AppiumBy.ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0))"
						+ ".scrollIntoView(new UiSelector()" + ".textMatches(\"" + "To Payment" + "\").instance(0))"));
		androiddriver.findElement(topayment).click();
	}
	
	
	public void EnterCardDetails() throws InterruptedException
	{
		androiddriver.findElement(fullname).sendKeys("Rahul wert");
		androiddriver.findElement(cardnumber).sendKeys("1234567811223344");
		androiddriver.findElement(expiredate).sendKeys("07/25");
		androiddriver.findElement(securitycode).sendKeys("234");
		androiddriver.findElement(revieworder).click();
		androiddriver.findElement(placeorder).click();
		Thread.sleep(3000);
		boolean result=androiddriver.findElement(orderConfirmMsg).isDisplayed();
		Assert.assertEquals(result, true,"product order is notsuccesfully placed");
	}
	
	public AddtoCartPage(AndroidDriver androiddriver)
	{
		this.androiddriver = androiddriver;
	}
}
