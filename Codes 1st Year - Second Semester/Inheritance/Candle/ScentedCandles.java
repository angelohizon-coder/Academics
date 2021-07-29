public class ScentedCandles extends Candle
{
	String scent;
	Double price = 2.0;
	
	public void setScent(String s)
	{
		scent = s;
	}
	
	public void setHeight(double h)
	{
		height = h;
	}
	
	public double getPrice()
	{
		return height * price;
	}
	
	public String getScent()
	{
		return scent;
	}
	
}