package javaProgramPractice;


public class MaxMinNumber {

	public static void findMaxNumber(int a, int b, int c) {
		
		int max= 0;
		while(a>0|| b>0|| c>0)
		{
			
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println("The Maxm Number is: " +max);
		
		
	}
	
	
public static void findMinNumber(int a, int b, int c) {
		
		int min= 0;
		while(a>0 && b>0 && c>0)
		{
			
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println("The Min Number is: " +min);
		
		
	}
	
	
	
	public static void main(String[] args) {
		findMaxNumber(12,30,21);
		
		findMinNumber(12,30,21);
		

	}

}
