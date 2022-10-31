package StringsProgram;

import java.util.Scanner;

public class UppercaseFirstLetter {

	public static void main(String[] args) {
		String Uppercase= "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str =sc.next();
		
		Scanner strscan =new Scanner(str);
		while(strscan.hasNext()) {
			
			String word = strscan.next();
			Uppercase += Character.toUpperCase(word.charAt(0))+ word.substring(1) + " ";
			
			
		}
		System.out.println("The origibnal Sentence : " + str);
		System.out.println("Sentence after convert: " + Uppercase.trim());
		
		

	}

}
