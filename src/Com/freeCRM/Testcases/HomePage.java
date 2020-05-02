package Com.freeCRM.Testcases;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Com.freeCRM.Base.TestBase;
import Com.freeCRM.pages.HomePagee;
import Com.freeCRM.pages.LoginPagee;
import Com.freeCRM.util.TestUtils;

public class HomePage extends TestBase {

	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	LoginPagee loginpage;
	HomePagee homepage;
    @Parameters({"browser"})
	@BeforeMethod
	public void login(String browser) throws IOException {
		baseClasse(browser);
		loginpage= new LoginPagee();
       homepage= LoginPagee.PerformLogin();
		

	}

	@Test(priority = 1)
	public void clickContact(Method method) throws IOException {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		homepage.clickOnNewContact();
		boolean actual = homepage.IsContactStatusDisplayed();
		Assert.assertTrue(actual, "le statu est disponible");
		TestUtils.takePicture(method.getName());
	


	}

}
