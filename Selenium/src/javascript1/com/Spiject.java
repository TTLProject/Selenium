package javascript1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Spiject {
	WebDriver driver;
	@Test
	public void register() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		Thread.sleep(2000);
		WebElement el=driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT"));
		Actions ac=new Actions(driver);
		Thread.sleep(2000);
		ac.click(el).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[3]/a")).click();
		WebElement ei=driver.findElement(By.name("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Actions ac1=new Actions(driver);
		Thread.sleep(2000);
		ac1.click(ei).build().perform();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[1]/li[1]/a")).click();
		
		
		
		
	}

}
