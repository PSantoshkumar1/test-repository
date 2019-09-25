package com.treeset;

import java.util.Scanner;
import java.util.TreeSet;

public class Ts2sub1 {
	public static void main(String[] args) {
		Employee e1=new Employee("Govinda",1);
		Employee e2 =new Employee("Krishna",2);
		Employee e3=new Employee("Vishnu",3);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 1 to sort the employee's by name");
		System.out.println("Enter 2 to sort the employee's by id");
		int choice =sc.nextInt();
		
		switch(choice)
		{
		case 1:
			TreeSet<Employee> emp1=new TreeSet<Employee>();
			emp1.add(e1);
			emp1.add(e2);
			emp1.add(e3);
			System.out.println(emp1);
			break;
			
		case 2:TreeSet<Employee> emp2=new TreeSet<Employee>();
		emp2.add(e1);
		emp2.add(e2);
		emp2.add(e3);
		System.out.println(emp2);
		break;
		default:System.out.println("invalid choice");
		break;
		}
	}

}
