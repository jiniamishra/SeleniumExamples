package com.techcanvass.day1;

import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer, String> m = new LinkedHashMap<Integer, String>();
		m.put(31,"Jack");
		m.put(11,"Tom");
		m.put(2, "Jerry");
		m.put(40,"Jill");
			System.out.println(m);
		System.out.println(m.get(2));
		m.remove(2);
		System.out.println(m);
	}

}
