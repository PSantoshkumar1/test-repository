package com.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
public static void main(String[] args) {
	
	TreeSet<Integer>ts=new TreeSet();
	ts.add(10);
	ts.add(20);
	ts.add(30);
	ts.add(40);
	System.out.println(ts);
	System.out.println("Accessing using for ecach");
	for(Integer i:ts)
	{
		int i1=i+10;
		System.out.println(i1);
	}
	System.out.println("Accssinng using Iterator");
	Iterator<Integer> t1=ts.iterator();
	while(t1.hasNext())
	{
		System.out.println(t1.next());
	}
	System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");

	Iterator<Integer> t2=ts.iterator();
	while(t2.hasNext()) 
	{
	System.out.println(t2.next());	
	}
	
}
}
