package javascript1.com;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Google {
	WebDriver driver;
	@Test
	public void javascript() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=google&rlz=1C1CHBF_enIN813IN813&oq=goo&aqs=chrome.0.69i59j69i57j69i60.4158j0j8&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);"); 
	}

}
