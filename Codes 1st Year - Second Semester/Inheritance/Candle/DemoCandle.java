public class DemoCandle
{
	public static void main(String argsp[])
	{
		Candle c = new Candle();
		ScentedCandles sC = new ScentedCandles();
		
		c.setColor("Blue");
		c.setHeight(5);
		
		sC.setColor("Indigo");
		sC.setHeight(5);
		sC.setScent("Orange");
		
		System.out.println("Color: " + c.getColor() + "\nPrice: " + c.getPrice() + "\nHeight: " + c.getHeight());
		
		System.out.println("Color: " + sC.getColor() + "\nPrice: " + sC.getPrice() + "\nHeight: " + sC.getHeight() + "\nScent: " + sC.getScent());
	}
}