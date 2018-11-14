package pom1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BROWSER {
	static WebDriver driver;
	@Test
	public static void setup() {
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
		driver.manage().window().maximize();
	}

}
