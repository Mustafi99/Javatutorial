package RahulShetty_QA;

public class Program1 {

	public static void main(String[] args) {
		int [] arr1 = {1,2,5,4,7,8,11,20}; 
	   arrayEvenAndOdd(arr1);	

	}

	private static void arrayEvenAndOdd(int arr[]) {
		int [] a =new int [arr.length];
		int index =0;
		int temp = 0;
		
		for(int i = 0;i<arr.length;i++) {	
		if(arr[i]%2 == 0) {
			a[index] =arr[i];
			index++;
		}
	}
		for(int i = 0;i<arr.length;i++) {	
			if(arr[i]%2 != 0) {
				a[index] =arr[i];
				index++;
			}
	}
		
		for(int i= 0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}

}
}
