package NaveenAutomationLabs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number: ");
		int num =sc.nextInt();
		int fact = 1;
		for(int i =1; i<= num; i++) {
			fact = fact*i;
		}
		System.out.println("The Factorial of that number is: " +fact);
	}

}
