import java.util.Random;

public class WhatToDo
{
	public static void main(String args[])
	{
		Random random = new Random();
		int randomInteger = random.nextInt(7*2-5);
		
		switch(randomInteger)
		{
			case 1: System.out.println("Read manga");break;
			case 2: System.out.println("Watch anime");break;
			case 3: System.out.println("Do some coding");break;
			case 4: System.out.println("Watch youtube vids");break;
			case 5: System.out.println("Browse dank memes");break;
			case 6: System.out.println("Study");break;
			case 7: System.out.println("Do some cleaning");break;
			default: System.out.println("Sleep");
		}
	}
}