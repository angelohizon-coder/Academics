import java.util.Scanner;
public class SortPurchasesArray
{
   public static void main(String[] args)
   {
      Purchase[] purchases = new Purchase[5];
      int i;
      String message;
      char choice;
	  char decision;
      int number;
      double price;
      Scanner keyboard = new Scanner(System.in);
	  
      for(i = 0; i < purchases.length; ++i)
      {
         System.out.print("Enter invoice number >> ");
         number = keyboard.nextInt();
         System.out.print("Enter sale amount >> ");
         price = keyboard.nextDouble();
		 
		 Purchase temp = new Purchase();
		 
		 temp.setInvoiceNumber(number);
		 temp.setAmountOfSale(price);
		 
		 purchases[i] = temp;
		 
		 System.out.println(purchases[i].getInvoiceNumber() + " " + purchases[i].getAmountOfSale() + "\n");
      }
	  
      keyboard.nextLine();
    
	  choice = ' ';
	
      while(choice != 'Q')
      {
		System.out.print("\nSort Purchases by (I)nvoice number, or (S)ale amount? ");
		choice = keyboard.next().charAt(0);
		
		if(choice == 'I')
         {
             sortByInvoice(purchases);
             message = "\nSorted by invoice number\n"; 
             display(purchases, message);       
         }
		 
         else if(choice == 'S')
           {
              sortBySaleAmount(purchases);
              message = "\nSorted by sale amount\n";
              display(purchases, message);
           }
		   
           else
              System.out.println("Invalid choice"); 
		  
        System.out.print("Again? or Quit? ");
        choice = keyboard.next().charAt(0);
      }
   }
  
   public static void sortBySaleAmount(Purchase[] array)
   {
       int a,b;
       Purchase temp;
      
       int highSubscript = array.length - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {
             if(array[b].getAmountOfSale() > array[b + 1].getAmountOfSale())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
    }
	
    public static void sortByInvoice(Purchase[] array)
    {
       int a,b;
       Purchase temp;
      
       int highSubscript = array.length - 1;

       for(a = 0; a < highSubscript; ++a)

          for(b = 0; b < highSubscript; ++b)
          {
             if(array[b].getInvoiceNumber() > array[b + 1].getInvoiceNumber())
               {
                  temp = array[b];
                  array[b] = array[b + 1];
                  array[b + 1] = temp;
               }
          }
    }
	 
     public static void display(Purchase[] p, String msg)
     {
        System.out.println(msg);
		System.out.println("Invoice Number" + "\t" + "Amount of Sale" + "\t" + "Tax");
        for (int i = 0; i < p.length; i++)
		{
			System.out.println(p[i].getInvoiceNumber() + "\t\t" + p[i].getAmountOfSale() + "\t\t" + p[i].taxMethod());
		}
     }
}
