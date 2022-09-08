package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	@FindBy(xpath = "//input[@id='userid']")private WebElement un;
	@FindBy(xpath = "//input[@id='password']")private WebElement pwd;
	@FindBy(xpath = "//button[.='Login ']")private WebElement logIn;

	public  Page1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void enterUNAME(String UN) {
		un.sendKeys(UN);
	}

	public void enterPass(String PWD) {
		pwd.sendKeys(PWD);
	}

	public void loginBTN() {
		logIn.click();
	}
}
