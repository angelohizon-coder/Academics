import javax.swing.*;

public class OnlineNewspaperSubscription extends NewspaperSubscription
{
	public void OnlineNewspaperSubscription()
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
			if(address.charAt(i) == '@')
				result = true; break;
		}

		if(result == true)
			rate = 15;

		else 
			rate = 0;
	}
}