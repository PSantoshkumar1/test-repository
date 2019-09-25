package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public  class P2 implements Comparable<P2>{
int i;
P2(){}
P2(int i){this.i=i;}

	
	  public String toString() 
	  {
		  return "P2 [i=" + i + "]";
	  
	  }
	 
public int compareTo(P2 ob)
{
	return this.i;
}
public static void main(String[] args) {
	P2 ob1=new P2(10);
	P2 ob2=new P2(100);
	P2 ob3=new P2(50);
	ArrayList<P2> al=new ArrayList();
	al.add(ob1);
	al.add(ob2);
	al.add(ob3);
	
	System.out.println(al);
	Collections.sort(al);
	System.out.println(al);
	
	
}
}
