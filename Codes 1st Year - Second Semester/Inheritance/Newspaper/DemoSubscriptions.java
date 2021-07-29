import javax.swing.*;
public class DemoSubscriptions
{
	public static void main(String args[])
	{
		PhysicalNewspaperSubscription physical = new PhysicalNewspaperSubscription();
		OnlineNewspaperSubscription online = new OnlineNewspaperSubscription();

		JOptionPane.showMessageDialog(null, "Adress: " + physical.toString());
	}
}