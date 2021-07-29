package test;

import domain.Review;
import java.util.Scanner;

class TestReview
{
	public static void main(String args[]) 
	{	
		Scanner scan = new Scanner(System.in);
		
		int[] age = {19, 20, 18};
		String[] name = {"Juliana", "Kyle", "Julian"};
		
		/*Review p1 = new Review();
		Review p2 = new Review();
		Review p3 = new Review();
		
		p1.name = "Juliana";
		p2.name = "Kyle";
		p3.name = "Julian";
		
		p1.age = 19;
		p2.age = 20;
		p3.age = 18;
		
		p1.setName("Juliana");
		p2.setName("Kyle");
		p3.setName("Julian");
		
		p1.setAge(19);
		p2.setAge(20);
		p3.setAge(18);
		
		System.out.println(p1.getName() + " " + p1.getAge() + "\n" + p2.getName() + " " + p2.getAge() + "\n" + p3.getName() + " " + p3.getAge());*/
		
		Review person[] = new Review[3];
		
		for(int i = 0; i < person.length; i++)
		{	
			person[i] = new Review(name[i], age[i]);
		}
		
		for(int i = 0; i < person.length; i++)
		{
			System.out.println(person[i].getName() + " " + person[i].getAge());
		}
		
		scan.close();
	}
}