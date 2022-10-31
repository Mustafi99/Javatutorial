package RahulShetty_QA;

public class fibonacciSeries {

	public static void main(String[] args) {
		int a =0;
		int b = 1;
		int sum = 0;
		int i = 1;
		while(i<15)
		{
			System.out.print(" " +a);
			System.out.print(" ");
			sum=a+b;
			a=b;
			b=sum;
			
			i++;
			
			
		}
		
		

	}

}
