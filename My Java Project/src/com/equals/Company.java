package com.equals;

public class Company {
	public static void main(String[] args) {
		Employee e1=new Employee("Santosh",1);
		Employee e2=new Employee("Kumar",2);
		System.out.println(e1);
		System.out.println(e2);
		AutomatioonEngineer e3=new AutomatioonEngineer("Putta",3,"QTP");
		AutomatioonEngineer e4=new AutomatioonEngineer("Putti",4,"selenium");
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e1));
		System.out.println(e4.equals(e3));
		System.out.println(e3.equals(e4));
		System.out.println(e1.equals(e1));
		System.out.println(e2.equals(e2));
		System.out.println(e3.equals(e3));
		System.out.println(e4.equals(e4));
		
	}

}
