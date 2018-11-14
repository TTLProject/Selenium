package sikuli.com;

import java.awt.image.RenderedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Image;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Myntra {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		driver.manage().window().maximize();
		Screen s=new Screen();
		//Pattern p=new Pattern("G:\\allow.PNG");
		// Pattern p1=new Pattern("G:\\man.PNG");
		//Pattern p=new Pattern("G:\\allow.PNG");
		//Pattern p1=new Pattern("‪‪‪G:\\search1.PNG");
		//Pattern p=new Pattern("G:\\search1.PNG");
		//s.click(p);
		Thread.sleep(2000);
		//s.click(p);
	//	s.type(p, "shites");
	
		//s.hover(p1);
		//File f=new File("G:/mahe1.PNG");
		//ScreenImage si=s.capture();
		//ImageIO.write(si.getImage(), "png", f);*/
		//s.wheel(Button.WHEEL_DOWN, 50);
		//Location l=new Location(200,400);
		//s.moveTo(l);
		
		//ScreenImage s1=s.capture();
		//ImageIO.write( s1.getImage(), "png", f);
		//s.copyTo(s);
		//s.copyTo(s);
		String id="G:\\search1.PNG";
		
		s.copyTo(s);
		s.paste(id, "shites");
	//s.paste("G:\\search1.PNG", "tshites");
		
		//System.out.println(l);
		//Location i1=s.getTarget();
		 //System.out.println(i1);
		}

}
