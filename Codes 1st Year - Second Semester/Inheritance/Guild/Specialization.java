public class Specialization extends Course
{
	String specialization;
	
	public Specialization(String n, String d, String c, String s)
	{
		super(n, d, c);
		specialization = s;
	}
	
	public void display()
	{
		System.out.println("Personal Information" + "\nName: " + super.name + "\nDepartment: " + super.department);
		System.out.println("Course: " + course);
		System.out.println("Specialization: " + specialization);
	}
}