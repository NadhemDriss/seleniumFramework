package Com.freeCRM.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.freeCRM.Base.TestBase;

public class HomePagee extends TestBase {
	
	public HomePagee() throws IOException {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath="//div[@id='main-nav']//a[3]")
	static
	WebElement contact;
	
	@FindBy (xpath="//div[@class='ui header item mb5 light-black']")
	static
	WebElement contact1;
	
	
public static Contact clickOnNewContact() throws IOException {
	Actions action = new Actions(driver);
	action.moveToElement(contact).click().build().perform();
	
	return new Contact();
	}

public static String getCurrentURL() {
	
	
	String actualURL = driver.getCurrentUrl();
	
	return actualURL;
}
public static boolean IsContactStatusDisplayed() {
	
	
	boolean iscontactStatusDisplayed = contact1.isDisplayed();
	
	return iscontactStatusDisplayed;
}
}