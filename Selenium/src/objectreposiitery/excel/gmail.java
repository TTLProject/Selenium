package objectreposiitery.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class gmail {
	WebDriver driver;
	@Test
	public void setup() throws Exception {
		File f=new File("F:\\New folder\\Selenium\\src\\objectreposiitery\\excel\\gmail.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		Properties p=new Properties();
		FileInputStream fl=new FileInputStream("F:\\New folder\\Selenium\\src\\objectreposiitery\\excel\\abc.repositers");
		p.load(fl);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.findElement(By.id(p.getProperty("email_id"))).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("next"))).click();
		Thread.sleep(2000);
		driver.findElement(By.name(p.getProperty("pwd_name"))).sendKeys(sh.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(2000);
		driver.findElement(By.xpath(p.getProperty("next1_xpath"))).click();
	}

}
