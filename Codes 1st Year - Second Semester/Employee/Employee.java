public class Employee
{
	private int empNum;
	private double empSal;
	
	Employee(int e, double s)
	{
		empNum = e;
		empSal = s;
	}
	
	Employee()
	{}
	
	public int getEmpNum()
	{
		return empNum;
	}
	
	public double getSalary()
	{
		return empSal;
	}
}
