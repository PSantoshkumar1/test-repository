package com.sample;

public class Animal extends Elephant {
	String name ;

	public Animal() 
	{
	}

	public Animal(double weight, String breed,String name) {
		super(weight, breed);
		this.name=name;
	}
	
	

}
