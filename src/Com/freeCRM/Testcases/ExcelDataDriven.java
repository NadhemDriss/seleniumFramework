package Com.freeCRM.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.asm.Advice.Return;

public class ExcelDataDriven {
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\GMI\\Desktop\\Classeur1.xlsx");
		FileInputStream fis = new FileInputStream(file);

		// apache poi

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet("Feuil1");

		String message = sheet.getRow(2).getCell(0).toString();

         int numligne = sheet.getLastRowNum();
         int numcolonne = sheet.getRow(0).getLastCellNum();
         
         Object data[][] = new Object[numligne][numcolonne];
         
         for (int i = 0; i < numligne; i++) {
        	 for (int j = 0; j < numcolonne; j++) {
        		 
        		 
        		 data[i][j] = sheet.getRow(i).getCell(j);
				
			}
			
		}
         
         System.out.println(data[0][1]);
	}

}
