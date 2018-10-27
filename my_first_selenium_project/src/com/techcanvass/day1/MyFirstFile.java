package com.techcanvass.day1;

import java.io.File;
import java.io.IOException;

public class MyFirstFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File myfile = new File("E:\\Jinia\\file1.txt");
        boolean status = myfile.createNewFile();
        if(status)
        {
        	System.out.println("file created");
        }
        else
        	System.out.println("file not created");
}
}
	
