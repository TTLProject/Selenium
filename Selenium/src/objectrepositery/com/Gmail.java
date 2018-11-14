package objectrepositery.com;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Gmail {
	WebDriver driver;
	@Test
	public void setup() throws Exception {
		Properties p=new Properties();
		FileInputStream fi=new FileInputStream("F:\\New folder\\Selenium\\src\\objectrepositery\\com\\gmail.reperiotrys");
		p.load(fi);
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		driver.findElement(By.id(p.getProperty("email_id"))).sendKeys(p.getProperty("name"));
		Thread.sleep(2000);
	driver.findElement(By.xpath(p.getProperty("next"))).click();
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("pwd_name"))).sendKeys(p.getProperty("pwd"));
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("next1_xpath"))).click();
	}

}
