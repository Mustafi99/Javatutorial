package javaProgramPractice;

public class EvenOddCountArrayElements {

	public static void main(String[] args) {
    int a[] = {5,2,7,9,6,8,3,10,23};
		
		int sum =0;
		int evencount=0;
		int oddcount=0;
		for(int i=0;i<=a.length-1;i++)
		{
			
			
			if(a[i]%2==0 )
			{
				evencount++;
			}
			else if(a[i]%2 !=0)
			{
				oddcount++;
			}
			
			
			
		}
		System.out.println("The number of Even elements in Array: " +evencount);
		
		System.out.println("The number of Odd elements in Array: " +oddcount);
		

	}

}
