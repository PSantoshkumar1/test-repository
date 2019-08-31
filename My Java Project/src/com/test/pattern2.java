/*
   Write a pattern program (test )

 */
package com.test;

public class pattern2 {

	public static void main(String[] args) {
int n=5;
char ch='E'; char c=ch;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i+j<=(n-1))
		{
			System.out.print(ch--);
		}
	}
	c--;
	ch=c;
	System.out.println();

	
	}
	}
}
