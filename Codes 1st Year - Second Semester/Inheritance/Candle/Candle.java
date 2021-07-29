public class Candle
{
	String color;
	double height;
	double price = 1.50;
	
	public void setColor(String c)
	{
		color = c;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public double getPrice()
	{
		return height*price;
	}
}