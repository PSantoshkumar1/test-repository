package com.hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Hs2 {
	
	
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(0);
		System.out.println("Before");

		System.out.println(hs);
		
		ArrayList al=new ArrayList (hs);
		Collections.sort(al);
		System.out.println("After");
		System.out.println(al);
	}
	
	
}
