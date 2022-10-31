package javaProgramPractice;

import java.util.Scanner;

public class seriersPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * //Print Sum of all the numbers of 1 to 10
		 * 
		 * int sum =0;
		 * 
		 * for(int i=1;i<=10;i++) { sum =sum +i; } System.out.println("The Sum is :"
		 * +sum);
		 * 
		 * }
		 */
		
		
		
		
		
		//Print Sum of all the numbers of m to n
		
		/*
		 * Scanner input = new Scanner(System.in); int sum =0; int m,n;
		 * 
		 * 
		 * System.out.println("Enter the initial No"); m =input.nextInt();
		 * 
		 * System.out.println("Enter the initial No"); n =input.nextInt();
		 * 
		 * 
		 * for(int i=m;i<=n;i++) { sum =sum +i; } System.out.println("The Sum is :"
		 * +sum);
		 * 
		 * }
		 */
	
	
	//Print Sum of all even  numbers of m to n
	
	/*Scanner input = new Scanner(System.in);
	int sum =0;
	int m,n;
	
	
	System.out.print("Enter the initial No  ");
	m =input.nextInt();
	
	System.out.print("Enter the initial No  ");
	n =input.nextInt();


	for(int i=m;i<=n;i++)
	{
		if(i%2==0)
		{
			sum =sum +i;
			System.out.print("  " +i);
		}
		
	}
	System.out.println();
	System.out.println("The Sum is :"  +sum);

}*/
	
	
	//Print Sum of all Odd  numbers of m to n
		
		Scanner input = new Scanner(System.in);
		int sum =0;
		int m,n;
		
		
		System.out.print("Enter the initial No  ");
		m =input.nextInt();
		
		System.out.print("Enter the initial No  ");
		n =input.nextInt();


		for(int i=m;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum =sum +i;
				System.out.print("  " +i);
			}
			
		}
		System.out.println();
		System.out.println("The Sum of all Odd Number is :"  +sum);
	}

}
