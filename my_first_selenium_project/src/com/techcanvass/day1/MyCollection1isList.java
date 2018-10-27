package com.techcanvass.day1;

import java.util.*;

public class MyCollection1isList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name = new ArrayList<String>();
		name.add("Jinia");
		name.add("Shilky");
		name.add("Aditya");
		name.add("sunita");
		name.add("Jinia");
		System.out.println(name.size());
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		name.remove(0);
		System.out.println("after removing one element the size is " +name.size());
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String s1 = (String) iterator.next();
			System.out.println(s1);
		}
		System.out.println("use of get method output is "+name.get(2));
	}

}
