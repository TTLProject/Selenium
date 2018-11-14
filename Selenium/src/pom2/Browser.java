package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
static WebDriver driver;
public static void setup() {
	driver=new ChromeDriver();
	driver.get("https://accounts.google.com");
	driver.manage().window().maximize();
}
}
