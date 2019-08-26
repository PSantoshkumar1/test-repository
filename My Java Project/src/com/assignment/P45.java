/* pattern program for i+j>=n-1
 		    A
 		  1 2
      	B C D 
 	  3 4 5 6
    E F G H I
 */
package com.assignment;

public class P45 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		char ch='A';
		for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
		if(i+j>=(n-1))
		{
			if(i%2==0)
			System.out.print(ch++ +" ");
			else
				System.out.print(k++ +" ");
		}
		else
			System.out.print(" "+" ");
			
	}
		System.out.println();
	}
		}
}