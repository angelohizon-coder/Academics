public class NonRectArray
{
	public static void main(String args[])
	{
		boolean buliyan[][] = new boolean[5][];
		
		buliyan[0] = new boolean[1];
		buliyan[1] = new boolean[7];
		buliyan[2] = new boolean[6];
		buliyan[3] = new boolean[4];
		buliyan[4] = new boolean[2];

		buliyan[2][3] = true;
		
		for (int i = 0; i < buliyan.length; i++)
		{
			for (int j = 0; j < buliyan[i].length; j++)
			{
				System.out.print(buliyan[i][j] + "\t");
			}
			System.out.println();
		}
		/*
		for (boolean sda[] : buliyan)
		{
			for (boolean temp : sda)
			{
				System.out.print(temp + "\t");
			}
			System.out.println();
		}*/
	}
}
