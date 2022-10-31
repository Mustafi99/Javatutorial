package NaveenAutomationLabs;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		//a,e,i,o,u
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Character: ");
		char ch = sc.next().charAt(0);
		

		/*if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("The letter is vowel only");
		}
		else {
			System.out.println("The letter is Consonant ");
		}
		 */
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

			System.out.println("The letter is vowel only");
			break;

		default:
			System.out.println("The letter is Consonant ");

			break;
		}

	}

}
