package Com.freeCRM.pages;

import java.io.IOException;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.freeCRM.Base.TestBase;

public class LoginPagee extends TestBase {
	

	public LoginPagee() throws IOException {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy  (xpath ="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']" )
	static
	WebElement signin;
	
	@FindBy  (xpath ="//input[@placeholder='E-mail address']" )
	static
	WebElement email;
	
	@FindBy (name="password")
	static
	WebElement mdp;
	  
	@FindBy (xpath ="//div[@class='ui fluid large blue submit button']")
	static
	WebElement loginbot;
	
	
	
	public static HomePagee PerformLogin() throws IOException {
		
		signin.click();
		email.sendKeys(prop.getProperty("email"));
		mdp.sendKeys(prop.getProperty("mdp"));
		loginbot.click();
		return new HomePagee();
	}
public static HomePagee notPerformLogin(String username, String modp ) throws IOException {
		
		signin.click();
		email.sendKeys(username);
		mdp.sendKeys(modp);
		loginbot.click();
		return new HomePagee();
	}
	
}
