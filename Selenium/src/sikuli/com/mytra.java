package sikuli.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class mytra {
	public static void main(String[] args) throws FindFailed {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		//String expepatedreslut="‪C:\\Users\\MAHENDRA\\Desktop\\Capture1.PNG";
		Screen s=new Screen();
		Pattern p=new Pattern("‪C:\\Users\\MAHENDRA\\Desktop\\Capture3.PNG");
	s.click(p);
//s.find(p);
	
	}

}
