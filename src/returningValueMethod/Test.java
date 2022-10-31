package returningValueMethod;

public class Test {

	public static void main(String[] args) {
		ReturnValueMethod obj = new ReturnValueMethod();
		int Result= obj.Square(5);
		System.out.println("Square of 5 is: " +Result);
		
		ReturnValueMethod obj1 = new ReturnValueMethod();
		int Results= obj1.Square(6);
		System.out.println("Square of 6 is: " +Results);
		
	}

}
