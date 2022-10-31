package javaProgramPractice;

import java.util.Scanner;

public class FactorialofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number you want Factorial for it: ");
		int num =sc.nextInt();
		Factorial(num);
		

	}
	
	public static void Factorial(int num)
	{
		
		long Fact =1;
		for(int i=1;i<=num;i++)
		{
			Fact= Fact*i;
		}
		System.out.println("The Factorial is:  "  +Fact);	
	}

}
