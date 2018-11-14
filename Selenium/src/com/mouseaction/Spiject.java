package com.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Spiject {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	
driver=new ChromeDriver();
driver.get("https://book.spicejet.com");
driver.manage().window().maximize();
WebElement el=driver.findElement(By.id("highlight-addons"));
Actions ac=new Actions(driver);
ac.moveToElement(el).build().perform();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"menu-list-addons\"]/li[11]/a")).click();


	

	}

}
