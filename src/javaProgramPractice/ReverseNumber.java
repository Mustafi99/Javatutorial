package javaProgramPractice;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for reversing: ");
		int num =sc.nextInt();
		
		//Logic 1
		/* int rev =0;
		while(num!=0) {
		rev = rev*10+num%10;
		num = num/10;
		}
		*/
		
		//Logic- 2
		//Using String Buffer Class
		
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer rev =sb.reverse();
		
		//3rd Approach StringBuilder class
		StringBuilder sb1 = new StringBuilder();
		sb1.append(num);
		StringBuilder rev1 = sb1.reverse();
		
		
		//System.out.println("The reverse number is :" +rev);
		System.out.println("The reverse number is :" +rev1);

	}

}
