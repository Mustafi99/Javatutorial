package javaProgramPractice;

public class EvenOddfromArray {

	public static void main(String[] args) {
		// Even and odd count in Array

		int a[] = {5,2,7,9,6,8,3,10,23};
		
		
		//Normal for loop



		/*System.out.println("The even number in Array are:............ ");

		for(int i=0;i<=a.length-1;i++)

		{

			if(a[i]%2==0 )
			{
				System.out.println(a[i]);
			}
		}

			System.out.println("The Odd number in Array are:......... ");


			for(int i=0;i<=a.length-1;i++)

			{

				if(a[i]%2 !=0)
				{
					System.out.println(a[i]);



				}



			}
		 */
		
		//Enhanced for Loop

		System.out.println("The even number in Array are:......... ");

		for(int value:a)
		{

			if(value%2==0 )
			{
				System.out.println(value);
			}
		}

		System.out.println("The Odd number in Array are:......... ");



		for(int value:a)
		{

			if(value%2 !=0)
			{
				System.out.println(value);





			}
		}
	}

}