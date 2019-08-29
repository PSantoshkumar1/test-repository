package com.nonstaticmember;

public class school {

	public static void main(String[] args) {
		student s1;
		s1=new student();
		System.out.println("student name:"+s1.name+" id:"+s1.marks);
		
		student s2=new student();
		System.out.println("student name:"+s2.name+" id:"+s2.marks);
		s2.name="chikku";
		s2.marks=50;
		System.out.println("student name:"+s2.name+" id:"+s2.marks);
		
		student s3=new student();
		s3.name="chikki";
		s3.marks=60;
		System.out.println("student name:"+s3.name+" id:"+s3.marks);

	}

}
