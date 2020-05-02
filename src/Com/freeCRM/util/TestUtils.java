package Com.freeCRM.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Com.freeCRM.Base.TestBase;

public class TestUtils extends TestBase {

	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void takePicture(String name) throws IOException {

		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);// sajel tsawer fel scrFile
		FileUtils.copyFile(scrFile, new File("D:\\tastia\\FreeCRM\\Photo\\" + name + ".png"));// ta3tih chemin
	}

	public static Object[][] getFromExcel(String sheetname) throws Exception {

		File file = new File("C:\\Users\\GMI\\Desktop\\Classeur1.xlsx");
		FileInputStream fis = new FileInputStream(file);

		// apache poi

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(sheetname);

		String message = sheet.getRow(2).getCell(0).toString();

		int numligne = sheet.getLastRowNum();
		int numcolonne = sheet.getRow(0).getLastCellNum();

		Object data[][] = new Object[numligne][numcolonne];

		for (int i = 0; i < numligne; i++) {
			for (int j = 0; j < numcolonne; j++) {

				data[i][j] = sheet.getRow(i).getCell(j).toString();

			}

		}
		return data;
		
	

	}

}
