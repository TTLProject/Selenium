package objectrepositery.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Ebay {
	WebDriver driver;
	@Test
	public void register() throws Exception {
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("F:\\New folder\\Selenium\\src\\objectrepositery\\com\\ab.repositeres");
		p.load(fi);
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id(p.getProperty("name_id"))).sendKeys(p.getProperty("name"));
		Thread.sleep(2000);
		driver.findElement(By.id(p.getProperty("email_id"))).sendKeys(p.getProperty("email"));
		Thread.sleep(2000);
		driver.findElement(By.id(p.getProperty("remail_id"))).sendKeys(p.getProperty("remail"));
		Thread.sleep(2000);
		driver.findElement(By.id(p.getProperty("password_id"))).sendKeys(p.getProperty("password"));
		Thread.sleep(2000);
		WebElement el=driver.findElement(By.id(p.getProperty("phone_id")));
		Select sc=new Select(el);
		Thread.sleep(2000);
		sc.selectByValue("us");
		
	}

}
