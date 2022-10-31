package javaProgramPractice;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		int arr[] = {50,23,90,87,122,190,83};
		int search_ele=9;
		boolean flag =false;
		for(int i=0;i<arr.length;i++)
		{
			if(search_ele==arr[i])
			{

				System.out.println("Element found at position of :  "+i);
				flag=true;
			}

		}

		if(flag==false)
		{
			System.out.println("  Element not found");

		}

	}

}
