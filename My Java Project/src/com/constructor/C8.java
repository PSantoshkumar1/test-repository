package com.constructor;

public class C8 {
	int i;
	int j;
	C8()
	{
		
	}
	C8(int i,int j)
	{
	   this.i=i;
	   this.j=j;
}
	static C8 generateObject(int i,int j)
	{
		return new C8(i,j);
	}
	C8 initialize(int i,int j)
	{
     this.i=i;
     this.j=j;
     return this;
	}
	void display()
	{
		System.out.println("i:"+this.i);
		System.out.println("j:"+this.j);
	}
	
	
public static void main(String[] args) {
	C8 ob=C8.generateObject(90,180);
	ob.display();
	ob.initialize(360, 720);
}
	}


