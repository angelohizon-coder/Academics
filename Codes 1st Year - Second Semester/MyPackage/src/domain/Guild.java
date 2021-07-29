package domain;

public class Guild
{
	private String guildName;
	private String guildMembers;
	private String classes;
	private int level;
	
	public Guild(String a, String b, String c, int d)
	{
		guildName = a;
		guildMembers = b;
		classes = c;
		level = d;
	}
	
	public void setMembers(String b)
	{
		guildMembers = b;
	}
	
	public void setClasses(String c)
	{
		classes = c;
	}
	
	public String getMembers()
	{
		return guildMembers;
	}
	
	public String getClasses()
	{
		return classes;
	}
	
	public void showDetails()
	{
		System.out.println("Guild Name: "+guildName);
		System.out.println("Name: "+guildMembers);
		System.out.println("Class: "+classes);
		System.out.println("Level: "+level);
		System.out.println("");
	}
}