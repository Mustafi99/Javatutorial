package javaProgramPractice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string Line  for reversing it  ");
		String  text  =sc.nextLine();
		
		String revtext = reverseString(text);
		System.out.println(text);
		System.out.println(revtext);

	}
	static String reverseString(String text)
	
	{
		String[] words = text.split(" ");
		String revString = "";
		for(String word : words)
		{
			StringBuilder sb  =new StringBuilder(word);
			revString =revString +sb.reverse()+" ";
		
		}
	return revString;
	
}
	

}
