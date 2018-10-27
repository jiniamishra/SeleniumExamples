package com.techcanvass.day1;

public class myStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = {"tom", "jack", "jill", "jerry" };
		System.out.println("the value " +name[0]);
		System.out.println("the value " +name[1]);
		System.out.println("the value " +name[2]);
		
		for(int i= 0; i < name.length; i++)
		{
			System.out.println(name[i]);
		}
	}

}
