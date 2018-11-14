package objectrepositrry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Telugumatrimony {
	WebDriver driver;
	Properties p=new Properties();
	
	
	@Test
	public void login() throws Exception {
		File f=new File("F:\\New folder\\Selenium\\teluge.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		FileInputStream fi1=new FileInputStream("F:\\New folder\\Selenium\\src\\objectrepositrry\\abc.repositers");
		p.load(fi1);
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.id(p.getProperty("profile_id")));
		Select sc=new Select(el);
		sc.selectByIndex(2);
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("name_name"))).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
	}

	
	
}
