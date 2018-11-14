package sikuli.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class facebook {

	public static void main(String[] args) throws Exception {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(3000);
Screen sc=new Screen();
Pattern username=new Pattern("‪C:\\Users\\MAHENDRA\\Desktop\\username.PNG");
Pattern pwd=new Pattern("‪C:\\Users\\MAHENDRA\\Desktop\\pwd.PNG");
Pattern login=new Pattern("‪C:\\Users\\MAHENDRA\\Desktop\\login.PNG");
sc.click("username.PNG");Thread.sleep(2000);
sc.type(username, "9963836953");
Thread.sleep(3000);
sc.click("C:\\Users\\MAHENDRA\\Desktop\\pwd.PNG");
sc.type(pwd, "abhireddyysr");
Thread.sleep(3000);
sc.click(login);
	}

}
