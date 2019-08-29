package com.array3;

public class Company {

	public static void main(String[] args) {
		Employee[] e1=new Employee[10];
		e1[0]=new Employee(1,"NANDAMURI",10);
		e1[1]=new Employee(2,"NTR",20);
		e1[2]=new Employee(3,"JANAKIRAM",30);
		e1[3]=new Employee(4,"KALYANRAM",40);
		e1[4]=new Employee(5,"HARIKRISHNA",50);
		e1[5]=new Employee(6,"BALLAYA",60);
		e1[6]=new Employee(7,"DHONI",70);
		System.out.println(e1[0].id + e1[0].name+ e1[0].salary);
		System.out.println(e1[1].id + e1[1].name+ e1[1].salary);

		System.out.println(e1[2].id + e1[2].name+ e1[2].salary);



		

	}

}
