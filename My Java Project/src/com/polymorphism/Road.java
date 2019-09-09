package com.polymorphism;

public class Road {

	public static void main(String[] args) {
Vehicle[] vehicle=new Vehicle[5];
vehicle[0]=new Vehicle("Silver");
vehicle[1]=new Car("White","Swift");
vehicle[2]=new Car("Blue","Jaugar");
vehicle[3]=new Audi("Pink","oo","xuv");
vehicle[4]=new Audi("Violet","PP","MAruti");

for(Vehicle v:vehicle) //for each
{
	System.out.println("vehicle number:"+v.vehicleNumber);
	System.out.println("colour"+ v.colour);
	if(v instanceof Car)
	System.out.println("name "+((Car)v). name);
	if(v instanceof Audi)
	System.out.println("type "+((Audi)v). type);
	v.move();
	v.move(" Spain");
	
	System.out.println("|||||||||||");
	
}
	}

}
