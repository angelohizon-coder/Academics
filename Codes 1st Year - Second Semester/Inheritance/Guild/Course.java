public class Course extends Department
{
	String course;
	
	public Course(String n, String d, String c)
	{
		super(n, d);
		course = c;
	}
	
	public void display()
	{
		super.showDetails();	
		System.out.println("Course: " + course);
	}
}