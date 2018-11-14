package com.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	WebDriver driver;
	@DataProvider(name="gmail")
	public Object[][]setup() {
		Object[][] o=new  Object[2][2];
		o[0][0]="edamahendra999";
		o[0][1]="mahe*999";
		o[1][0]="edamahendra999";
		o[1][1]="mahe*999";
		return o;
		
	}
		@Test(dataProvider="gmail")
	public void login(String username,String pwd) throws Exception {
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
		
	}
	

}
