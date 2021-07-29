public class DemoTurners2
{
	public static void main(String args[])
	{
		Leaf leaf = new Leaf();
		Page page = new Page();
		Pancake pancake = new Pancake();
		Wheel wheel = new Wheel();
		Fan fan = new Fan();

		leaf.turn();
		page.turn();
		pancake.turn();
		wheel.turn();
		fan.turn();
	}
}