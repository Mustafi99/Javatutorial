package javaProgramPractice;

import java.util.Scanner;

public class PalindromTest {

	public static void main(String[] args) {
		
		//taking string as an input to check Palindrome
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string  for palindrome Checking ");
		String  word  =sc.next();
		
		//Calling boolean method isPalindrome
		if (isPalindrome(word))
			System.out.println("\" "+word + "\" is Palindrome");
		else
			System.out.println("\" "+word + "\" is not a Palindrome");

	}
	
	static boolean isPalindrome(String word) {
		int forwardIndex =0, backwordIndex =word.length()-1;
		while(forwardIndex<=backwordIndex) {
			
			char startchar =word.charAt(forwardIndex);
			char endchar =word.charAt(backwordIndex);
			
			if(startchar!=endchar)
				return false;
			
			forwardIndex++;
			backwordIndex--;
			
			}
	return true;

}
}
