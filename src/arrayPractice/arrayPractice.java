package arrayPractice;

public class arrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a[]= {5,6,7,8,9};//Memory Dynamically Allocate
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}*/

		int Arr[] ={2,3,4,5,6,8,9,7};
		int evencount =0;
		int oddcount =0;
		for(int i=0;i<=Arr.length-1; i++)
		{
			if(Arr[i]%2==0)
			{
				evencount++;
				
			}
			

			else if(Arr[i]%2!=0)
			

				{
					oddcount++;
					
				}
				
				
             

		}
		
		System.out.println("The No of even elements is: " +evencount);
		System.out.println("The No of odd elements is: " +oddcount);
	}
}
