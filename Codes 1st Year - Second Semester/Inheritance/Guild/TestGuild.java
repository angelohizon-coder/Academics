public class TestGuild
{
	String guildName;
	String charName;
	String className;
	
	public TestGuild(String gN, String cN)
	{
		guildName = gN;
		charName = cN;
	}
	
	public void setClass(String c)
	{
		className = c;
	}
	
	public void display()
	{
		System.out.println("Guild: " + guildName + "\nName: " + charName);
	}
}