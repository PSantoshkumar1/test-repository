/*
 write a program to create an array of size 10&store all the even numbers starting from 10 then display the array elements which are present at those indices position which are multiples  by 3
 */
package com.array;

public class arrayprogrammultipleby3 {

	public static void main(String[] args) {
int []a=new int[10];
//storing the array
for(int i=0,j=10;i<a.length;j++)
{
	if(j%2==0)
	{
		a[i++]=j;
	}
}
//display the array
for(int i=0;i<a.length;i++)
{
	if(i%3==0)
		System.out.println(a[i]);
		
}
	}

}
