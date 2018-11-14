package slider.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions ac=new Actions(driver) ;
		ac.click(slider).build().perform();
		for(int i=0;i<50;i++) {
			ac.clickAndHold(slider).moveByOffset(100, 0).build().perform();
			ac.build().perform();
		}
	}

}
