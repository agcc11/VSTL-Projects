package utilitiesPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		String Testname=result.getName();
		Reporter.log(Testname+" started", true);
	}

	WebDriver driver;
	UtilityClass objutility;
	@Override
	public void onTestSuccess(ITestResult result) {
		String Testname=result.getName();
		Reporter.log(Testname+"completed successfully", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String Testname=result.getName();
		Reporter.log(Testname+"testcase failed", true);
		try {
			objutility=new UtilityClass();
			objutility.ScreenshotMethod(Testname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
	

}
