package Testobjectrepository;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Userdefinedlibrary.Excel;

public class Repository 
{
	public static WebDriver driver;
	public static WebElement From;
	public static List<WebElement> a1;
	public static WebElement To;
	public static List<WebElement> a2;
	public static WebElement Search;
	//Click from button
	public static WebElement Element1(WebDriver driver)
	{
		From=driver.findElement(By.xpath("//*[@id='src']"));
		return From;
	}
	//Auto suggestion for from elements
	public static List<WebElement> Autosuggest1(WebDriver driver)
	{
		a1=driver.findElements(By.xpath("//*[@class='autoFill']"));
		return a1;
	}
	//click To button
	public static WebElement Element2(WebDriver driver)
	{
		To=driver.findElement(By.xpath("//*[@id='dest']"));
		return To;
	}
	//Auto suggest element for To elements
	public static List<WebElement> Autosuggest2(WebDriver driver)
	{
		a2=driver.findElements(By.xpath("//*[@class='autoFill']"));
		return a2;
	}
	//click on depart date
	public static void Element3(WebDriver driver) throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		Excel.readExcel();
		String dd=Excel.date;
		String mm=Excel.month;
		String yy=Excel.year;
		WebElement l=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
		String ll=l.getText();
		String lll[]=ll.split(" ");
		String m1=lll[0];
		String y1=lll[1];
		while(!yy.equalsIgnoreCase(y1))
		{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			WebElement q=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
			String f=q.getText();
			System.out.println(f);
			String qq[]=f.split(" ");
			y1=qq[1];
		}
		while(!mm.equalsIgnoreCase(m1))
		{
			driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
			WebElement q=driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]"));
			String f=q.getText();
			System.out.println(f);
			String qq[]=f.split(" ");
			m1=qq[0];
		}
		WebElement cal=driver.findElement(By.xpath(" //*[@id=\"rb-calendar_onward_cal\"]/table/tbody"));
		List<WebElement> rows,cols;
		String caldt;
		rows=cal.findElements(By.tagName("tr"));
		for(int i=1;i<rows.size();i++)
		{
		cols=rows.get(i).findElements(By.tagName("td"));
		 for(int j=1;j<cols.size();j++)
		 {
		  caldt=cols.get(j).getText();
		  if(caldt.equals(dd))
		   {
		   	cols.get(j).click();
		   	break;
		   	}
		  }
		 }
	}
	//click on return date
		public static void Element4(WebDriver driver) throws IOException
		{
			driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
			Excel.readExcel();
			String dd=Excel.date1;
			String mm=Excel.month1;
			String yy=Excel.year1;
			WebElement l=driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]"));
			String ll=l.getText();
			String lll[]=ll.split(" ");
			String m1=lll[0];
			String y1=lll[1];
			while(!yy.equalsIgnoreCase(y1))
			{
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
				WebElement q=driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]"));
				String f=q.getText();
				System.out.println(f);
				String qq[]=f.split(" ");
				y1=qq[1];
			}
			while(!mm.equalsIgnoreCase(m1))
			{
				driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
				WebElement q=driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]"));
				String f=q.getText();
				System.out.println(f);
				String qq[]=f.split(" ");
				m1=qq[0];
			}
			WebElement cal=driver.findElement(By.xpath(" //*[@id=\"rb-calendar_return_cal\"]/table/tbody"));
			List<WebElement> rows,cols;
			String caldt;
			rows=cal.findElements(By.tagName("tr"));
			for(int i=1;i<rows.size();i++)
			{
			cols=rows.get(i).findElements(By.tagName("td"));
			 for(int j=1;j<cols.size();j++)
			 {
			  caldt=cols.get(j).getText();
			  if(caldt.equals(dd))
			   {
			   	cols.get(j).click();
			   	break;
			   	}
			  }
			 }
		}
	//Search button
		public static WebElement Element5(WebDriver driver)
		{
			Search=driver.findElement(By.xpath("//*[@id=\"search_btn\"]"));
			return Search;
		}
}


