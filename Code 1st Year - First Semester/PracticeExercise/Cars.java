import java.util.*;
public class Cars
{
    static Scanner key = new Scanner (System.in);
    public static void main (String[] args)
		{
        String professional = "Professional";
        String student = "Student";
        String typeOfCar1 = "Luxury";
        String typeOfCar2 = "Regular";
        
        System.out.println("Welcome to ABKD Rent A Car! Kindly fill up the required information.");
        System.out.print ("Age: ");
        int age = key.nextInt();
        key.nextLine();
        
        if (age >= 26 && age <= 45)
        {
            System.out.print ("Licence type: ");
            System.out.print ("'Professional' or 'Student'");
            String type = key.nextLine();
            
            if (type.equals(professional))
            {
                System.out.println ("Your are allowed to borrow 'Luxury' and 'Regular' cars");
                
                System.out.println ("Choose your car: ");
                String car = key.nextLine();
                
                System.out.println ("Name: ");
                String name = key.nextLine();
                
                System.out.println ("Driver's License Number: ");
                int DLN = key.nextInt();
                
                System.out.println ("Home Address: ");
                String address = key.nextLine();
                
                System.out.println ("Deposit: ");
                int deposit = key.nextInt();
                
            }
            else if (type.equals(student))
            {
                System.out.println ("You are only allowed to borrow regular cars");

                System.out.println ("Name: ");
                String name2 = key.nextLine();
                
                System.out.println ("Driver's License Number: ");
                int DLN2 = key.nextInt();
                
                System.out.println ("Contact Number: ");
                int contact = key.nextInt();
                
                System.out.println ("Home Address: ");
                String address2 = key.nextLine();
                
                System.out.println ("Name of Guardian: ");
                String guardianName = key.nextLine();
                
                System.out.println ("Deposit: ");
                int deposit2 = key.nextInt();
            }
            else
            {
                 System.out.println ("Sorry, you cannot rent a car");
            }
        }
            else
            {
                 System.out.println ("Thank you for vising ABKD Rent a Car");
            }
        }
    }	