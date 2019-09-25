package com.arraylist;

import java.util.ArrayList;
 


public class Al3 {
	
	public static void main(String[] args) {
		
	
	ArrayList l =new ArrayList();
	l.add(10);
	l.add("Hello");
	l.add(new Bike("REd",10.9));
Bike b=new Bike("BLack",10.2);
l.add(b);
System.out.println(l);
	}
}
