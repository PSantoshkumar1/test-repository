package com.encapsulation;

public class Mainvoterclass {
	public static void main(String[] args) {
		Voter v1 =new Voter(19, 01);
		System.out.println("Age of voter id no "+v1.getId()+" is "+v1.getAge());
		Voter v2=new Voter(25, 03);
		v2.setAge(17);
		v2.setId(02);
		v2.setAge(28);
		System.out.println("Age of voter id no "+v2.getId()+" is "+v2.getAge());
			
		
	}

}
