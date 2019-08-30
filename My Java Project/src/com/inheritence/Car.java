package com.inheritence;

public class Car extends Vehicle {
	String brand ;

	 Car()
	 {
		 
	 }
	 Car(int vno,String colour,String brand)
	 {
super(vno,colour);
this.brand=brand;
	 }
	}

