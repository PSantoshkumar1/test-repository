package com.sample;

public class Road {

	public static void main(String[] args) {
Vehicle[] v=new Vehicle[4];
v[0]=new Bike("10","REd","HD");
v[1]=new Vehicle("11","BLUE");
v[2]=new Re("12","Blac","RE",35.0);
v[3]=new Bike("13","MArr","Kawa");
for(Vehicle vehicle:v)

{
	System.out.println("vehicleNumebr  "+ vehicle.vehicleNumber);
	System.out.println("colour is"+vehicle.colour);
	if(vehicle instanceof Bike)
	System.out.println("name is "+((Bike)vehicle).name);
	if(vehicle instanceof Re)
	System.out.println("Miliage is "+((Re)vehicle).miliage);
	
	System.out.println("|||||||||||||||||||||");
	vehicle.move();
	vehicle.move("COORG");
}
	}

}
