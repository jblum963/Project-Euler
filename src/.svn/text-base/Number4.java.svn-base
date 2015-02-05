
public class Number4 {

	/**
	 *A palindromic number reads the same both ways.
	 * The largest palindrome made from the product of 
	 * two 2-digit numbers is 9009 = 91 × 99.

		Find the largest palindrome made from the 
		product of two 3-digit numbers

	 */
	public static void main(String[] args) 
	{
		int finalNum=0;
		int number;
		boolean done = false;
		for (int n = 999;n>99;n-- )
		{
			for (int m = 999;m>99;m-- )
			{
				number = n*m;
				String s = "" + number;
						if (s.charAt(0)==s.charAt(5) & s.charAt(1)==s.charAt(4)& 
							s.charAt(2)==s.charAt(3))
						{
							if(number>finalNum)
								finalNum = number;
						}
	
			}
		}
		System.out.println(finalNum);
	}

}
