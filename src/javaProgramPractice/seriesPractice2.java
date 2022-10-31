package javaProgramPractice;

import java.util.Scanner;

public class seriesPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1+2+3+....n
		
		/*Scanner input = new Scanner(System.in);
		int sum =0;
		int n;
		
		System.out.print("Enter the Last No  ");
		n =input.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
				sum =sum +i;
				System.out.print(" " +i);
		

	}
		System.out.println();
		System.out.print(" The Sum of 1 to n is " +sum);
	
}*/
		
		//1+3+5+7+....n
		
				/*Scanner input = new Scanner(System.in);
				int sum =0;
				int n;
				
				System.out.print("Enter the Last No  ");
				n =input.nextInt();
				
				for(int i=1;i<=n;i=i+2)
				{
					
						sum =sum +i;
						System.out.print(" " +i);
				

			}
				System.out.println();
				System.out.print(" The Sum of 1 to n is " +sum);	
	}*/
	
	//1.5+2.5+3.5+....n
	
	/*
	 * Scanner input = new Scanner(System.in); double sum =0; double n;
	 * 
	 * System.out.print("Enter the Last No  "); n =input.nextDouble();
	 * 
	 * for(double i=1.5;i<=n;i++) {
	 * 
	 * sum =sum +i; System.out.print(" " +i);
	 * 
	 * 
	 * } System.out.println(); System.out.print(" The Sum of 1 to n is " +sum);
	 * 
	 * }
	 */
	
	
	Scanner input = new Scanner(System.in);
	int sum =0;
	int n;
	
	System.out.print("Enter the Last No  ");
	n =input.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		
			sum =sum +i*i;
			System.out.print("  " +i*i);
	

}
	System.out.println();
	System.out.print(" The Sum of 1 to n is " +sum);	
}
	
}
