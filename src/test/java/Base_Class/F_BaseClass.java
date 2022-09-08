package Base_Class;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utlility_Class.F_UtilityClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class F_BaseClass {

	public WebDriver driver;

	public void initialiseBrowser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(F_UtilityClass.getDataFromPropertyFile("URL"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}
}
