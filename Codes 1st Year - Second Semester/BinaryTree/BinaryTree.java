import java.util.Scanner;

public class BinaryTree 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);

        BT bt = new BT();
        BTNode root = null;

        int conversion;
        char ch;
        char[] arrayChar = {'A' ,'S' ,'D' ,'F' ,'G' ,'H' ,'J' ,'K' ,'L' ,'Z' ,'X' ,'C' ,'V' ,'B' ,'N' ,'M'};
        for(int i=0; i<arrayChar.length; i++)
        {
            conversion = arrayChar[i];
            bt.insert(conversion);
        }
        
        System.out.println("Binary Tree Test\n");                 
        do    
        {
            System.out.println("Main Menu");
            System.out.println("A. Root");
            System.out.println("B. Parent");
            System.out.println("C. Children");
            System.out.println("D. isInternal");
            System.out.println("E. isExternal");
            System.out.println("F. isRoot");
            System.out.println("G. Exit");

            System.out.print("\nEnter a Letter: ");
            char choice = scan.next().charAt(0);

            if(choice == 'G')
              break;

            switch(choice)
            {
                case 'a':;
                case 'A':
                    BTNode rootNode = bt.getRootNode(root);
                    int a = rootNode.data;
                    System.out.println("The value of the root is  " + String.valueOf((char)(a)));
                    break;
                case 'b':;
                case 'B':
                    break;
            }
        
            System.out.print("Do you want to continue (Type y or n): ");
            ch = scan.next().charAt(0);                        
        } while (ch == 'Y'|| ch == 'y');          

        scan.close();
    }
}