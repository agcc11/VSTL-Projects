package basepackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.rmi.server.ExportException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;

public class BaseClass {

//	public static WebDriver driver;
	public static Properties pro;
	public static AndroidDriver androiddriver;

	@BeforeClass
	public void launchAndroidApp() throws IOException
	{
		try {
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:platformVersion", "11.0");
		cap.setCapability("appium:deviceName", "Realme XT");
		cap.setCapability("appium:app", "C:\\Users\\ADMIN$\\eclipse-workspace\\MobileAutomationProject\\src\\main\\resources\\mda-2.1.0-24.apk");
		cap.setCapability("appium:automationName", "UiAutomator2");
		cap.setCapability("appium:udid", "192.168.1.22:5555");
		cap.setCapability("appium:appWaitActivity", "com.saucelabs.mydemoapp.android.view.activities.MainActivity");
		URL url = new URL("http://127.0.0.1:4723/wd/hub/");
		androiddriver = new AndroidDriver(url,cap);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
//	@AfterClass
//	
//	public void closebrowser()
//	{
//		androiddriver.quit();
//	}
//	
	public BaseClass()
	{
		try
		{
			pro=new Properties();
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//configuration//config.properties");
			pro.load(file);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}
