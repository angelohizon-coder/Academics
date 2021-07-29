import javax.swing.*;

public class PhysicalNewspaperSubscription extends NewspaperSubscription
{
	public void PhysicalNewspaperSubscription()
	{
		setAddress();
	}

	public void setAddress()
	{
		boolean result = false;
		String entry = JOptionPane.showInputDialog(null, "Enter address ");
		address = entry;

		for(int i = 0; i < address.length(); i++)
		{
			if(Character.isDigit(i))
				result = true; break;
		}

		if(result == true)
			rate = 15;

		else 
			rate = 0;
	}

	public String toString()
	{
		return("Address: " + getAddress());
	}
}