package RahulShetty_QA;

public class returnSumOfArrayElements {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,5};
		int sum = SumofArray(a);

		System.out.println(sum);
	}

	public static int SumofArray(int[] a) {

		int sum =0;
		for(int i =0;i<=a.length-1;i++) {

			sum =sum +a[i];
		}

		return sum;



	}
}


