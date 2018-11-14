package Screenshot;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sun.glass.ui.Screen;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Screenshot1 {

	WebDriver driver;
	@Test
	public void setup() throws IOException {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Screen s=new 
		
	/*Screenshot s=new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
	File f1=new File("G:\\Mahe.jpg");
	ImageIO.write(s.getImage(), "png", f1);*/
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File f1=new File("G:\\Mahe.jpg");
		FileUtils.copyFile(f, f1);*/
		
		
			
			
			
		}
		

		 
	}
 

