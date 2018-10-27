package com.techcanvass.day1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class My2ndFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream f = new FileOutputStream("E:\\Jinia\\file1.txt");
		String s = "I live in India"; //writes to file
		byte b[] = s.getBytes();
		f.write(b);
		f.close();
		System.out.println(b[1]); // prints the ascii value
	}

}
