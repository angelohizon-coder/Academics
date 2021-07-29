public class Currency_Hizon
{
	public static void main(String args[])
	{
		String array[] = new String [args.length];
		for (int counter = 0 ; counter < args.length ; counter++)
		{
			array[counter] = (args[counter]);
		}

		String php = "php";
		String usd = "usd";

		String split [] = array[1].split("\\.");
		
		String currency = args[0];
		String numberOne = split[0];
		String numberTwo = split[1];
		
		String ones[] = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
		String tens[] = {"", "ten ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
		String hundreds[] = {"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", "seven hundred ", 
							 "eight hundred ", "nine hundred "};
		String thousands[] = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
		String tenthousands[] = {"", "ten ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
		String hundredthousands[] = {"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", 
									 "seven hundred ", "eight hundred ", "nine hundred "};
		String millions[] = {"", "one million "};
		
		int numberOneConverted = Integer.parseInt(numberOne);
		int numberTwoConverted = Integer.parseInt(numberTwo);
		
		if (numberOneConverted <= 1000000)
		{	
			int one = numberOneConverted%10;
			int ten = (numberOneConverted%100)/10;
			int hundred = (numberOneConverted%1000)/100;
			int thousand = (numberOneConverted%10000)/1000;
			int tenthousand = (numberOneConverted%100000)/10000;
			int hundredthousand = (numberOneConverted%1000000)/100000;
			int million = numberOneConverted/1000000;
			
			System.out.print (millions[million]);
			if (numberOneConverted >= 1000 && numberOneConverted <= 999999)
			{	
				if (tenthousand == 1 && thousand >= 1 && thousand <= 9)
				{
					switch (one)
					{
						case 1: System.out.print ("eleven ");break;
						case 2: System.out.print ("twelve ");break;
						case 3: System.out.print ("thirteen ");break;
						case 4: System.out.print ("fourteen ");break;
						case 5: System.out.print ("fifteen ");break;
						case 6: System.out.print ("sixteen ");break;
						case 7: System.out.print ("seventeen ");break;
						case 8: System.out.print ("eighteen ");break;
						case 9: System.out.print ("nineteen ");break;
					}
				}
				
				else 
				{
					System.out.print (hundredthousands[hundredthousand]);
					System.out.print (tenthousands[tenthousand]);
					System.out.print (thousands[thousand]);
				}
				
				System.out.print ("thousand ");
			}
			System.out.print (hundreds[hundred]);
			if (ten == 1 && one >= 1 && one <= 9)
			{
				switch (one)
				{
					case 1: System.out.print ("eleven ");break;
					case 2: System.out.print ("twelve ");break;
					case 3: System.out.print ("thirteen ");break;
					case 4: System.out.print ("fourteen ");break;
					case 5: System.out.print ("fifteen ");break;
					case 6: System.out.print ("sixteen ");break;
					case 7: System.out.print ("seventeen ");break;
					case 8: System.out.print ("eighteen ");break;
					case 9: System.out.print ("nineteen ");break;
				}
			}

			else
			{
				System.out.print (tens[ten]);
				int zero = one + ten + hundred + thousand + tenthousand + hundredthousand + million;
				if (zero == 0)
					System.out.print ("zero");
				else
					System.out.print (ones[one]);
			}
			
			if(php.equalsIgnoreCase(array[0]))
			{
				System.out.print("pesos ");
			}
			else if(usd.equalsIgnoreCase(array[0]))
			{
				System.out.print("dollars ");
			}
			
			System.out.print("and ");
			
			int tenths = numberOneConverted%10;
			int hundredths = (numberOneConverted%100)/10;
			
			if (hundredths == 1 && tenths >= 1 && tenths <= 9)
			{
				switch (tenths)
				{
					case 1: System.out.print ("eleven ");break;
					case 2: System.out.print ("twelve ");break;
					case 3: System.out.print ("thirteen ");break;
					case 4: System.out.print ("fourteen ");break;
					case 5: System.out.print ("fifteen ");break;
					case 6: System.out.print ("sixteen ");break;
					case 7: System.out.print ("seventeen ");break;
					case 8: System.out.print ("eighteen ");break;
					case 9: System.out.print ("nineteen ");break;
				}
			}

			else
			{
				System.out.print (tens[hundredths]);
				int zero = tenths + hundredths;
				if (zero == 0)
					System.out.print ("zero");
				else
					System.out.print (ones[tenths]);
			}
			
			System.out.print ("centavos");
		}
		
		else 
			System.out.print ("Invalid Input");
	}
}