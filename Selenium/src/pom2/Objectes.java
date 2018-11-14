package pom2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Objectes extends Browser {
	static By name=By.id("identifierId");
	static By next=By.xpath("//*[@id=\"identifierNext\"]/content/span");
	static By pwd=By.name("password");
	static By next1=By.xpath("//*[@id=\"passwordNext\"]/content/span");
	public static WebElement name() {
		return driver.findElement(name);
	}
	public static WebElement next() throws Exception {
		Thread.sleep(2000);
		return driver.findElement(next);
		
	}
	public static WebElement pwd() throws Exception {
		Thread.sleep(2000);
		return driver.findElement(pwd);
		
	}
	public static WebElement next1() {
		return driver.findElement(next1);
		
	}

}
