package RahulShetty_QA;

public class swapWithoutThirdvariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("Before Swapping the values of a and b are: " +a +" " +b);
		
		/*a= a+b;
		b=a-b;
		a=a-b;
		*/
		
		a=a*b;
		b=a/b;
		a=a/b;
		
		System.out.println("After Swapping the values of a and b are: " +a +" " +b);
		

	}

}
