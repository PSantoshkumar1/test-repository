package com.inheritence;

public class Bike1 extends TwoWheeler1 {
double miliage;

Bike1()
{
	
}
Bike1(String colour,String  name,double miliage)
{
	super(colour,name);
	this.miliage=miliage;
}
}
