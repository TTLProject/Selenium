package Excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class Readfile {
	WebDriver driver;
	@Test
	public void setup() throws Exception {
		driver=new ChromeDriver();
		driver.get("https://accounts.google.com");
	driver.manage().window().maximize();
		File f=new File("F:\\New folder\\Selenium\\Book2.xlsx");
		FileInputStream fi=new FileInputStream(f);
	
		@SuppressWarnings("resource")
		XSSFWorkbook ws=new XSSFWorkbook(fi);
		XSSFSheet sh=ws.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		System.out.println("no of rows are"+row);
	for(int i=0;i<row;i++) {
			XSSFCell ce=sh.getRow(i).getCell(0);
			if(ce.getCellType()==Cell.CELL_TYPE_STRING) {
				String s=sh.getRow(i).getCell(0).getStringCellValue();
				driver.findElement(By.id("identifierId")).sendKeys(s);
				
			}
			if(ce.getCellType()==Cell.CELL_TYPE_NUMERIC) {
			 int r=(int) sh.getRow(i).getCell(0).getNumericCellValue();
			 String s1=String.valueOf(r);
			 System.out.println(s1);
			 driver.findElement(By.id("identifierId")).sendKeys(s1);
			}
		}
	driver.navigate().refresh();
	
		
	} 
		
	}


