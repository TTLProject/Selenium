import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {
	WebDriver srikanth;
	@Test
	public void login() throws Exception {
		srikanth=new ChromeDriver();
		srikanth.get("https://www.facebook.com/");
		srikanth.manage().window().maximize();
		srikanth.findElement(By.id("email")).sendKeys("ramalasri77");
		Thread.sleep(2000);
		srikanth.findElement(By.name("pass")).sendKeys("ramalasrika");
		Thread.sleep(2000);
		srikanth.findElement(By.id("u_0_2")).click();
		
		
	}

}
