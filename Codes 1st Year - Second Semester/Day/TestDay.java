import java.util.Scanner;

class TestDay
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scan.nextInt();
		
		System.out.print("Enter a date: ");
		String date = scan.next();
		
		Day myDay;
		myDay = new Day (number, date);
		
		myDay.setPD(number);
		myDay.setND(number);
		myDay.setPD1(number);
		myDay.setPD2(number);
		
		myDay.showDetails();
	}
}
