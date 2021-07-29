package test;

import domain.Guild;

public class TestGuild
{
	public static void main (String args[])
	{
		Guild a,b,c,d;
		
		a = new Guild("Angelo", "Shiroe", "Enchanter", 93);
		b = new Guild("Log Horizon", "Naotsugu", "Guardian", 93);
		c = new Guild("Log Horizon", "Akatsuki", "Assassin", 92);
		d = new Guild("", "", "", 0);
		
		d.setMembers("William");
		d.setClasses("Archer");
		
		a.showDetails();
		b.showDetails();
		c.showDetails();
		
		System.out.println("Other Characters");
		System.out.println(d.getMembers());
		System.out.println(d.getClasses());
	}
}