package Com.freeCRM.Testcases;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.seleniumhq.jetty9.util.security.Password;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

import Com.freeCRM.Base.TestBase;
import Com.freeCRM.pages.HomePagee;
import Com.freeCRM.pages.LoginPagee;

public class LoginPage extends TestBase {

	public LoginPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPagee loginpage;
	HomePagee homepage;
	
    @Parameters({"browser"})
	@BeforeMethod
	public void setUp(String browser) throws IOException {
		baseClasse(browser);
		LoginPagee loginpage= new LoginPagee();

	}

	@AfterMethod
	public void quit() {
		driver.close();
	}

	@Test(dataProvider = "Data1")
	public void titleTest(String username, String motdp) throws Exception {

		 homepage=loginpage.notPerformLogin(username, motdp);
	    
		
		
		String expectedesult = "https://ui.freecrm.com/";

		String ActualResult = HomePagee.getCurrentURL();
		System.out.print("le titre est ");
		System.out.print(ActualResult);
		Assert.assertEquals(ActualResult, expectedesult);
		
	}

	@DataProvider
	public Object[][] Data1() {
		Object[][] data = new Object[4][2];
		data[0][0] = "driss_nadhem10@hotmail.fr";
		data[0][1] = "Nadhemdriss";
		data[1][0] = "111";
		data[1][1] = "222";
		data[2][0] = "driss_nadhem10@hotmail.fr";
		data[2][1] = "111";
		data[3][0] = "222";
		data[3][1] = "Nadhemdriss";

		return data;
	}

}
