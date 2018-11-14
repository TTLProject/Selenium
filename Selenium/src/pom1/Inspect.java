package pom1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Inspect extends BROWSER{
	static By id=By.id("identifierId");
	static By next=By.xpath("//*[@id=\"identifierNext\"]/content/span");
	static By pass=By.name("password");
	static By next1=By.xpath("//*[@id=\"passwordNext\"]/content/span");
	public static WebElement m1() {
		return driver.findElement(id);
		}
	
		public static WebElement m2() throws InterruptedException {
		
		Thread.sleep(2000);
		return driver.findElement(next);
		}
		public static WebElement m3() throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement( pass);
		}
		public static WebElement m4() throws InterruptedException {
		Thread.sleep(2000);
		 return driver.findElement(next1);
		}
		
		
	}


