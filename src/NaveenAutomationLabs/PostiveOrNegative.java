package NaveenAutomationLabs;

import java.util.Scanner;

public class PostiveOrNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number: ");
		double num = sc.nextDouble();
		
		if(num>0) {
			System.out.println("Your Number is Postive");
		}
		else if(num<0) {
			System.out.println("Your Number is Negative");
		}
		else {
			System.out.println("Your Number is Zero");
		}

	}

}
