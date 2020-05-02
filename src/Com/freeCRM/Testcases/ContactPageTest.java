package Com.freeCRM.Testcases;

import static org.testng.Assert.expectThrows;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Com.freeCRM.Base.TestBase;
import Com.freeCRM.pages.Contact;
import Com.freeCRM.pages.HomePagee;
import Com.freeCRM.pages.LoginPagee;
import Com.freeCRM.util.TestUtils;

public class ContactPageTest extends TestBase {

	public ContactPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPagee loginpage;
    HomePagee homepage;
    Contact contactpage;
	 @Parameters({"browser"})
		@BeforeMethod
		public void login(String browser) throws IOException {
			baseClasse(browser);
			loginpage = new LoginPagee();

			homepage= LoginPagee.PerformLogin();

		}
		@AfterMethod
		public void quit() {
			driver.close();
		}
		
		@Test(dataProvider = "Data2")
		public void addContact(String fname, String laname, String compan) throws InterruptedException, IOException {
			
			
	        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	        
			contactpage= homepage.clickOnNewContact();
			contactpage.AddContact(fname, laname, compan);
		   
			
			Thread.sleep(5000);
			
			
			
			


			
			
			
			
		}
		
		@DataProvider
		public Object[][]  Data2() throws Throwable {
			Object data[][] = TestUtils.getFromExcel("Feuil1");
			return data;
			
			
			
		}
		
		
}
