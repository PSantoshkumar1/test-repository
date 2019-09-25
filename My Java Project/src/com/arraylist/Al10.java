package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Al10 {

	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList();
		al.add("Man");
		al.add("KAL");
		al.add("SAN");
		al.add("CAB");
		al.add("ABC");
		
		//before sorting
		System.out.println("before sorting");
		System.out.println(al);
		
		Collections.sort(al);
		//after sorting
		System.out.println("after sorting");
		System.out.println(al);
	}
}
