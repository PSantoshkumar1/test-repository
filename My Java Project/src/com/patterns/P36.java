/* pattern program for i+j<=n-1
 A B C D E
 1 2 3 4 
 F G H
 5 6
 I
 */
package com.patterns;

public class P36 {

	public static void main(String[] args) {
		int n=5;
		int k=1;
		char ch='A';
		for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
		if(i+j<=(n-1))
		{
			if(i%2==0)
			System.out.print(ch++ +" ");
			else
				System.out.print(k++ +" ");
		}
	}
		System.out.println();
	}
		}
}