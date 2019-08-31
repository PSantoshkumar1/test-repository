package com.inheritence;

public class Road1 {
	
	static void display(Vehicle1 v)
	{
		System.out.println("Colour is:"+v.colour);
		if(v instanceof TwoWheeler)
		System.out.println("Name is:"+((TwoWheeler)v).name);
		if(v instanceof Bike)
		System.out.println("Miliage is:"+((Bike)v).milaiage);
		System.out.println("********************");
	}
	

	public static void main(String[] args) {
TwoWheeler tw1=new TwoWheeler("Cream","Honda");
Bike b1=new Bike("Red","CBZ",50);
Bike b2=new Bike("Blue","HD",20);
Vehicle1 v1=new Vehicle1("White");
display(b1);
display(tw1);
display(v1);
display(b2);

	}
	
	

}
