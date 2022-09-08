package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2 {

	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	@FindBy(xpath = "//button[.='Continue ']")private WebElement contbtn;

	public Page2 (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public void enterPIN(String PIN) {
		pin.sendKeys(PIN);
	}

	public void clickBtn() {
		contbtn.click();
	}
}
