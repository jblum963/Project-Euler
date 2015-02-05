
public class Number7 {

	/**
	 * What is the 10 001st prime number?
	 */
	public static void main(String[] args) 
	{
		int count = 0;
		long number = 2;
		long finalPrime = 0;
		while (count<10001)
		{
			if(isPrime(number)==true)
			{
				finalPrime = number;
				count++;
				number++;
			}
			else
				number++;

		}
		
		System.out.println(finalPrime);
		
	}

	public static boolean isPrime(long m)
	{
		if(m==2)
			return true;
		long isPrimary=2;
		boolean isPrime=true;
		while (isPrimary<m)
		{
			if(m%isPrimary==0)
			{
				return false;
			}
			else
				isPrimary++;	
		}
		return isPrime;
	
	}
}
