package Com.freeCRM.Testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Exemple {
	
	
	@Test
	public void printValues() throws IOException {
		
		Properties prop =  new Properties();
		FileInputStream fis = new FileInputStream("D:\\tastia\\FreeCRM\\src\\Com\\freeCRM\\configure\\config.properties"); 
		prop.load(fis);
		String URL=  prop.getProperty("mdp");
		System.out.print(URL);
		
	}

}
