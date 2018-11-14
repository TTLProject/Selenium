package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	@Test
public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		File f=new File("F:\\New folder\\Selenium\\google.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook ws=new XSSFWorkbook(fi);
		XSSFSheet sh=ws.getSheetAt(0);
		int row=sh.getLastRowNum();
		System.out.println("no of rows are  "+row);
		for(int i=0;i<row;i++) {
			XSSFCell ce=sh.getRow(i).getCell(0);
			System.out.println(ce);
			if(ce.getCellType()==Cell.CELL_TYPE_STRING) {
				String s=sh.getRow(i).getCell(0).getStringCellValue();
				driver.findElement(By.name("q")).sendKeys(s);
				Thread.sleep(2000);
			}
			if(ce.getCellType()==Cell.CELL_TYPE_NUMERIC) {
				String s1=String.valueOf(sh.getRow(i).getCell(0).getNumericCellValue());
				driver.findElement(By.name("q")).sendKeys(s1);
			}
			driver.navigate().refresh();
			ws.close();
		}
	
		
		
		
	}
}
