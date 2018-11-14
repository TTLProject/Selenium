package Screenshot;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import multiScreenShot.MultiScreenShot;

public class Screenshot {
	WebDriver driver;
	@Test
	public void setup() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		MultiScreenShot ms=new MultiScreenShot("G:\\mahe1", "google");
ms.multiScreenShot(driver);
driver.findElement(By.id("lst-ib")).sendKeys("gmail sign in");
driver.findElement(By.name("btnK")).click();
ms.multiScreenShot(driver);
	}

}
