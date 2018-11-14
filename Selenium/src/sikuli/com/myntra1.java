package sikuli.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class myntra1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		//Click
		/*Screen s=new Screen();
		Pattern p=new Pattern("G:\\allow.PNG");
		s.click(p);*/
		//TYPE
		/*Screen s=new Screen();
		s.click("G:\\Capture.PNG");
	s.type("G:\\Capture.PNG", "test");*/
		//Rightclick
		/*Screen s=new Screen();
		s.rightClick("G:\\Capture.PNG");*/
		//DoubleClick
		/*Screen s=new Screen();
		Thread.sleep(3000);
		s.doubleClick("G:\\Capture.PNG");*/
		//Exist
		/*Screen s=new Screen();
		s.exists("G:\\Capture.PNG");*/
		//Wheel
		Screen s=new Screen();
		s.wheel(Button.WHEEL_DOWN, 40);
	
	}

}
