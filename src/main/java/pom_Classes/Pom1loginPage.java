package pom_Classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1loginPage {

	@FindBy(xpath = "//input[@id='userid']")private WebElement un;
	@FindBy(xpath = "//input[@id='password']")private WebElement pwd;
	@FindBy(xpath = "//button[.='Login ']")private WebElement logIn;
	
	public Pom1loginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterUNAME(String uname) {
		un.sendKeys(uname);
	}
	
	public void enterPass(String pass) {
		pwd.sendKeys(pass);
	}
	
	public void loginBTN() {
		logIn.click();
	}
}
