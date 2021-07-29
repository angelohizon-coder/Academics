import java.util.Scanner;
import java.util.Arrays;

public class StringPractice3
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter str1: ");
		String str1 = s.next();

		System.out.println("Enter str2: ");
		String str2 = s.next();

		char ch1[] = str1.toCharArray();
		char ch2[] = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		String str1sorted = new String(ch1);
		String str2sorted = new String(ch2);

		// System.out.println("str1sorted: " + str1sorted);
		// System.out.println("str2sorted: " + str2sorted);

		if(str1sorted.equalsIgnoreCase(str2sorted))
			System.out.println(str1 + " and " + str2 + " are ANAGRAMS");
		else
			System.out.println(str1 + " and " + str2 + " are NOT ANAGRAMS");
		
		s.close();
	}
}