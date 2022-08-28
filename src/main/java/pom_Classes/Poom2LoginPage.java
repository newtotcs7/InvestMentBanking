package pom_Classes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poom2LoginPage {

	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[.='Continue ']")private WebElement contbtn;
	
	public Poom2LoginPage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterPIN(String PIN) {
		pin.sendKeys(PIN);
	}
	
	public void clickBtn() {
		contbtn.click();
	}
}
