/* pattern program for i+j>=n-1
 				A  
 			  * *
 			B B B
 		  * * * *
        C C C C C
 */
package com.patterns;

public class P43{

	public static void main(String[] args) {
int n=5;
char ch='A';
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i+j>=(n-1))
		{
			if(i%2==0)
			System.out.print(ch+" ");
			else
				System.out.print("*" +" ");
		}
		else
			System.out.print(" "+" ");
	}
	if(i%2==1)ch++;
	System.out.println();
}
	
	}
}