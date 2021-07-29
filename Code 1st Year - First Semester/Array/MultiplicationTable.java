public class MultiplicationTable
{
	public static void main(String args[])
	{
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);

		int mTable[][] = new int[row][col];

		// use traditional for loop in generating values
		// of mTable
		for (int i = 0; i < mTable.length; i++)
		{
			for (int j = 0; j < mTable[i].length; j++)
			{
				mTable[i][j] = (i + 1) * (j + 1);
			}
		}

		// enhanced for loop in printing mTable
		for (int sda[] : mTable)
		{
			for (int prod : sda)
			{
				System.out.print(prod + "\t");
			}
			System.out.println();
		}
	}
}
