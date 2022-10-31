package NaveenAutomationLabs;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter First Number: ");
		int dividend =sc.nextInt();
		
		System.out.println("Please enter Second Number: ");
		int divisor =sc.nextInt();
		
		int quotient = dividend	/divisor;
		int remainder = dividend % divisor;
		System.out.println("The quotient is : "+quotient);
		System.out.println("The remainder is:  " +remainder);
		
		
	}

}
