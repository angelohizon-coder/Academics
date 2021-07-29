import java.util.Scanner;

public class MP3_11 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		
		TeeShirt tShirt = new TeeShirt();
		CustomTee cShirt = new CustomTee();
		
		System.out.print("Enter Order Number: ");
		int orderNumber = scan.nextInt();
		
		System.out.print("Enter Size: ");
		String size = scan.next();
		
		System.out.print("Enter Color: ");
		String color = scan.next();
		
		System.out.print("Enter Slogan: ");
		String slogan = scan.next();
		
		tShirt.setOrderNumber(orderNumber);
		tShirt.setSize(size);
		tShirt.setPrice(size);
		tShirt.setColor(color);
		
		cShirt.setOrderNumber(orderNumber);
		cShirt.setSize(size);
		cShirt.setPrice(size);
		cShirt.setColor(color);
		cShirt.setSlogan(slogan);
		
		System.out.println("\nOrder Number: " + tShirt.getOrderNumber() + "\nSize: " + tShirt.getSize() + "\nColor: " + 
							tShirt.getColor() + "\nPrice: " + tShirt.getPrice());
							
		System.out.println("\nOrder Number: " + cShirt.getOrderNumber() + "\nSize: " + cShirt.getSize() + "\nColor: " + 
							cShirt.getColor() + "\nPrice: " + cShirt.getPrice() + "\nSlogan: " + cShirt.getSlogan());
		
	}
}