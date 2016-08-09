package test1;

public class Employee1 {
	
	
	protected String fname;
	protected String sname;
	protected double salary;
	
	public Employee1(String fname,String sname ,double salary){
		
		fname=null;
		sname=null;
		salary=0;
		
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
public void annualsalary()
{
	System.out.println("NAME:\t"+fname+sname+"\n"+"ANNUAL SALARY:"+salary);
}
public void bonus()
{
	double a=(salary *10/1000)+salary;
	System.out.println("NAME:\t"+fname+sname+"\n"+"ANNUAL SALARY:"+a);
	
}
}
