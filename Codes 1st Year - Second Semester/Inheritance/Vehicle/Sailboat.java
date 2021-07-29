import javax.swing.*;
public class Sailboat extends Vehicle
{
	private int length;

	public Sailboat()
	{
		super("wind", 0);
		setlength();
	}

	public void setlength()
	{
		String entry;
		entry = JOptionPane.showInputDialog(null, "Enter sailboat length in feet ");
		length = Integer.parseInt(entry);
	}

	public int getLength()
	{
		return length;
	}

	public void setPrice()
	{
		String entry;
		final int MAX = 100000;
		entry = JOptionPane.showInputDialog(null, "Enter sailboat price ");
		price = Integer.parseInt(entry);
		if(price > MAX)
			price = MAX;
	}

	public String toString()
	{
		return("The " + getLength() + " foot sailboat is power by " + getPowerSource() + 
			" it has " + " wheels and costs $" + getPrice());
	}
}