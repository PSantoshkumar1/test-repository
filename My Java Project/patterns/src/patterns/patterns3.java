package patterns;

public class patterns3 {

	public static void main(String[] args) {
int n=5;
int k=1;
for(int i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i<=j)
		{
			if(k%2==0)
			System.out.print(0+" ");
		else
			System.out.print(1+" ");
	}
		else 
			System.out.print(" "+" ");
	}
	System.out.println();k++;
	}
}
	
	}
