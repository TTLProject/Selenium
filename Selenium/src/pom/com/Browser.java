package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	static WebDriver driver;
	public static void setup() {
		driver=new ChromeDriver();
		driver.get("https://profile.telugumatrimony.com");
		driver.manage().window().maximize();
	}

}
