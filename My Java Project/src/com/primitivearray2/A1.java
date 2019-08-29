//wap to create method which should generate an integer array object
package com.primitivearray2;

public class A1 {
	
		static int[] createarray(int size)
		{
			System.out.println("##################");
			int[] array=new int [size];
			for(int i=0;i<array.length;i++)
			{
				array[i]=i+1;
			}
			System.out.println("@@@@@@@@@@@@@@@@");
			return array;
		}
	

	public static void main(String[] args) {
		System.out.println("^^^^^^^^^^^^^^^^^^");
int[] array=createarray(10);
for(int i=0;i<array.length;i++)
{
	System.out.println(array[i]);
}
System.out.println("___________________________________________");

	}


}
