/*pattern program for i+j<=n-1
 1 1 1 1 1
 0 0 0 0
 1 1 1
 0 0
 1
 */
package com.assignment;

public class P29{

	public static void main(String[] args) {
int n=5;
int k=1;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i+j<=(n-1))
		{
			if(k%2==0)
			System.out.print(0 +" ");
		else
			System.out.print(1 +" ");
		}
	}
	System.out.println();
	k++;
}
}
}
