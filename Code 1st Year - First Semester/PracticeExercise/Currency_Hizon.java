public class Currency_Hizon
{
	public static void main(String args[])
	{
		String array[] = new String [args.length];
		for (int counter = 0 ; counter < args.length ; counter++)
		{
			array[counter] = (args[counter]);                            //assigning the value of the string array
		}

		String split [] = array[1].split("\\.");                         //splitting the string array
		
		//variables for the seperated arrays
		String numberOne = split[0];                                     
		String numberTwo = split[1];
		
		//arraylist
		String ones[] = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
		String tens[] = {"", "ten ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
		String hundreds[] = {"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", "seven hundred ", 
							 "eight hundred ", "nine hundred "};
		String thousands[] = {"", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine "};
		String tenthousands[] = {"", "ten ", "twenty ", "thirty ", "fourty ", "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
		String hundredthousands[] = {"", "one hundred ", "two hundred ", "three hundred ", "four hundred ", "five hundred ", "six hundred ", 
									 "seven hundred ", "eight hundred ", "nine hundred "};
		String millions[] = {"", "one million "};
		
		//conversion of String array to integer
		int numberOneConverted = Integer.parseInt(numberOne);
		int numberTwoConverted = Integer.parseInt(numberTwo);
		
		if (numberOneConverted <= 1000000)
		{	
			//conversion of whole number
			int one = numberOneConverted%10;
			int ten = (numberOneConverted%100)/10;
			int hundred = (numberOneConverted%1000)/100;
			int thousand = (numberOneConverted%10000)/1000;
			int tenthousand = (numberOneConverted%100000)/10000;
			int hundredthousand = (numberOneConverted%1000000)/100000;
			int million = numberOneConverted/1000000;
			
			System.out.print (millions[million]);                                     //million
			if (numberOneConverted >= 1000 && numberOneConverted <= 999999)           //thousand to hundred thousand
			{																		
				if (tenthousand == 1 && thousand >= 1 && thousand <= 9)
				{
					System.out.print (hundredthousands[hundredthousand] + specialNumbers(thousand));
				}
				
				else 
				{
					System.out.print (hundredthousands[hundredthousand]);        
					System.out.print (tenthousands[tenthousand]);                   
					System.out.print (thousands[thousand]);
				}
				
				System.out.print ("thousand ");
			}
			
			if (ten == 1 && one >= 1 && one <= 9)                                   //hundreds and specialTens(11-19)   
			{
				System.out.print (hundreds[hundred] + specialNumbers(one));
			}

			else
			{
				int zero = one + ten + hundred + thousand + tenthousand + hundredthousand + million;        //hundreds, tens, and ones
				if (zero == 0)
					System.out.print ("zero");
				else
					System.out.print (hundreds[hundred] + tens[ten] + ones[one]);
			}
			
			//conversion of decimal numbers
			int tenths = (numberTwoConverted%100)/10;
			int hundredths = numberTwoConverted%10;     
			int zeroSecond = hundredths + tenths;
			if (zeroSecond == 0)
			{
				System.out.print ("");
				if("php".equalsIgnoreCase(array[0]))
				{
					System.out.print("pesos");                              //if tenths and hundredths both are zero then only currency will be added
				}
				else if("usd".equalsIgnoreCase(array[0]))
				{
					System.out.print("dollars");
				}
			}
			
			else
			{
				if("php".equalsIgnoreCase(array[0]))
				{
					System.out.print("pesos and ");
				}
				else if("usd".equalsIgnoreCase(array[0]))                 //if tenths or hundredths != 0 then decimal number, "and", and currency will be added
				{
					System.out.print("dollars and ");
				}
				
				if (tenths == 1 && hundredths >= 1 && hundredths <= 9)
				{
					System.out.print (specialNumbers(hundredths));       //if tenths and hundredths form numbers == 11 to 19 then method will be called
				}

				else
				{
					System.out.print (tens[tenths]);
					System.out.print (ones[hundredths]);
				}
				
				System.out.print("centavos");
			}
		}
		
		else 
			System.out.print ("Invalid Input");                         //if number exceeds one million
	}
	
	public static String specialNumbers(int x)
	{
		//tenths ranging from eleven to nineteen
		String numbers[] = {"", "eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
		String result = numbers[x];      
		return result;
	}
}