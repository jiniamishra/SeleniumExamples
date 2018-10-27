package com.techcanvass.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) throws IOException {
		// reading from excel
		
		FileInputStream f = new FileInputStream("E:\\Jinia\\testdata123.xls");
		HSSFWorkbook hw = new HSSFWorkbook(f);
		HSSFSheet fs = hw.getSheetAt(0);
		for (int i=1; i <= fs.getLastRowNum(); i++)
		{
			int j =1;
			HSSFCell id, password;
			id = fs.getRow(i).getCell(j);
			password = fs.getRow(i).getCell(j+1);
			System.out.print(id.toString());
			System.out.print("\t");
			System.out.println(password.toString());
		}
		hw.close();
		f.close();
	}
	

}
