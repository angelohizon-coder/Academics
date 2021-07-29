public class SalesPerson
{
	private int counter;
	private int idNum[];
	private double salesAmount[];
	
	public SalesPerson(int idNumber, double salesAmt, int i)
	{
		setIdNum(idNumber, i);
		setSalesAmt(salesAmt, i);
	}
	
	public void setIdNum(int idNumber, int i)
	{
		idNum[i] = idNumber;
	}
	
	public void setSalesAmt(double salesAmt, int i)
	{
		salesAmount[i] = salesAmt;
	}
	
	public int getIdNum(int i)
	{
		return idNum[i];
	}
	
	public double getSalesAmt(int i)
	{
		return salesAmount[i];
	}
}