import java.util.Scanner;

public class CarVersion2
{
	static Scanner scan = new Scanner (System.in);
	public static void main (String args[])
	{
		System.out.println ("\nWelcome to ABKD Rent a Car! To rent a car we must ask the following question.\n");
		
		System.out.print ("What is your age? ");
		int age = scan.nextInt();
		
		if (age >= 26 && age <= 45)
		{	
			System.out.print ("What type of license do you have? " + "\n\t1 for Professional, 2 for Student, and 3 for none of the above" + "\n\tAnswer: ");
			int licenseType = scan.nextInt();
			scan.nextLine();
			
			switch (licenseType)
			{
				case 1: System.out.print ("What type of car would you like to borrow? Luxury or Regular? ");
										  String typeOfCar1 = scan.nextLine();
										  System.out.print ("What is your name? ");
										  String name1 = scan.nextLine();	
										  System.out.print ("What is your driver's license number? ");
										  String driverLicenseNumber1 = scan.nextLine();	
										  System.out.print ("What is your address? ");
										  String address1 = scan.nextLine();
										  System.out.print ("How much will you desposit? ");
										  int deposit1 = scan.nextInt();
										  System.out.println ("Thank you very much for visiting ABKD rent a car " + name1 + ". You've rented a " + typeOfCar1 + ". Please come again.");
										  break;
										  
				case 2: System.out.print ("What type of car would you like to borrow? Regular ");
										  String typeOfCar2 = scan.nextLine();
										  System.out.print ("What is your name? ");
										  String name2 = scan.nextLine();	
										  System.out.print ("What is your driver's license number? ");
										  String driverLicenseNumber2 = scan.nextLine();	
										  System.out.print ("What is your address? ");
										  String address2 = scan.nextLine();
										  System.out.print ("Who is your guardian ");
										  String guardian2 = scan.nextLine();	
										  System.out.print ("How much will you desposit? ");
										  int deposit2 = scan.nextInt();
										  System.out.println ("Thank you very much for visiting ABKD rent a car " + name2 + ". You've rented a " + typeOfCar2 + ". Please come again.");
										  break;
										  
				case 3: System.out.println ("Sorry, you aren't allowed to rent a car");
								
								
			}

		}
		
		else
		{
			System.out.println ("Sorry, you aren't allowed to rent a car");
		}
	}
}