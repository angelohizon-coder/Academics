public class Guild
{
	public static void main(String args[])
	{
		TestGuild tG = new TestGuild("Log Horizon", "Shiroe");
		TestGuildExtension tGE = new TestGuildExtension("Log Horizon", "Naofumi", 93);
		
		//tG.display();
		tGE.display();
	}
}