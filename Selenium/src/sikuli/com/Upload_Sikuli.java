package sikuli.com;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Upload_Sikuli {
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		/*String parent=driver.getWindowHandle();
		System.out.println("parent"+parent);
	Set<String>	s=driver.getWindowHandles();
	Iterator<String>it=s.iterator();
	while(it.hasNext()) {
		String child=it.next();
		if(child.equals(parent)) {
		}
	
	driver.switchTo().window(child);
	System.out.println(driver.switchTo().window(child).getTitle());
	driver.close();*/
	
	
//String  filepath="‪C:\\Users\\MAHENDRA\\Downloads\\mahe1.docx";
		String inputfile="‪C:\\Users\\MAHENDRA\\Downloads\\mahe1.docx";
		Screen s1=new Screen();
		Pattern find=new Pattern("‪‪‪C:\\Users\\MAHENDRA\\Desktop\\find.PNG");
		Pattern open=new Pattern("‪‪C:\\Users\\MAHENDRA\\Desktop\\open.PNG");
		driver.findElement(By.id("input_resumeParser")).click();
		s1.type(find, inputfile);
		Thread.sleep(2000);
		s1.click(open);
		
	}
	
	}
