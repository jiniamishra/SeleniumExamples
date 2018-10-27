package com.techcanvass.day1;

import java.util.*;

public class MyMayIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> m = new TreeMap<Integer, String>();
		m.put(31,"Jack");
		m.put(11,"Tom");
		m.put(2, "Jerry");
		m.put(40,"Jill");
		Set<Integer> s = m.keySet();
		for (Iterator i = s.iterator(); i.hasNext();) {
			Integer key = (Integer) i.next();
			//System.out.println(Key);
			System.out.println(key+" " +m.get(key));
		}
	}

}
