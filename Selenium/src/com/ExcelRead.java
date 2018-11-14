package com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class ExcelRead {
	WebDriver driver;
	@Test
	public void setup() throws Exception    {
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
File f=new File("G:\\cnu\\gmail.xlsx");
	FileInputStream fi1=new FileInputStream(f); 
	@SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(fi1);
	XSSFSheet sh=wb.getSheet("Sheet1");
	System.out.println(sh.getLastRowNum());
	
		
	}
	}


