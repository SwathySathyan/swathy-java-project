package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	
	static FileInputStream f;
	
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	
public static String readStringData(int row,int col) throws IOException {
	
	
	f=new FileInputStream("C:\\Users\\swath\\git\\swathy-java-project\\sampleproject\\src\\main\\resources\\NameAge.xlsx");
	w=new XSSFWorkbook(f);//with the help of Apache POI ,excel file is loaded to memory
	sh=w.getSheet("Sheet1");//to represent Sheet1 in the workbook.
	XSSFRow r=sh.getRow(row);//to get the details in the row as per row number
	XSSFCell c=r.getCell(col);//to the get the cell details as per column number with reference to row number
	return c.getStringCellValue();//to return the details from the cell 
}

public static String readIntegerData(int row,int col) throws IOException {
	f=new FileInputStream("C:\\Users\\swath\\git\\swathy-java-project\\sampleproject\\src\\main\\resources\\NameAge.xlsx");//opens the excel file from given location.
	w=new XSSFWorkbook(f);
	sh=w.getSheet("Sheet1");
	XSSFRow r=sh.getRow(row);
	XSSFCell c =r.getCell(col);//here we are getting in double data type.
	int val=(int)c.getNumericCellValue();//converts double to int using typecasting.
	
	return String.valueOf(val);//converts in to string using valueOf() method
			
}
}
