package Functionallibrary;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testobjectrepository.Repository;
import Userdefinedlibrary.Driversetup;
import Userdefinedlibrary.Excel;
import Userdefinedlibrary.Screenshot;

public class Testscript extends Driversetup
{
	@BeforeTest
	@Parameters("browser")
	public static void Driverpage(@Optional String browser)
	
	{
		//Initialize driver
		driver=Driversetup.Driverstart(browser);
	}
	@Test(priority=0)
	public static void Location() throws IOException, InterruptedException
	{
		//From location
		WebElement f=Repository.Element1(driver);
		f.click();
		Excel.readExcel();
		String q=Excel.fr;
		String t=Excel.to;
		String o=Excel.fr1;
		String p=Excel.to1;
		f.sendKeys(q);
		//Auto suggestion of places
		Thread.sleep(5000);
		List<WebElement> l=Repository.Autosuggest1(driver);
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			if(l.get(i).getText().contains(o))
			{
				l.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);
		f.sendKeys(Keys.TAB);
		//To location
		WebElement k=Repository.Element2(driver);
		k.click();
		k.sendKeys(t);
		//Auto suggest foe to element
		Thread.sleep(5000);
		List<WebElement> m=Repository.Autosuggest2(driver);
		System.out.println(m.size());
		for(int i=0;i<m.size();i++)
		{
			if(m.get(i).getText().contains(p))
			{
				m.get(i).click();
				break;
			}
		}
	}
	@Test(priority=1)
	public static void Datepage() throws IOException
	{
		Repository.Element3(driver);
	}
	@Test(priority=2)
	public static void Datepage2() throws IOException
	{
		Repository.Element4(driver);
	}
	@Test(priority=3)
	public static void Searchpage()
	{
		Screenshot.Sct(driver);
		Repository.Element5(driver).click();
	}
	@Test(priority=4)
	public static void Screenshotpage() throws Exception
	{
		Thread.sleep(4000);
		Screenshot.Sct(driver);
	}
	@AfterTest
	public static void close()
	{
		Driversetup.close();
	}
}
