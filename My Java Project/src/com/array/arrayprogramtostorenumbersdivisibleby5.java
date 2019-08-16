/*
 write a program to create an array of size 5 & store all the number divisible by 5 starting from 0...create another array & copy all the elements of the previous array to this array & display the elements that are present at odd indices
 */
package com.array;

public class arrayprogramtostorenumbersdivisibleby5 {

	public static void main(String[] args) {
		//creating an array of size 5
int [] a=new int[5];
//store the array with multiple of 5
for(int i=0,j=0;i<a.length;j++)
{
	if(j%5==0)
	{
		a[i++]=j;
	}
}
//creating another array
int []b=new int[5];
//copying
for(int i=0;i<b.length;i++)
{
	b[i]=a[i];
}	
//display those elements
for(int i=0;i<b.length;i++)
{
	if(i%2==1)
	{
		System.out.println(b[i]);
	
}
}
	}
}

