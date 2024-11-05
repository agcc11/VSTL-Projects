package utilitiesPackage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import basepackage.BaseClass;

public class UtilityClass extends BaseClass  {

//	WebDriver driver = this.driver;
	public static String TimeStampMethod()
	{
		String t=new SimpleDateFormat("MMM dd HH.mm.ss").format(Calendar.getInstance().getTime());
		return t;
	} 
	
	public void ScreenshotMethod(String filename) throws IOException
	{
		try
		{
			
			File source=((TakesScreenshot)androiddriver).getScreenshotAs(OutputType.FILE);
			File dest=new File(".//screenshots/"+filename+TimeStampMethod()+".jpg");
			FileUtils.copyFile(source, dest);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
}
