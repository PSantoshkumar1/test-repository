package com.sample;

public class World {
	
	public static void main(String[] args) {


Elephant [] e=new Elephant[3];
e[0]=new Elephant(80.0,"africa");
e[1]=new Animal(90.0,"antartica","arjun");
e[2]=new Animal(200.0,"south africa","rajan");
//e[3]=new Elephant(250.0,"yudavera");
for(Elephant elephant:e)
{
	System.out.println("Weight is "+ elephant.weight);
	System.out.println("Breed is "+ elephant.breed);
	if(elephant instanceof Animal)
	System.out.println("Name is "+ ((Animal)elephant).name);
	System.out.println("||||||||||||||");
}
	}

}
