package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {
	WebDriver driver;
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		File f=new File("F:\\New folder\\Selenium\\gmail.xlsx");
	FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		System.out.println(row);
		for(int i=0;i<row;i++) {
			XSSFCell ce=sh.getRow(i).getCell(0);
			System.out.println(ce);
				String s=sh.getRow(i).getCell(0).getStringCellValue();
					driver.findElement(By.id("identifierId")).sendKeys(s);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
					Thread.sleep(2000);
					driver.findElement(By.name("password")).sendKeys(s);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content")).click();
				}
		driver.navigate().refresh();
		wb.close();
		
		/*int row=sh.getLastRowNum();
	System.out.println("no of rows are"+row);
	for(int i=0;i<row;i++) {
	XSSFCell ce=sh.getRow(i).getCell(0);
	System.out.println(ce);
		String s=sh.getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.id("identifierId")).sendKeys(s);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("password")).sendKeys(s);
			}*/
		
	}
		
		
		
		
	}


