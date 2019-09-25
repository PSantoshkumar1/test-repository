package com.equals;

public class P3 {
	String s;
	int j;
	P3(){}
	P3(String s,int j)
	{
		this.s=s;
		this.j=j;
		
	}
public boolean equals(Object ob)
{
	P3 temp=(P3)ob;
	return this.s.contentEquals(temp.s)&& this.j==temp.j; 
}

}
