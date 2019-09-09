package com.abstraction;

public class World {

	public static void main(String[] args) {
	//Dog d1=new Dog(); 
	//d1.talk(); // functionality is provided but concrete class Dog
	//Cat c1=new Cat(); 
	//c1.talk(); //functionality is provided by concrete class cat
	//System.out.println(")))))))))))");
	Animal a;
	a=new Dog();
	a.talk(); //functionality is provided by abstract class animal
	a=new Cat();
	a.talk();//functionality is provided by abstract class animal
	
	}

}
