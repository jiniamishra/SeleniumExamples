package com.techcanvass.day1;

public class myString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringBuffer mybuffer = new StringBuffer("abc");		
	 StringBuffer mybuffer = new StringBuffer();
 	 mybuffer.append("abc");
 	 mybuffer.append(" xyz");
 	 System.out.println(mybuffer);
 	 System.out.println(mybuffer.reverse());
 	 System.out.println(mybuffer.deleteCharAt(3));
 	 System.out.println(mybuffer.reverse());
 	 System.out.println(mybuffer.delete(2,5));
	}

}
