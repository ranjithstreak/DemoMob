package Userdefinedlibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driversetup 
{
	public static WebDriver driver;
	public static String exe;
	public static String url="https://www.redbus.in/";
	public static String browsertype=null;
	//To open the browser
	public static WebDriver Driverstart(String browser)
	{
		browsertype=browser;
		//For chrome type browser
		if(browsertype.equalsIgnoreCase("chrome"))
		{
			exe="C:\\jars\\chromedriver_win32\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", exe);
			driver=new ChromeDriver();
		}
//		//For firefox type browser
//		else if(browsertype.equalsIgnoreCase("firefox"))
//		{
//			exe="C:\\all copied files\\selenium all software dumps\\geckodriver-v0.22.0-win64\\geckodriver.exe";
//			System.setProperty("webdriver.gecko.driver", exe);
//			driver=new FirefoxDriver();
//		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	//To close the browser
	public static void close()
	{
		driver.close();
	}
}


