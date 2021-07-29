public class TestGuildExtension extends TestGuild
{
	int level;
	
	public TestGuildExtension(String gN, String cN, int l)
	{
		super(gN, cN);
		level = l;
	}
	
	public void display()
	{
		super.display();
		System.out.println("Level: " + level + "\n");
	}
}