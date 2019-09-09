package com.assignment;

public class Home2 {

	public static void show(Dog x)
	{
		System.out.println("Breed is:"+x.breed+" Name is:"+x.name);
		if(x instanceof DomesticAnimal)
			System.out.println("Weight is:"+((DomesticAnimal)x).weight);
		if(x instanceof Animal)
			System.out.println("Height is:"+((Animal)x).height);
		System.out.println("///////////////////////////////////");
				
	}
	public static void main(String[] args) {
		Dog d=new Dog("pug","madhu");
		DomesticAnimal da=new DomesticAnimal("Husky","pinky",1.5);
		Animal a=new Animal("Boxer","mamatha",1.8,2.0);
		show(d);
		show(da);
		show(a);

	}

}
