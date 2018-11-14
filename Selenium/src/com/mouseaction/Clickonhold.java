package com.mouseaction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Clickonhold {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		/*driver.switchTo().frame(0);
		Actions ac=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
ac.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();*/
		/*WebElement e=driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[2]/ul/li[13]/a"));
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView;", e);
		e.click();*/
		Screen s=new Screen();
		Pattern p=new Pattern("C:\\Users\\MAHENDRA\\Desktop\\Capture.PNG");
        
	
	}

}
