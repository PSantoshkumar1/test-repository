package com.arraylist;

import java.util.ArrayList;

public class Al5 {

	public static void main(String[] args) {
ArrayList ls=new ArrayList();
ls.add(10);
ls.add("SAntosh");
ls.add(new Bike("red",20.0));
ls.add(new Employee(01,1000.0));
ls.add(new Student(2,4));
System.out.println(ls);
for(int i=0;i<ls.size();i++)
{
	System.out.println(ls.get(i));
	
}
System.out.println("|||||||||||||");
for(Object ob:ls)
{
	System.out.println(ob);
}
System.out.println("?????????????");
	}

}
