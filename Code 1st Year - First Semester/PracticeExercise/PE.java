public class PE
{
	public static void main(String[] args)
	{ 
		
		String ones[];
		String tens[];
		String hundreds[];
		String thousands[];
		String specialTens[];	
		String test[] = args[1].split("\\.");
		int x = Integer.parseInt(test[0]);
		String n = args[0];
		int cents = 0;
		boolean centavo;
		
		int m=0;
		m = x/1000000;
		int hundredths = 0;
		hundredths = (x/ 100000) % 10;
		int tenst = 0;
		tenst = ((x/  10000) % 100) % 10;
		int tht =0;
		tht = (((x/ 1000) % 1000) % 100) % 10;
		int h=0;
		h =  ((((x/ 100) % 10000) % 1000) % 100) % 10;
		int t=0;
		t = (((((x/ 10) % 100000) % 10000) % 1000) % 100) % 10;
		int o=0;
		o =  (((((x% 1000000) % 100000) % 10000) % 1000) % 100) % 10;
		if(test.length==1)
			centavo = false;

		else
		{
			cents = Integer.parseInt(test[1]);
			centavo = true;
		}
		int secondc = cents / 10;
		int firstc = cents % 10;
		
		ones = new String[] {"","one ","two ","three ","four ","five ","six ","seven ","eight ","nine ","ten "};
		tens = new String[] {"","","twenty ","thirty ","fourty ","fifty ","sixty ","seventy ","eighty ","ninety ",""};
		hundreds = new String [] {"", "one hundred ","two hundred ","three hundred ","four hundred ", "five hundred ","six hundred ","seven hundred ","eight hundred ","nine hundred ",""};
		thousands = new String [] {"", "thousand ", "one thousand ","two thousand ","three thousand ","four thousand ", "five thousand ","six thousand ","seven thousand ","eight thousand ","nine thousand ","ten thousand ", "eleven thousand ","twelve thousand ","thirteen thousand ","fourteen thousand ","fifteen thousand ","sixteen thousand ","seventeen thousand ","eighteen thousand ","nineteen thousand ",""};
		specialTens = new String []{"", "eleven ","twelve ","thirteen ","fourteen ","fifteen ","sixteen ","seventeen ","eighteen ","nineteen "};
		
		if (t == 1 && o >= 1 && o <= 9)
		{
			System.out.print(specialTens[o]);
		}	
	}
}