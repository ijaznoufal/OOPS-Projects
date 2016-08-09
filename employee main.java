package test1;

public class Main {
	public static void main(String args[])
	{
		
		Employee1 e1=new Employee1(null,null,0);
		Employee1 e2=new Employee1(null,null,0);
		e1.setFname("ram");
		e1.setSname("kumar");
		e1.setSalary(125000);
		e2.setFname("vijay");
		e2.setSname("singh");
		e2.setSalary(215000); 
		e1.annualsalary();
		e2.annualsalary();
		System.out.println("--------------------------------------\nANNUAL SALARY WITH BONUS\n--------------------------------------");
		e1.bonus();
		e2.bonus();
		
	}

}
