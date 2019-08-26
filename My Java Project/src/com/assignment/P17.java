/* pattern program for i<=j
 1 2 3 4 5
   6 7 8 9
   10 11 12
      13 14 
          15
 */
package com.assignment;

public class P17 {

	public static void main(String[] args) {
int n=5;
int k=1;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i<=j)
			System.out.print(k++ +" ");
		else
			System.out.print(" " +" ");
	}
	System.out.println();
	
}
	}

}