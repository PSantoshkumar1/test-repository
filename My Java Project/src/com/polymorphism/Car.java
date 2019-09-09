package com.polymorphism;

public class Car extends Vehicle {
	String name;
	
	Car()
	{
		
	}
	Car(String colour,String name)
	{
		super(colour);
		this.name=name;
		}
	 
		void move()
		{
			System.out.println(colour + "Colour car is moving");
		}

	}

