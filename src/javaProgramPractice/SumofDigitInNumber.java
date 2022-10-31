package javaProgramPractice;

public class SumofDigitInNumber {

	public static void main(String[] args) {
		
		int num =143245;
		int sum =0;
		while(num>0) {
			sum =sum +num%10;
			num =num/10;
		}
		
		System.out.println("The Sum of the digits are: " +sum);
			
			

	}

}
