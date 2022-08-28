package Utlility_Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.BeforeMethod;

public class UtilityClass {

	

	public static String getTD(int getrow,int getcell) throws Throwable {
		FileInputStream fls=new FileInputStream("C:\\Users\\NeWt\\Desktop\\Zerodha.xlsx");
		Sheet  sh= WorkbookFactory.create(fls).getSheet("Sheet1");
		 String data=sh.getRow(getrow).getCell(getcell).getStringCellValue();
		 return data;
	}
}
