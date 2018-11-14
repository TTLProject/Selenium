package pom.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Objectes extends Browser {
	static WebElement el;
    static By profiie=By.id("REGISTERED_BY");
    static By name=By.name("NAME");
   // static By gender=By.id("gendermale");
    static By dd=By.id("DOBDAY");
   static By mm=By.id("DOBMONTH");
  	static By year=By.id("DOBYEAR");
  	static By reginon=By.id("RELIGION");
   static By mothertoung=By.id("MOTHERTONGUE");
  	static By caste=By.id("CASTE_NORMAL");
   static By covntryivingin=By.id("COUNTRY");
   	static By country=By.id("M_COUNTRYCODE");
  	static By moblieno=By.id("MOBILENO");
    static By email=By.id("EMAIL");
    static By pwd=By.id("PASSWORD");
   static By register=By.xpath("//*[@id=\"MatriFormId\"]/div/div[2]/div[2]/input[2]");
   
   public static Select profile() throws Exception {
	el=driver.findElement(profiie);
	Select sc=new Select(el);
	Thread.sleep(2000);
	return sc;
	
   }
   public static WebElement name() throws InterruptedException {
	   Thread.sleep(2000);
	    return driver.findElement(name);
   }
  /*public static WebElement gender() throws InterruptedException {
	   //Thread.sleep(2000);
	return driver.findElement(gender);
	   
   }*/
   public static Select dd() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(dd);
	  Select sc=new Select(el);
	return sc;
	
   }
   public static Select month() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(mm);
		  Select sc=new Select(el);
		return sc;
		
   }
   public static Select year() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(year);
		  Select sc=new Select(el);
		return sc;
		
   }
   public static Select region() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(reginon);
		  Select sc=new Select(el);
		return sc;
   }
   public static Select mothertoung() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(mothertoung);
		  Select sc=new Select(el);
		return sc;
   }
   public static Select caste() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(caste);
		  Select sc=new Select(el);
		return sc;
   }
   public static Select covntryivingin() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(covntryivingin);
		  Select sc=new Select(el);
		return sc;
   }
   public static Select country() throws InterruptedException {
	   Thread.sleep(2000);
	   el=driver.findElement(country);
		  Select sc=new Select(el);
		return sc;
}
   public static WebElement moblieno() throws InterruptedException {
	   Thread.sleep(2000);
	   return driver.findElement(moblieno);
   }
   public static WebElement email() throws InterruptedException {
	   Thread.sleep(2000);
	   return driver.findElement(email);
   }
  
   public static WebElement pwd() throws InterruptedException {
	   Thread.sleep(2000);
	   return driver.findElement(pwd);
   }
   public static WebElement register() {
	   return driver.findElement(register);
   }
}
   
	

