package com.assignment;

public class Animal extends DomesticAnimal {

	double height;
	Animal()
	{
		
	}
	Animal(String breed,String name,double weight,double height)
	{
		super(breed,name,weight);
		this.height=height;
	}
}
