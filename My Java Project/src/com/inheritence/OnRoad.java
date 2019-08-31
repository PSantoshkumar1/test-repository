package com.inheritence;

public class OnRoad {
	
	public static void display(Vehicle2  v)
	{
		System.out.println("Colour is:"+v.colour);
		if(v instanceof TwoWheeler1)
		System.out.println("Name is:"+((TwoWheeler1)v).name);
		if(v instanceof Bike1)
		System.out.println("Miliage is:"+((Bike1)v).miliage);
		System.out.println("##################");
	}

	public static void main(String[] args) {
Vehicle2 v1=new Vehicle2("Red");
TwoWheeler1 t1=new TwoWheeler1("Black","Hd");
Bike1 b1=new Bike1("White","Ninga",15);
Bike1 b2=new Bike1("Blue","Hf",50);
display(v1);
display(t1);
display(b1);
	}

}
