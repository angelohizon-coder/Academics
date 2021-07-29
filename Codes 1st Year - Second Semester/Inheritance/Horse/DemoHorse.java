public class DemoHorse
{
	public static void main(String args[])
	{
		Horse h = new Horse();
		RaceHorse rH = new RaceHorse();
		
		h.setName("Lulu");
		h.setColor("Brown");
		h.setYear(2001);
		
		rH.setName("Mimi");
		rH.setColor("Chocolate");
		rH.setYear(2000);
		rH.setRace(42);
		
		System.out.println("Hose Number 1" + "\nName" + h.getName() + "\nColor: " + h.getColor() + "\nBirth Year: " + h.getYear());
		System.out.println("\nHorse Number 2" + "\nName: " + rH.getName() + "\nColor: " + rH.getColor() + "\nBirth Year: " + rH.getYear() + 
							"\nNumber of Races: " + rH.getRace());
	}
}