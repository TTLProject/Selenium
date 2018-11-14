package com.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	WebDriver driver;
	@Parameters({"name","pwd"})
	@Test
	public void login(String name,String pwd) throws Exception {
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys(name);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		
	}

}
