package com.title;

import java.util.Iterator;
import java.util.List;

import org.bridj.cpp.std.list;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Telugematrimony {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.telugumatrimony.com/");
		driver.manage().window().maximize();
		String expactedtitle="Telugu Matrimony, Matrimonials, Matrimonial Sites, Marriage, Brides";
		String actualtitle=driver.getTitle();
		if(actualtitle.equalsIgnoreCase(expactedtitle)) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is in correct");
		}
		String url=driver.getCurrentUrl();
		System.out.println(url);
		WebElement e=driver.findElement(By.id("REGISTERED_BY"));
		System.out.println(e);
		Select s=new Select(e);
		List<WebElement>items= s.getOptions();
		System.out.println("no of items are"+items);
		for(int i=0;i<items.size();i++) {
		String s1=items.get(i).getText();
		System.out.println(s1);
		}

		//Thread.sleep(2000);
		//s.selectByIndex(4);
		
		}
	

}
