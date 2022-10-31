package NaveenAutomationLabs;

import java.util.Scanner;

public class Multiplication_Float {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter First Number: ");
		float num1 =sc.nextFloat();
		
		System.out.println("Please enter Second Number: ");
		float num2 =sc.nextFloat();
		
		float multi = num1*num2;
		
		System.out.println("The multiplication is: "+multi);

	}

}
