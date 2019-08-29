package com.nonstaticblock;

public class Panamerica {
	
	String productcode;
	int size;
	String colour;
	static int countshirt;
	Panamerica()
	{
		countshirt++;
		productcode="PAN"+countshirt;
	}
Panamerica(String colour,int size)
{
	this();
	this.colour=colour;
	this.size=size;
}
	public static void main(String[] args) {
		Panamerica p1=new Panamerica();
		p1.colour="BLACK";
		p1.size=46;
		System.out.println("Colour:"+p1.colour+" Size:"+p1.size+" productcode:"+p1.productcode);
		Panamerica p2=new Panamerica("PURPLE",42);
		System.out.println("Colour is:"+p2.colour+" Size:"+p2.size+" productcode:"+p2.productcode);
		Panamerica p3=new Panamerica("BLUE",44);
		System.out.println("Colour is:"+p3.colour+" Size:"+p3.size+" productcode:"+p3.productcode);
		Panamerica p4=new Panamerica("BLACK",46);
		System.out.println("Colour is:"+p4.colour+" Size:"+p4.size+" productcode:"+p4.productcode);



		System.out.println(countshirt);

	}

}
