public class Purchase
{
	private int invoiceNumber;
	private double amountOfSale;
	private int amountOfSaleTax;
	private double tax;
	
	public void setInvoiceNumber(int i)
	{
		invoiceNumber = i;
	}
	
	public void setAmountOfSale(double a)
	{
		amountOfSale = a;
	}
	
	public int getInvoiceNumber()
	{
		return invoiceNumber;
	}
	
	public double getAmountOfSale()
	{
		return amountOfSale;
	}
	
	public double taxMethod()
	{
		tax = amountOfSale*0.05;
		
		return tax;
	}
	
	//public void showDetails()
	//{
	//	System.out.println(invoiceNumber + " " + amountOfSale + " " + tax);
	//}
}