package com.inheritence;

public class Dog extends Animal {
	
	void snif()
	{
		System.out.println("dog sniffs ");
	}
	Dog()
	{
		
	}
	Dog(double height,double weight)
	{
		super(height,weight);
	}

}
