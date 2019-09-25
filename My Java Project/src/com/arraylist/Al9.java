package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Al9  {

	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		//accessing the object using iterator() method
		Iterator<Integer> t=ls.iterator();
		while(t.hasNext())
		{
		 int i=t.next();
		 System.out.println(i);
		}
				
				
				
				
				
		
		
	}

}
