/*
 write a program to create an array&store first 5 whole number &  create another array &copy the element previous array into this array in reverse order display only those element of this new array which are present at the odd indices
 */
package com.array;

public class arrayprogramtostorefirst5wholenumbers {

	public static void main(String[] args) {
int []a=new int[5];
for(int i=0;i<a.length;i++)
{
	a[i]=i;
}
int []b=new int[5];
for(int i=a.length-1,j=0;i>=0;i--,j++)
{
	b[j]=a[i];
}
for(int i=0;i<b.length;i++)
{
	if(i%2==1)
	System.out.println(b[i]);
	}

}
}