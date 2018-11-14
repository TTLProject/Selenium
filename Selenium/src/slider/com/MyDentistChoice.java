package slider.com;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyDentistChoice {

	public static void main(String[] args) throws Exception {
WebDriver driver=new ChromeDriver();
driver.get("https://www.mydentistchoice.com/instruments.html?min=2936&max=647820&ajaxcatalog=true");
driver.manage().window().maximize();
int a[]= {-120-60,0,40,70,90};
for(int i:a) {
WebElement el=driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[2]/div/div[1]/div[1]"));
Actions ac=new Actions(driver);
Thread.sleep(3000);
ac.dragAndDropBy(el, i, 0).build().perform();
WebElement from=driver.findElement(By.id("minPrice"));
System.out.println(from.getAttribute("value"));
String style=from.getAttribute("style");
System.out.println(style);
//System.out.println(from.getAttribute("margin"));
String s=driver.getCurrentUrl();
driver.get(s);
}

}
}

