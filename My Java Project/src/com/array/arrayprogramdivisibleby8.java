/*
write a program to create an array of size 10&store all the numbers divisible by 8,starting from 50 
 */
package com.array;

public class arrayprogramdivisibleby8 {

	public static void main(String[] args) {
int [] a=new int[10];
//storing the array
for(int i=0,j=50;i<a.length;j++)
{
	if(j%8==0)
	{
		a[i++]=j;
	}
}
//display the array
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}
