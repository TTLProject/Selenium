package Roboto.com;

import java.awt.Robot;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.javafx.tk.Toolkit;

public class Nakuri {
	WebDriver driver;
	@Test
	public void setup() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("input_resumeParser")).click();
		Thread.sleep(2000);
	StringSelection s=new StringSelection("F:\\New folder\\Selenium\\Mahendra Exp.doc");
	java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_V);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_CONTROL);
	Thread.sleep(2000);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(2000);
	r.keyPress(KeyEvent.VK_ENTER);
}
	}
