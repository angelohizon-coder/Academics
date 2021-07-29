import java.util.InputMismatchException;
import java.util.Scanner;
public class PythagoreanAssignment
{
    public static void main(String args[])
    {
        // creates a Scanner object that can be used for data entry
        Scanner s = new Scanner(System.in);

        try {
            // Asks the user to enter the first integer value for sideOne
            System.out.println("Enter size for side #1: ");
            double sideOne = s.nextDouble();        // accepts an integer input
            if(sideOne < 0){
                throw new IllegalArgumentException();
            }

            // Asks the user to enter the second integer value for sideTwo
            System.out.println("Enter size for side #2: ");
            double sideTwo = s.nextDouble();        // accepts an integer input
            if(sideTwo < 0) {
                throw new IllegalArgumentException();
            }


            // Put your codes here
            double answer = Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo));
            System.out.println("The Hypotenuse os the triangle is: " + answer);
        }
        catch (InputMismatchException e){
            System.out.println("NumberFormatException OR an \n" +
                    "   InputMismatchException");
        }
        catch (IllegalArgumentException e){
            System.out.println("IllegalArgumentException");
        }
        // closes the Scanner object
        s.close();
    }
}