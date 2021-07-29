import java.util.Scanner;

public class Student
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		
		CollegeCourse[] Student = new CollegeCourse[5];
		
		String[] courseID = {"ICS2601", "ICS2602", "ICS2603", "ICS2604", "THY 1"};
		int[] creditHours = {3, 5, 3, 2, 3};
		char[] letterGrade = {'B', 'C', 'A', 'D', 'E'};
		
		System.out.print("Enter your Student Number: ");
		int idNum = scan.nextInt();
		
		System.out.print("Enter a number[0-4]: ");
		int num = scan.nextInt();
		
		for(int i = 0; i < Student.length; i++)
		{
			Student[i] = new CollegeCourse(courseID[i], creditHours[i], letterGrade[i]);
		}
		
		/*for(int i = 0; i < Student.length; i++)
		{
			System.out.println("Student ID-Number: " + idNum + "\n" + "Course ID: " + Student[i].getCourseId() + "\n" + "Credit Hours: " + 
				Student[i].getCreditHours() + "\n" + "Letter Grade: " + Student[i].getLetterGrade());
			System.out.println();
		}*/
		
		
		System.out.println("\nStudent ID-Number: " + idNum + "\n" + "Course ID: " + Student[num].getCourseId() + "\n" + "Credit Hours: " + 
							Student[num].getCreditHours() + "\n" + "Letter Grade: " + Student[num].getLetterGrade());
		
		scan.close();
	}
}
