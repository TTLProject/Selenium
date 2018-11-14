package pom2;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Execuation {
	public static void exe() throws Exception {
		File f=new File("F:\\New folder\\Selenium\\gmail2.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook ws=new XSSFWorkbook(fi);
		XSSFSheet sh=ws.getSheetAt(0);
		//XSSFCell ce=sh.getRow(0).getCell(0);
		//System.out.println(ce);
		Objectes.name().sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		Objectes.next().click();
		Objectes.pwd().sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		Objectes.next1().click();
		
	}

}
