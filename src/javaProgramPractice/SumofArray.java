package javaProgramPractice;

public class SumofArray {

	public static void main(String[] args) {
		
		//Sum of Array 
		int a[] = {5,2,7,9,6};//n= 5, n-1=4
		
		int sum =0;
		for(int i=0;i<=a.length-1;i++)
		{
			
			sum=sum+a[i];
			
		}
		
		System.out.println("Sum of Array elements: " +sum);

	}

}
