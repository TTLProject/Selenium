import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Spiject {
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		Thread.sleep(2000);
		WebElement el=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]"));
		Actions ac=new Actions(driver);
		ac.click(el).build().perform();
		Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"dropdownGroup1\"]/div/ul[2]/li[3]/a")).click();
	
	}

}
