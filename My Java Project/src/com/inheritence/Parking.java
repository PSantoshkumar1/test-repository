package com.inheritence;

public class Parking {

	public static void main(String[] args) {
Vehicle2[]v=new Vehicle2[4];
v[0]= new Bike1("Red","Splen",65);
v[1]=new TwoWheeler1("Brown","Scooty");
v[2]=new Vehicle2("blue");
v[3]=new Bike1("Pink","tv",80);
for(Vehicle2 vehicle :v)
{
	System.out.println("Colour is:"+vehicle.colour);
	if(vehicle instanceof TwoWheeler1)
	System.out.println("Name is:"+((TwoWheeler1)vehicle).name);
	if(vehicle instanceof Bike1)
	System.out.println("Miliage is:"+((Bike1)vehicle).miliage);
	System.out.println("##################");
}
	}

}
