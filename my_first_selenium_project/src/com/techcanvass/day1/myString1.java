package com.techcanvass.day1;

public class myString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  name1 = "Tom";
		String  name2 = "Jerry";
		//System.out.println(name1 +" & "+name2);		
		String fName = name1 +"_"+ name2;
		//System.out.println(fName.length());
		String lName = "Jill  ";
		
		//System.out.println(name1.equals(name2));
		//System.out.println(name1.equals("Tom"));
		//System.out.println(name1.equalsIgnoreCase("tOM"));
		//System.out.println(name1.charAt(2));
		//System.out.println(name1.startsWith("T"));
		//System.out.println(name2.endsWith("y"));
		//System.out.println(name1.indexOf("o"));
		//System.out.println(name1.toLowerCase());
		//System.out.println(name2.toUpperCase());
		//System.out.println(lName.trim());
		//System.out.println(name2.replace("J", "M"));
		//System.out.println(name2.substring(1));
		//System.out.println(name2.substring(1,4));
		
		String sName= "Jack Jill";
		String[] names = sName.split(" ");
		System.out.println(names[0]);
		System.out.println(names[1]);
	}
	

}
