package Userdefinedlibrary;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	public static FileInputStream fip;
	public static FileOutputStream fop;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static Row row;
	public static Cell cell;
	public static String fr;
	public static String to;
	public static String dt1;
	public static String dt2;
	public static String fr1;
	public static String to1;
	public static String date;
	public static String month;
	public static String year;
	public static String date1;
	public static String month1;
	public static String year1;
	//To Read values from excel
	public static void readExcel() throws IOException
	{
		fip=new FileInputStream("C:\\nitt\\Redbus\\Datatable\\Excel.xlsx");
		wb=new XSSFWorkbook(fip);
		sh=wb.getSheetAt(0);
		fr=sh.getRow(0).getCell(0).getStringCellValue();
		fr1=sh.getRow(1).getCell(0).getStringCellValue();
		to=sh.getRow(0).getCell(1).getStringCellValue();
		to1=sh.getRow(2).getCell(0).getStringCellValue();
		dt1=sh.getRow(1).getCell(1).getStringCellValue();
		dt2=sh.getRow(3).getCell(0).getStringCellValue();
		String dateArray[]=dt1.split("-");
		date=dateArray[0];
		month=dateArray[1];
		year=dateArray[2];
		String dateArray1[]=dt2.split("-");
		date1=dateArray1[0];
		month1=dateArray1[1];
		year1=dateArray1[2];
	}
	//To Write values from excel	
	public static void writeExcel(String e) throws IOException
	{
		fip=new FileInputStream("C:\\nitt\\Redbus\\Datatable\\Excel.xlsx");
		wb=new XSSFWorkbook(fip);
		sh=wb.getSheetAt(0);
		row=sh.getRow(2);
		cell=row.createCell(2);
		cell.setCellValue(e);
		fop=new FileOutputStream("C:\\nitt\\Toursphp\\Datatable\\Excel.xlsx");
		wb.write(fop);
	}
}


