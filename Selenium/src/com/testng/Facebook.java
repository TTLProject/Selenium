package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver driver; 
@Test(groups= {"smoke","retest"})
public void setup() throws Exception {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("9963836953");
	Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys("abhireddyysr");
	Thread.sleep(2000);
	driver.findElement(By.id("u_0_2")).click();
	driver.close();
}
}
