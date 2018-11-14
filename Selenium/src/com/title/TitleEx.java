package com.title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleEx {
	static WebDriver driver;
public static void main(String[] args) {
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	String Expactedtitle="Facebook – log in or sign up";
	String actualtitle="";
	actualtitle=driver.getTitle();
	if(actualtitle.equalsIgnoreCase(Expactedtitle)) {
		System.out.println("title is true");
		
	}
	else {
		System.out.println("title is in corrcet");
		
	}
	
	driver.close();
	
		

	}

}
