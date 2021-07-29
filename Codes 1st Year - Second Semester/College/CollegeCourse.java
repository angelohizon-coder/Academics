public class CollegeCourse
{
	private String courseID;
	private int creditHours;
	private char letterGrade;
	
	public CollegeCourse(String crsID, int crHours, char ltrGrade)
	{
		courseID = crsID;
		creditHours = crHours;
		letterGrade = ltrGrade;
	}
	
	public void setCourseId(String crsID)
	{
		courseID = crsID;
	}
	
	public void setCreditHours(int crHours)
	{	
		creditHours = crHours;
	}
	
	public	void setLetterGrade(char ltrGrade)
	{	
		letterGrade = ltrGrade;
	}	
	
	public String getCourseId()
	{
		return courseID;
	}	
	
	public int getCreditHours()
	{	
		return creditHours;
	}	
	
	public char getLetterGrade()
	{	
		return letterGrade;
	}
	
}