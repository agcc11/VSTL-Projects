package pompackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.android.AndroidDriver;


public class WebViewPage {

    AndroidDriver androiddriver;
	
	By ViewMenu = By.xpath("//android.widget.ImageView[@content-desc='View menu']");

	By WebView = By.xpath("//android.widget.TextView[@resource-id='com.saucelabs.mydemoapp.android:id/itemTV' and @text='WebView']");

	By urlbox = By.xpath("//android.widget.EditText[@resource-id='com.saucelabs.mydemoapp.android:id/urlET']");

	By gotosite = By.xpath("//android.widget.Button[@content-desc='Tap to view content of given url']");

	By amazonlogo = By.xpath("//android.view.View[@content-desc='Amazon.in']");

	public void clickOnViewMenu()
	{
		androiddriver.findElement(ViewMenu).click();	
	}

	public void clickOnWebView() throws InterruptedException
	{
		androiddriver.findElement(WebView).click();
		Thread.sleep(3000);
	}

	public void typeurl(String OtherAppUrl)
	{
		androiddriver.findElement(urlbox).sendKeys(OtherAppUrl);	
	}
	public void clickOnGotoSite()
	{
		androiddriver.findElement(gotosite).click();
		WebDriverWait wait=new WebDriverWait(androiddriver, Duration.ofSeconds(20));
		WebElement logoamazon=wait.until(ExpectedConditions.visibilityOfElementLocated(amazonlogo));
		boolean value=logoamazon.isDisplayed();
		Assert.assertEquals(value, true);
	}
	
	public WebViewPage(AndroidDriver androiddriver)
	{
		this.androiddriver=androiddriver;
	}
	
	
}
