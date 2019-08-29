//write a program to design a class representating an entity having the following property colour name length price
// design a method know as initialize to assign a value the method should accept value which are to be intilizer
package com.nonstaticmember;

public class p5 {
String name;
String colour;
double length;
int price ;

	void initializer(String name,String colour,double length,int price)
	{
	this.name =name;
	this.colour=colour;
	this.length=length;
	this.price=price;
	System.out.println("Colour:"+this.colour);
	System.out.println("name:"+this.name);
	System.out.println("length:"+this.length);
	System.out.println("price:"+this.price);
}
	public static void main(String[] args) {
  p5 m1 =new p5();
  m1.initializer("loyal","BLACK", 3.3, 100);
  p5 m2=new p5();
  m2.initializer("cello","BLUE",3.6,120);
	}
}
