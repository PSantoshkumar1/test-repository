package com.assignment;

public class Home1 {

	public static void main(String[] args) {
Dog[]d=new Dog[3];
d[0]=new Dog("Bulldog","Pinky");
d[1]=new DomesticAnimal("Pug","Madhu",2.0);
d[2]=new Animal("Husky","chilipi",2.5,3.0);
for(Dog dog:d)
{
	System.out.println("Breed is:"+dog.breed+"Name is:"+dog.name);
	if(dog instanceof DomesticAnimal)
	System.out.println("Weight is:"+((DomesticAnimal)dog).weight);
	if(dog instanceof Animal)
	System.out.println("Height is:"+((Animal)dog).height);
	System.out.println("||||||||||||||||||||||||||||");
}
	}

}
