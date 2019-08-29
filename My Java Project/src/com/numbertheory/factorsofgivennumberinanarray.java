/*
 write a program to store all the factors of given number in an array number is 1515
 */
package com.numbertheory;

public class factorsofgivennumberinanarray {

	public static void main(String[] args) {
int n=1515;
int count=0;
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
int[] factors=new int[count];
		for(int i=0,j=1;i<factors.length;j++)
		{
			if(n%j==0)
			{
				factors[i]=j;
				System.out.println(factors[i++]);
			}
		}
	}

}
