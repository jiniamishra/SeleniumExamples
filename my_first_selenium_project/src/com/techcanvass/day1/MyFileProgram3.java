package com.techcanvass.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyFileProgram3 {

	public static void main(String[] args) throws IOException {
		
       //reading from file
		FileInputStream f = new FileInputStream("E:\\Jinia\\file1.txt");
		int i = 0;
		while((i=f.read())!= -1)
		{
			System.out.print((char)i);
		}
		f.close();
	}

	

}
