package com;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Read {

	@Test
	public void m1() throws Exception {
		File f=new File("G:\\cnu\\gmail.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheetAt(0);
		System.out.println(sh.getLastRowNum());
	}

}
