package com.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickonofset {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("http://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions ac=new Actions(driver);
		Thread.sleep(2000);
		//WebElement e=driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		ac.clickAndHold(e).moveByOffset(100, 80).release(e).build().perform();

	}

}
