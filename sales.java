package salescommission;

import java.util.Scanner;


public class Main {
	public static void main(String agrs[])
	{
		int []a=new int [100];
		Scanner in= new Scanner(System.in);
		
	System.out.println("Enter the no of employees:\n");
	int no= in.nextInt();
	System.out.println("ENTER GROSS SALE OF EACH EMPLOYEE ONE BY ONE...\n");
	for(int i=0;i<no;i++)
	{
			a[i]=in.nextInt();
			
			
			a[i]=200+(a[i]*9)/100;
			
		}
	
	int []c=new int[10];
	
	for(int i=0;i<no;i++)
	{
		if(a[i]<300)
		{
			c[0]++;
		}
		
		else if(a[i]<400)
		{	
			c[1]++;
		}
		
		else if(a[i]<500)
		{	
			c[2]++;
		}
		
		else if(a[i]<600)
		{	
			c[3]++;
		}
		
		else if(a[i]<700)
		{	
			c[4]++;
		}
		
		else if(a[i]<800)
		{	
			c[5]++;
		}
		
		else if(a[i]<900)
		{	
			c[6]++;
		}
		
		else if(a[i]<1000)
		{	
			c[7]++;
		}
		
		else
		{	
			c[8]++;
		}
	}
	System.out.println("-----------WEEKLY PAY-----------");
	System.out.println("RANGE IN USD:"+"\t"+"COUNT:");
	System.out.println(" 200-299  "+"\t"+c[0]);
	System.out.println(" 300-399  "+"\t"+c[1]);
	System.out.println(" 400-499  "+"\t"+c[2]);
	System.out.println(" 500-599  "+"\t"+c[3]);
	System.out.println(" 600-699  "+"\t"+c[4]);
	System.out.println(" 700-799  "+"\t"+c[5]);
	System.out.println(" 800-899  "+"\t"+c[6]);
	System.out.println(" 900-999  "+"\t"+c[7]);
	System.out.println(" 1000ABOVE"+"\t"+c[8]);
	
}

}

