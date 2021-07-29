import java.util.Scanner;

public class Menu
{
	public static void main(String argsp[])
	{
		char decision;
		do
		{
			Scanner scan = new Scanner (System.in);
			double total = 0;
			
			System.out.println ("************************");
			System.out.println ("* Welcome to Jollibee! *");
			System.out.println ("************************");
			System.out.println ();
			
			System.out.println ("Menu :");
			
			System.out.println ("A. Ala Carte (Food)");
			System.out.println ("\t 1. Spaghetti - P50");
			System.out.println ("\t 2. 1 PC Chicken Joy w/ Rice - P80");
			System.out.println ("\t 3. Burger Steak - P50");
			System.out.println ("\t 4. Palabok Fiesta - P55");
			System.out.println ("\t 5. Jolly Hotdog - P45");
			System.out.println ("\t 6. Yum! Burger - P35");
			System.out.println ();
			
			System.out.println ("B. Ala Carte (Drinks)");
			System.out.println ("\t 1. Softdrinks (Regular) - P30");
			System.out.println ("\t 1. Softdrinks (Large) - P45");
			System.out.println ();
			
			System.out.println ("C. Combo Meal");
			System.out.println ("\t Any combintation of the Ala Carte Food and Drinks will give 10% discout Total");	
			System.out.println ("\n\n");	

			System.out.print ("Under what category is your order? A for Food Ala Carte, B for Drink Ala Carte or C for Value Meal. Input A, B, or C: ");
			char input = scan.next().charAt(0);
			
			switch(input)
			{
				case 'c':
				case 'C':
				case 'a': 	
				case 'A':   
							System.out.print ("Input a number (1-6): ");
							int A = scan.nextInt();
							
							switch (A)
							{
								case 1: total+=50;break;
								case 2: total+=80;break;
								case 3: total+=50;break;
								case 4: total+=55;break;
								case 5: total+=45;break;
								case 6: total+=35;break;
							}
							
							if (input == 'a')
								break;
				case 'b':	
				case 'B': System.out.print ("Input a number (1-2): ");
						  int B = scan.nextInt();
							
							switch (B)
							{
								case 1: total+=30;break;
								case 2: total+=45;break;
							}
							
							if (input == 'c')
								total = total+(total*.1);
			}
			
			System.out.println ("Input your payment: ");
			int payment = scan.nextInt();
			
			System.out.println ("Your change is: " + (payment-total));
			System.out.println ("Would you like to repeat?(Y/N): ");
			decision = scan.next().charAt(0);
			
			scan.close();
		}while (decision == 'y' || decision == 'Y');
	}
}