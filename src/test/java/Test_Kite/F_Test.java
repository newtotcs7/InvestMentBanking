package Test_Kite;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class.F_BaseClass;
import Utlility_Class.F_UtilityClass;

import pom_Classes.Page1;
import pom_Classes.Page2;
import pom_Classes.Page3;




public class F_Test extends F_BaseClass {


	Page1 login1;
	Page2 login2;
	Page3 home;
	int TestCaseID;
	@BeforeClass
	public void openBrowser() throws Throwable {
		initialiseBrowser();
		login1=new Page1(driver);
		login2=new Page2(driver);
		home=new Page3(driver);
	}

	@BeforeMethod
	public void loginToApp() throws Throwable {
		login1.enterUNAME(F_UtilityClass.getDataFromPropertyFile("UN"));
		login1.enterPass(F_UtilityClass.getDataFromPropertyFile("PWD"));
		login1.loginBTN();

		login2.enterPIN(F_UtilityClass.getDataFromPropertyFile("PIN"));
		login2.clickBtn();

	}

	@Test
	public void verifyUID() throws Throwable {
		TestCaseID=100;
		String actID = home.verifyUID();
		String expID=F_UtilityClass.getDataFromPropertyFile("UID");
		Assert.assertEquals(actID, expID,"Both Are Diffrent TC Failed");
	}
	@AfterMethod
	public void logOutApp(ITestResult result) throws Throwable {
		if(result.getStatus()==ITestResult.FAILURE) {
			F_UtilityClass.captureScreenshot(driver, TestCaseID);
		}
	}

	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close The Browse",true);
	}
}


