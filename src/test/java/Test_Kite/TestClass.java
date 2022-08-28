package Test_Kite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base_Class.BaseClass;
import Utlility_Class.UtilityClass;
import pom_Classes.Pom1loginPage;
import pom_Classes.Pom3HomePage;
import pom_Classes.Poom2LoginPage;

public class TestClass extends BaseClass{

	Pom1loginPage login1;
	Poom2LoginPage login2;
	Pom3HomePage home;
	@BeforeClass
	public void openBrowser() {
		initializeBrowser();
		login1=new Pom1loginPage(driver);
		login2=new Poom2LoginPage(driver);
		home=new Pom3HomePage(driver);
	}
	
	@BeforeMethod
	public void loginToApp() throws Throwable {
		login1.enterUNAME(UtilityClass.getTD(0, 0));
		login1.enterPass(UtilityClass.getTD(0,1));
		login1.loginBTN();
		
		login2.enterPIN(UtilityClass.getTD(0,2));
		login2.clickBtn();
		
	}
	
	@Test
	public void verifyUID() throws Throwable {
		String actID = home.verifyUID();
		String expID=UtilityClass.getTD(0,3);
		Assert.assertEquals(actID, expID,"Both Are Diffrent TC Failed");
	}
	@AfterMethod
	public void logOutApp() {
		Reporter.log("LogOut The Application",true);
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("Close The Browse",true);
	}
}
