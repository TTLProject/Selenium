package javascript.com;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.guru99.com/scroll-up-down-selenium-webdriver.html");
		driver.manage().window().maximize();
		WebElement e=driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div[1]/div/div/div/div/div/ul/span/a/strong"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2500);");
		js.executeScript("arguments[0].scrollIntoView();", e);
		e.click();
		

	}

}
