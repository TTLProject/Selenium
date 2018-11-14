package com.mouseaction;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Spiject1 {
	WebDriver driver;
	@Test
	public void login() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://book.spicejet.com");
		driver.manage().window().maximize();
		Robot r=new Robot();
		Thread.sleep(4000);
		r.mouseMove(100, 500);
		Thread.sleep(4000);
		r.mousePress(InputEvent.BUTTON2_DOWN_MASK);
		Thread.sleep(4000);
		r.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
		Thread.sleep(4000);
		//r.keyPress(KeyEvent.VK_DOWN);
		//Thread.sleep(2000);
		//r.keyRelease(KeyEvent.VK_ENTER);
	}

}
