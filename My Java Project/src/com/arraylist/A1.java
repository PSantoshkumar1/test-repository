package com.arraylist;
import java.util.ArrayList;

public class A1 {
	
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		System.out.println(ls.size());
		System.out.println(ls.isEmpty());
		ls.add(10);
		ls.add("Bindu");
		System.out.println(ls.add("ANN"));
		System.out.println(ls);
		ls.add("prasanna");
		ls.add(10.9);
		ls.add(2,"VIkas");
		System.out.println(ls);
		System.out.println(ls.set(2, "SAndeep"));
		System.out.println(ls.contains("VIkas"));
		System.out.println(ls.remove(0));
		Object ob=ls.get(2);
		System.out.println(ob);
		System.out.println(ls);
		
		
		
		
		
	}

}
