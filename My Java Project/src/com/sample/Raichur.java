package com.sample;

public class Raichur {
	public static void main(String[] args) {
		
		School s2=new Student();
		Student s1=(Student)new School();
		if (s1 instanceof School) {
			
		System.out.println(s1);
		
		s1.teach();
	}

	}
}
