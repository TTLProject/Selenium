package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Scronshot extends Google {
	public static void screon() throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File fs=ts.getScreenshotAs(OutputType.FILE);
		File fd=new File("G:\\aru1.png");
	FileUtils.copyFile(fs, fd);
	}

}
