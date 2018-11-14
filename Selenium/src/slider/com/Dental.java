package slider.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dental {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mydentistchoice.com/instruments.html?min=5&max=647820&ajaxcatalog=true");
		driver.manage().window().maximize();
		int[] a= {-100,-40,30,50,70};
		for(int i: a) {
		WebElement el=driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[2]/div/div[1]/div[1]/a[1]"));
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(el, i, 0).build().perform();
		WebElement from=driver.findElement(By.id("minPrice"));
		System.out.println(from.getAttribute("value"));
		String url=driver.getCurrentUrl();
		driver.get(url);
	
		}
	}

}
