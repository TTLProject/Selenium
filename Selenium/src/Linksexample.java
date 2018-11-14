import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.android.dx.rop.cst.CstArray.List;

public class Linksexample {
	WebDriver driver;
	@Test
	public void setup() {
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
	java.util.List<WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println("no of links are"+links.size());
	for(int i=0;i<links.size();i++) {
		String s=links.get(i).getText();
		System.out.println(s);
	}
	driver.close();
		
		
	}

}
