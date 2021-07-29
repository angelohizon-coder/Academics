/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author cha
 */
public class CharSeq 
	 {
		private static final int maxLength = 255;
		private char[]cArray = new char[maxLength+1];
		private int cLength = 0;
    
		public String toString()
		{
			String s="";
			for(int i=1;i<=cLength;i++)
				s=s+cArray[i];
				return s;
		}
		public boolean isFull()
		{
			if (cLength == maxLength)
				return true;
			else return false;
		}
		public void append(char c)
		{
			if(isFull())
                             System.out.println("charSq is Full");
			else cArray[++cLength]=c;
		}
                public boolean isEmpty()
                {   
					if(cLength == 0) 
						return true;
					else 
						return false;
				}
                
                public void remove(int pos)
                { 
				if (isEmpty()) 
					System.out.println("CharSg is Empty");
                else if (pos > cLength)
                    System.out.println("Postion is not valid");
                else for (int i = pos; i<=cLength; i++)
                        cArray[i]=cArray[i+1];
                cLength --;
                }
	 }
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   	  CharSeq ca = new CharSeq();
	  int n; 
	  int j;
      BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
	  do
	  {
	  System.out.print("Enter number of inputs: ");
	  n = Integer.parseInt(x.readLine());
	  if (n <= 5)
	  {
	   for(j=0; j<n; j++)
        {
            System.out.println("Enter Character : ");
            ca.append(x.readLine().charAt(0));
        }
        System.out.print(ca.toString());
	  }
	  else
	  {
		  System.out.print(" 1-5 inputs only\n");
		  
	  }
	  }	while (n>=6);

	  System.out.print("Enter positon to remove: ");
          n = Integer.parseInt(x.readLine());
          ca.remove(n);
          System.out.print(ca.toString());

	}
	  
     // TODO code application logic here
    }
    
}
