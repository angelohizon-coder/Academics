import java.util.Scanner;
public class Mouse
{
	public static void main (String [] args)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.print ("The price of the mouse is 150 PHP. \n" + "How much will you be buying? \n" + "Input Amount: ");
		int amount = scan.nextInt();
		
		System.out.print ("How much money do you have? \n" + "Please input the quantity of bill you have at hand  \n");
		System.out.print ("1: ");
		int ones = scan.nextInt();
		ones *= 1;
		
		System.out.print ("5: ");
		int fives = scan.nextInt();
		fives *= 5;
		
		System.out.print ("10: ");
		int tens = scan.nextInt();
		tens *= 10;
		
		System.out.print ("20: ");
		int twenties = scan.nextInt();
		twenties *= 20;
		
		System.out.print ("50: ");
		int fifties = scan.nextInt();
		fifties *= 50;
		
		System.out.print ("100: ");
		int hundreds = scan.nextInt();
		hundreds *= 100;
		
		System.out.print ("200: ");
		int twohundreds = scan.nextInt();
		twohundreds *= 200;
		
		System.out.print ("500: ");
		int fivehundreds = scan.nextInt();
		fivehundreds *= 500;
		
		System.out.print ("1000: ");
		int thousands = scan.nextInt();
		thousands *= 1000;
		
		int mah = ones + fives + tens + twenties + fifties + hundreds + twohundreds + fivehundreds + thousands;
		double total = (amount * 150) + 150 * 0.12;
		double change = mah - total;
		System.out.print ("Cash at hand: " + mah + "\nTotal Price to Pay: " + total);
		
		if (total >= mah)
		{
			double mm = total - mah;
			System.out.println ("\nYou lack " + mm + " to purchase the mouse please add the missing money to continue");
			System.out.print ("Add Cash: ");
			int addcash = scan.nextInt();
			mah = addcash + mah;
			System.out.println ("\nChange: " + change);
		}
		
		else 
		{
			System.out.println ("\nChange: " + change);
		}
	}
} 