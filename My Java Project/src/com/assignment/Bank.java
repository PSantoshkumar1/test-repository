package com.assignment;

public class Bank {

	public static void main(String[] args) {
Home h1=new Home("NILAYA",11.0,4,"Sudarshan");
System.out.println("Type:"+h1.type+" Roi:"+h1.roi+" Tennure:"+h1.tennure+" name:"+h1.name);
h1.interest(50);

Loan l1=new Loan("BIKE",7.2,3);
System.out.println("Type:"+l1.type+" roi:"+l1.roi+" Tennure:"+l1.tennure);
l1.interest(100);

	}

}
