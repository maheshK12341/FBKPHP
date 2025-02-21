package GenericMethods;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import BaseNP.BaseNP;

public class GenericMethod extends BaseNP
{

	
	public static void Click(WebElement element)
	{
		//element.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	
	public static String Takescreenshot() throws IOException
	{

	TakesScreenshot tc=(TakesScreenshot)driver;
	
	File scrfile=tc.getScreenshotAs(OutputType.FILE);
	
	File destfile=new File("D://KPHP//"+"ScreenCaptue"+System.currentTimeMillis()+".png");
	
	FileUtils.copyFile(scrfile, destfile);
	
String srcpath=destfile.getAbsolutePath();
	
	return srcpath;
	
	}
	
}
