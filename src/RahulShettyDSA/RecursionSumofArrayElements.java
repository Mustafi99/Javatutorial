package RahulShettyDSA;

public class RecursionSumofArrayElements {
	static int arr[] = {1,2,4,5,7};

	public static void main(String[] args) {

		int value =sumofArrayElements(arr.length-1);
		System.out.println(value);
		
		int fact_value =Fact(7);
		System.out.println(fact_value);
		
		int fib_value =fibonacci(7);
		System.out.println(fib_value);
	}
		
	private static int fibonacci(int n) {
		if(n==0 || n==1) {
			return n;
		}
		
		return fibonacci(n-1) +fibonacci(n-2);
	}
	
	private static int Fact(int n) {
		if(n==1)
		{
		return 1;
		}
		return n*Fact(n-1);
		
	}
	
	
	static int sumofArrayElements(int n) {
		if(n==0)
			return arr[0];
		return arr[n]+sumofArrayElements(n-1);

	}

}
