
public class Number3 {

	/**
	 * What is the largest prime factor of the number 600851475143
	 */
	public static void main(String[] args) {	
		for(long n = 1; n < 600851475143L; n++)
		{
			if(isPrime(n)==true&600851475143L%n==0)
			{
				System.out.println(n);
				
			}
		}
	}
	
	public static boolean isPrime(long m)
	{
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
