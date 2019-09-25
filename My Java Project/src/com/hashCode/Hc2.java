package com.hashCode;

public class Hc2 {
	String s;
	
	Hc2(){
		
	}
Hc2(String s)
{
	this.s=s;
}
public boolean equals(Object ob)
{
	return this.s.equals(((Hc2)ob).s);
}

public int hashCode()
{
	return this.s.hashCode();
}
	public static void main(String[] args) {
		Hc2 ob1 =new Hc2("ABC");
		Hc2 ob2 =new Hc2("ABC");
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		

	}

}
