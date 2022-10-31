package GeeksforGeeks_Java_String;

import java.util.Scanner;

public class Vowel_Constant_count {

	public static void main(String[] args) {
		//String checkString(String s)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Input to check Vowel and Constant ");
		String s =sc.nextLine();
		{
			int v=0;
			int c=0;

			for(int i =0 ; i <s.length();i++){
				char ch = s.charAt(i);
				switch(ch){
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					v++;
					break;

				case ' ':
					break;

				default:c++;
				}
			}

			if(v>c)
				System.out.print("Yes");
			else if(c>v)
				System.out.print("No");
			else
				System.out.print("Same");

			//System.out.println();
		}
	}

}


