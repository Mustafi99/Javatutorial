package javaProgramPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		//user is giving input for how many times Fibonacci series is required
		Scanner sc = new Scanner(System.in);
		System.out.println("how many fivbonacci series number: ");
		int num =sc.nextInt();
		
		//Calling the parameterized method 
		displayFibonacciSeries(num);
		
		sc.close();
		}
	
		static void displayFibonacciSeries(int n)
		{
		
		int x=1,y=0,z=0,count =1;
		while(count<=n) {
			System.out.print(z+ " ");
			z=x+y;
			x=y;
			y=z;
			count ++;
			
			
		}
	}

}
