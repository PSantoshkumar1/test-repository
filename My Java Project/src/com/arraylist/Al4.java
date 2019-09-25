package com.arraylist;

import java.util.ArrayList;

public class Al4 {
	
	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(new Bike());
		ls.add("Rani");
		ls.add("Joker");
		System.out.println(ls);
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
		System.out.println(ls.get(3));
		/*
		 * for(int i=0;i<ls.size();i++) { System.out.println(ls.get(i)); }
		 */
		/*
		 * for(Object ob:ls) { System.out.println(ls.get(ob)); }
		 */
	}

}
