package com.techcanvass.day1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.*;

public class MyTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> name = new TreeSet<String>();
		name.add("Jinia");
		name.add("Shilky");
		name.add("Aditya");
		name.add("sunita");
		name.add("Jinia");
		System.out.println("the size of the collection is " +name.size());
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			System.out.println(s);
		}
		name.remove("Jinia");
		System.out.println("after removing one element the size is " +name.size());
		for (Iterator iterator = name.iterator(); iterator.hasNext();) {
			String s1 = (String) iterator.next();
			System.out.println(s1);
		}
	}

}
