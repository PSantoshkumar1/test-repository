package com.hashCode;

public class Hc1 {
	int i;
	Hc1()
	{
		
	
	}
	Hc1(int i)
	{
		this.i=i;
	}

public boolean equals(Object ob)
{
	return this.i==((Hc1)ob).i;
}
public int hashCode()
{
	return i;
}
	
public static void main(String[] args) {
	Hc1 ob1=new Hc1(100);
	Hc1 ob2=new Hc1(101);
	Hc1 ob3=new Hc1(100);
	
	System.out.println(ob1);
	System.out.println(ob2);
	System.out.println(ob3);
	System.out.println(ob1.equals(ob2));
	System.out.println(ob3.equals(ob1));
	System.out.println(ob1.hashCode());
	System.out.println(ob2.hashCode());
	System.out.println(ob3.hashCode());

}
}
