package RahulShetty_QA;

public class multiplicationTableWithoutMultiplyOperator {

	public static void main(String[] args) {
		int result = multiply(5,10);
		System.out.println(result);

	}

	public static int multiply(int i, int j) {
		int k= 1;
		int sum =0;
		
		while(k<=j){
			sum = sum + i;
			k++;
			
		}
		return sum;
		
		
	}

}
