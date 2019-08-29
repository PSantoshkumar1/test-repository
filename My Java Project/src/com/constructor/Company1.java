package com.constructor;

public class Company1 {

	public static void main(String[] args) {
Laptop l1=new Laptop("dell",4,"i5");
Laptop l2=new Laptop("lenova",5,"i3");
Laptop l3=new Laptop("HP",3,"i3");
System.out.println("brand is:"+l1.brand +" ram is:"+ l1.ram +" processor is:"+    l1.processor);
System.out.println("brand is:"+l2.brand +" ram is:"+ l2.ram +" processor is:"+    l2.processor);
System.out.println("brand is:"+l3.brand +" ram is:"+ l3.ram +" processor is:"+    l3.processor);

	}

}
