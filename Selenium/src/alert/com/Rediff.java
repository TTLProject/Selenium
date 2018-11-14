package alert.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javafx.scene.control.Alert;

public class Rediff {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
driver.manage().window().maximize();
driver.findElement(By.name("proceed")).click();
org.openqa.selenium.Alert a=driver.switchTo().alert();
a.accept();
//Alert a=(Alert) driver.switchTo().alert();
//a.close();

	}

}
