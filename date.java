import java.util.Scanner;


public class main {
	public static void main(String args[])
	
	{
		
		Scanner in =new Scanner(System.in);
		System.out.println("ENTER todays DAY<MONTH<YEAR:\n");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();

		
	date d=new date(a,b,c);
	d.display();
		
		
	}

}
