package com.title;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailEx {
	static WebDriver driver;

	public static void main(String[] args) {
driver=new ChromeDriver();
driver.get("https://accounts.google.com");
driver.manage().window().maximize();

/*String Expactedreslut="Sign in – Google accounts";
String Actualreslut="";
Actualreslut=driver.getTitle();
if(Actualreslut.equalsIgnoreCase(Expactedreslut)) {
	System.out.println("title is true");
}else {
	System.out.println("title is flase");
}*/
String expactedurl="https://accounts.google.com/signin/v2/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2FManageAccount&followup=https%3A%2F%2Faccounts.google.com%2FManageAccount&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
String actualurl=driver.getCurrentUrl();
if(actualurl.equals(expactedurl)) {
	System.out.println("url is true");
}else {
	System.out.println("url is flase");
	
}
String  title=driver.getTitle();
System.out.println(title);
String pagesource=driver.getPageSource();
System.out.println(pagesource);

driver.close();
	}


}

