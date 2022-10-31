package javaProgramPractice;

import java.util.Arrays;

public class CheckArrayEquals {

	public static void main(String[] args) {
		int a1[] = {5,2,7,9,6,8,3,10,23};
		int a2[] = {5,2,7,9,6,8,3,10,23};
		
		//Approach 1 : using Arrays Function

		/*boolean status =Arrays.equals(a1, a2);
	if(status==true)

	{

		System.out.println("The Arrays are Equal");
	}
	else
		System.out.println("The Arrays are not equal");

	}*/

		boolean status = true;
		if(a1.length==a2.length)
		{

			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!= a2[i])
				{
					status =false;
				}
			}


		}
		else {

			status=false;
		}

		if(status==true)
		{
			System.out.println("The Arrays are equal");

		}
		else {
			System.out.println("The Arrays are not equal");

		}

	}


}
