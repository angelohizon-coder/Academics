/*
One of the most famous mathematical algorithms is the Pythagorean Algorithm. 

Pythagorean Theorem states that that the sum of the squares of two sides of a
Right Triangle equals the square of the longest side, or the hypotenuse. 
Given by: a2 + b2 = c2, where a = one side, b = another side, c = longest side (hypotenuse).

Complete the given Java code where a user can input two numeric numbers: 
double a & double b by which the program will output the value of the 
longest side: double c.  For example, if a user inputs: a = 3 and b = 4, 
the program will output the value of c = 5.0.

Include Exception Handling in your code.

 - If the user enters a negative value, throw an IllegalArgumentException.

 - If the user enters a String value throw a NumberFormatException OR an 
   InputMismatchException.

Catch these exceptions and display an informative message describing the user's incorrect entry.
Put comments after each line of code explaining the purpose of each line.
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class PythagoreanAssignment
{
	public static void main(String args[])
	{
		// creates a Scanner object that can be used for data entry
		Scanner s = new Scanner(System.in);

		// Put your codes here
		// compute for Side Three, use the Pythagorean Theorem.	
		// Try to use the Math.sqrt() method to compute for the square root.
		// Example: double answer = Math.sqrt(25); 	// answer will be equal to 5.0

		// Try method that test whether the data input is matches the data type or not
		try
		{
			// Asks the user to enter the first double value for sideOne
			System.out.print("Enter size for side #1: ");
			double sideOne = s.nextDouble();		// accepts an double input

			// Asks the user to enter the second double value for sideTwo
			System.out.print("Enter size for side #2: ");
			double sideTwo = s.nextDouble();		// accepts an double input
			
			// if statement that checks if the input variable is negative
			if(sideOne < 0 || sideTwo < 0)
				throw new IllegalArgumentException();		// terminates the program if the value of the variable is negative

			// else statement that receives the variable if the value passes the preceding statement
			else
			{
				double sideA = sideOne*sideOne; 		// Sets the value of the adjacent of the pythagorean theorem
				double sideB = sideTwo*sideTwo; 		// Sets the value of the opposite of the pythagorean theorem

				double answer = Math.sqrt(sideA+sideB);		// Sets the value of the hypotenuse of the pythagorean theorem

				System.out.println("\nSide A(Adjacent): " + sideOne); 		// Prints out the adjacent of the pythagorean theorem
				System.out.println("Side B(Opposite): " + sideTwo); 		// Prints out the opposite of the pythagorean theorem
				System.out.println("Side C(Hypotenuse): " + answer); 		// Prints out the hypotenuse of the pythagorean theorem
			}
		}	

		// Catches the variable/s with incorrect data type
		catch(InputMismatchException mistakeOne)
		{
			System.out.println("Input Mismatch Exception");		// prints out the message the data type input is incorrect
		}

		// Catches the variable/s with negative input
		catch(IllegalArgumentException mistakeTwo)
		{
			System.out.println("Illegal Argument Exception");		// prints out the message the data type input is negative
		}				
		
		// closes the Scanner object
		s.close();
	}
}

