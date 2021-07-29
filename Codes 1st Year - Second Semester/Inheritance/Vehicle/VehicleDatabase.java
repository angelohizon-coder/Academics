import javax.swing.*;
public class VehicleDatabase

{
	public static void main(String args[])
	{
		Vehicle[] vehicles = new Vehicle[5];
		int x;

		for(x = 0; x < vehicles.length; ++x)
		{
			String userEntry;
			int vehicleType;
			userEntry = JOptionPane.showInputDialog(null, "Please select the type of\n " + 
				"vehicle you want to enter: \n1 - Sailboat\n" + "2 - Bicycle");
			vehicleType = Intger.parseInt(userEntry);
			if(vehicleType == 1)
				vehicle[x] = new Sailboat();
			else
				vehicle[x] = new Bicycle();
		}

		StringBuffer

		JOptionPane.showMessageDialog(null, "Our available Vehicles include:\n" + outString');


	}
}