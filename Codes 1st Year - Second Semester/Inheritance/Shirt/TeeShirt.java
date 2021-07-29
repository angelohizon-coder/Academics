public class TeeShirt
{
	int orderNumber;
	String size;
	String color;
	int price;
	
	public void setOrderNumber(int oN)
	{
		orderNumber = oN;
	}
	
	public void setSize(String s)
	{
		size = s;
	}
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public void setPrice(String p)
	{
		if(p.equals("XXL") || p.equals("XXXL"))
			price = 250;
		
		else
			price = 200;
	}
	
	public int getOrderNumber()
	{
		return orderNumber;
	}
	
	public String getSize()
	{
		return size;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getPrice()
	{
		return price;
	}
}