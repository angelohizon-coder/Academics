public class PreferredCustomer extends Customer
{
	double discountRate;
	
	public PreferredCustomer(int id, double bal, double rate)
	{
		super(id, bal);													//constructor does not require the method name from the parent class
		discountRate = rate;
	}
	
	public void display()
	{
		super.display();												//method requires the method's name from the parent class
		System.out.println("Discount rate is " + discountRate);
	}
}