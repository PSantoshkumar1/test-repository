package com.treemap;

import java.util.TreeMap;

public class Tm1 {
	public static void main(String[] args) {
		TreeMap tm=new TreeMap();
		tm.put(1,"A");
		tm.put(2, "b");
		System.out.println(tm);
tm.put("C", "d"); // CCE
System.out.println(tm);
	}

}
