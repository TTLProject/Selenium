package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Firstprogram {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		}
	@Test(priority=1,enabled=true)
	public void title() {
	String title=driver.getTitle();
	System.out.println(title);
	}
	@Test(priority=2,enabled=false)
	public void url() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test(priority=3,enabled=true)
	public void pagesoure() {
		String pagesourec=driver.getPageSource();
		System.out.println(pagesourec);
	}
	@AfterMethod
	public void logout() {
		driver.close();
	}


}
