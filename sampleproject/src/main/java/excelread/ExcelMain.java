package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
String s=ExcelCode.readStringData(1,0);//we are printing the values by calling the methods 
System.out.println(s);

String s2=ExcelCode.readStringData(2, 0);
System.out.println(s2);
String s1=ExcelCode.readIntegerData(1,1);
String s3=ExcelCode.readIntegerData(2, 1);
System.out.println(s3);

System.out.println(s1);
	}

}
