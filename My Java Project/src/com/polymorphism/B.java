package com.polymorphism;

import com.assignment.Animal;
import com.assignment.Dog;
import com.assignment.DomesticAnimal;

public class B extends A {
	void test()
	{
		System.out.println("from test()of B");
	}
public static void main(String[] args) { 
A[] array= {new A(),new B(),new A(),new B()};
array[0]=new A();
array[1]=new B();
array[2]=new A();
for(A obj: array)
{
	obj.test();
	System.out.println("*******************");
}
}

//for(int i=0;i<array.length;i++)

{
	
//array[i].test();
//System.out.println("****************");

}

	}


