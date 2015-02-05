
public class Number2 {

	/**
	 * Each new term in the Fibonacci 
	 *sequence is generated by adding the previous two terms
	 *By considering the terms in the Fibonacci sequence 
	 *whose values do not exceed four million, 
	 *find the sum of the even-valued terms.
	 *
	 */
	public static void main(String[] args) 
	{
		int sum = 0;
		int firstNum = 1;
		int secondNum = 2;
		int bothNums;
		while (secondNum<=4000000)
		{
			bothNums = firstNum + secondNum;
			if ( bothNums % 2==0 )
			{
				sum=sum+bothNums;
				firstNum = secondNum;
				secondNum = bothNums;
			}
			else
			{
				firstNum = secondNum;
				secondNum = bothNums;
			}

		}
		System.out.println(sum+2);//add 2 to account for the initial second term
}

}
