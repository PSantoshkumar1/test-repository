package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.arraylist.Movie;

public class Hs1 {
public static void main(String[] args) {
	

	
	HashSet hs=new HashSet();
	ArrayList al=new ArrayList();
	al.add(10);
	al.add("chowdary");
	al.add(1);
	hs.add(10);
	hs.add("hello");
	hs.add(10.9);
	hs.add("Putta");
	hs.add(null);
	hs.add("****");
	hs.add(10); //duplicate nt allowed

hs.contains("Putta");
Iterator t =hs.iterator();
while(t.hasNext())
{
Object	ob=t.next();
System.out.println(ob);
}
System.out.println(">>>>>>>>>>>>.");

for(Object ob:hs)
{
	System.out.println(ob);
}
System.out.println("<<<<<<<<<<<<<<");

}
}