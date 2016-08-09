package salescommission;

import java.util.Scanner;

public class Elimination {
	public static void main(String agrs[])
	{
		int []a=new int[10];
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER TEN NUMBERS ONE BY ONE...!:\n");
		
		for(int i=0;i<10;i++)
		{
			a[i]=in.nextInt();
			
		}
		System.out.println("The array that you entered:\n");
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]+"");
			
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i] == a[j])
				{
					a[i]=-1;
				}
			}
		}
	
	System.out.println("-------------The final array:-------------\n");
	for(int i=0;i<10;i++)
	{ if(a[i]!=-1)
		System.out.println(""+a[i]);
	}
	
	}
}
	
	
