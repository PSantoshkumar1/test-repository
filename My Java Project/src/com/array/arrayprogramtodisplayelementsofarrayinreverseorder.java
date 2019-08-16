/*
 write a program to create an array of size 5& store 1st 5 natural numbers & display the element of the array in reverse order
 */
package com.array;

public class arrayprogramtodisplayelementsofarrayinreverseorder {

	public static void main(String[] args) {
		//creating an array of size 5
int[]a=new int[5];
//store the array with multiple of 5
for(int i=0,j=1;i<a.length;j++)
{
	a[i++]=j;
} 
//reversing the order
for(int i=a.length-1;i>=0;i--)
	System.out.println(a[i]);
}
}
