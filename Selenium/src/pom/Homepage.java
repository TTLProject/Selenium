package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends Firstprogram {
	 static By name=By.id("email");
	 static By pwd=By.id("pass");
	 static By login=By.id("u_0_2");
	 public static WebElement m1() {
		return driver.findElement(name);
	}
	 public static WebElement p1() {
		return driver.findElement(pwd);
		 
	 }
	 public static WebElement l1() throws InterruptedException {
		 Thread.sleep(2000);
		return driver.findElement(login);
		 
		 
	 }
	 

}
