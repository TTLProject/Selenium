package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		}
	@Test(groups="retest")
	public void title() {
		//String title=driver.getTitle();
		System.out.println("title");
	}
		@Test(groups="retest")
		public void url() {
			//String url=driver.getCurrentUrl();
			System.out.println("url");
					}
		@Test(groups="retest")
		public void sourcecode() {
			//String code=driver.getPageSource();
			System.out.println("code");
		}
		@AfterMethod
		public void logout() {
			driver.close();
		}
	}


