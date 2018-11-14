package windowhandle.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parentwindow=driver.getWindowHandle();
		System.out.println("parentwindow"+parentwindow);
	Set<String> s=driver.getWindowHandles();
	Iterator<String> it=s.iterator();
	while(it.hasNext()) {
		String childwindow=it.next();
		if(childwindow.equals(parentwindow)) {
			//driver.switchTo().window(childwindow);
			//System.out.println(driver.switchTo().window(childwindow).getTitle());
			//driver.close();}
		}
		driver.switchTo().window(childwindow);
		System.out.println(driver.switchTo().window(childwindow).getTitle());
		driver.close();
	}
	
	}
	}

	
	


