package Com.freeCRM.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Com.freeCRM.util.WebListner;

public class TestBase {

	public TestBase() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"D:\\tastia\\FreeCRM\\src\\Com\\freeCRM\\configure\\config.properties");
		prop.load(fis);

	}

	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebListner webListener;

	public void baseClasse(String browser) {
      
		if (browser.equalsIgnoreCase("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GMI\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chmedriver.exe");
		}
		else if (browser.contentEquals("mozilla")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\GMI\\Downloads\\geckodriver.exe");
			driver = new FirefoxDriver();
		
			
			
		}
		e_driver = new EventFiringWebDriver(driver);
		webListener = new WebListner();
		e_driver.register(webListener);
		driver=e_driver;
		
		
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


	}
}
