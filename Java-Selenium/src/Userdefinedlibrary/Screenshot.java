package Userdefinedlibrary;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	//To take Screenshot
	public static void Sct(WebDriver driver)
	{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try
	{
		FileUtils.copyFile(src, new File("C:\\nitt\\Redbus\\Screenshot\\"+System.currentTimeMillis()+".jpeg"));
	}
	catch(IOException e)
	{
		System.out.println(e.getMessage());
	}
	}
}

