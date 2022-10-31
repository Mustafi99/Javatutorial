package javaProgramPractice;

import java.util.Scanner;

public class LargestNumberOutof3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int a= sc.nextInt();
		
		System.out.println("Enter Second number");
		int b= sc.nextInt();
		
		System.out.println("Enter Third number");
		int c= sc.nextInt();
		
		/*if(a>b && a>c)
		{
			
			System.out.println("A is the largest number among three and value of a is: " +a);
		}
		else if(b>a && b>c)
		{
			
			System.out.println("B is the largest number among three and value of b is: " +b);
		}
		else
		{
			System.out.println("C is the largest number among three and value of c is: " +c);
		}
		*/
		
		//Ternary Operator
		int largest = a>b?a:b; // largest of  a and b ;
		largest= c>largest?c:largest;
		
		System.out.println("The Largest Number is " +largest);
		
		

	}

}
