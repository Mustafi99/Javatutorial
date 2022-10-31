package NaveenAutomationLabs;

public class swapTwoNumbers {

	public static void main(String[] args) {
		int a =10;
		int b =15;
		int temp =0;
		
		System.out.println("Before swap the value of a:"+a);
		System.out.println("Before swap the value of b:"+b);
		
		/*temp = a;
		a=b;
		b= temp;
		*/
		
		/*
		a=a+b;
		b=a-b;
		a=a-b;
		*/
		
		a=a*b;
		b=a/b;	
		a=a/b;
		
		
		System.out.println("  ");
		System.out.println("After swap the value of a:"+a);
		System.out.println("After swap the value of b:"+b);
		

	}

}
