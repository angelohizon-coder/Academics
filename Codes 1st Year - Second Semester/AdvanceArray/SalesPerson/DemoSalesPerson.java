public class DemoSalesPerson
{
	public static void main (String argsp[])
	{
		SalesPerson[] SPArray = new SalesPerson[10];
		
		final int ID_NUM = 111;
		final double SALES_VALUE = 25000; 
		
		for(int i = 0; i < SPArray.length; ++i)
		{
			SPArray[i] = new SalesPerson(ID_NUM + i, (SALES_VALUE + i * 5000));
		}
		
		for(int i = 0; i < SPArray.length; ++i)
		{
			System.out.println(SPArray[i].getIdNum() + " " + SPArray[i].getSalesAmt());
		}
	}
}