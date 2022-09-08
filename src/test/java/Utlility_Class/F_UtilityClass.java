package Utlility_Class;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class F_UtilityClass {

	public static String getDataFromPropertyFile(String key) throws
	IOException 
	 { 
	 FileInputStream file = new FileInputStream("F:\\NeWt Workspace\\InvestmentBanking\\Kite.properties"); 
	 
	 Properties p = new Properties(); 
	 p.load(file);
	 
	 String value = p.getProperty(key); 
	 return value; 
}
	
	public static void captureScreenshot(WebDriver driver, int TestCaseID) throws IOException 
			 { 
			 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
			 
			 File dest = new File("F:\\NeWt Workspace\\InvestmentBanking\\ScreenShots\\TCID"+TestCaseID+".jpg"); 
			 
			 Files.copy(src, dest);
			 } 
}