package Com.freeCRM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.remarks.video.recorder.VideoRecorder;

public class TakeVideo {

	@Test
	public void video() {
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GMI\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chmedriver.exe");
		
		driver.get("https://www.google.com/");
		
	}
}
