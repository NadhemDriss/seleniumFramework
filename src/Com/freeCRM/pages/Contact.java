package Com.freeCRM.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.freeCRM.Base.TestBase;

public class Contact extends TestBase {

	public Contact() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

    @FindBy(xpath="//button[@class='ui linkedin button']//i[@class='edit icon']")
	static
    WebElement nouv;
    
	
	
	@FindBy (xpath="//input[@name='first_name']")
	static
	WebElement firstname;
	
	@FindBy (xpath="//input[@name='last_name']")
	static
	WebElement lastname;
	
	@FindBy (xpath="//div[@name='company']//input[@class='search']")
	static
	WebElement company;
	
	
	@FindBy (xpath="//button[@class='ui linkedin button']")
	static
	WebElement sauvegarder;

	
	
public static void AddContact(String fname, String laname, String compan) throws InterruptedException {
    Thread.sleep(3000);
	nouv.click();
	firstname.sendKeys(fname);
	lastname.sendKeys(laname);
	company.sendKeys(compan);
	sauvegarder.click();
	
}
}
