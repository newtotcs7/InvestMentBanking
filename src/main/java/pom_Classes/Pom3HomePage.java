package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom3HomePage {

	@FindBy(xpath = "//span[@class='user-id']")private WebElement userID;

	public Pom3HomePage (WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public String verifyUID() {
		String actID=userID.getText();
		return actID;


	}
}
