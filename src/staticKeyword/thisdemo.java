package staticKeyword;

public class thisdemo {
	int a=2;
	
	public void getDemo()
	{
		int a= 3;
		int b = a+this.a;
	System.out.println("The local number is: "+a);
	System.out.println("The global number is: "+this.a);
	System.out.println("The sum of the two number is: " +b);
		
	}

	public static void main(String[] args) {
		
	thisdemo ab = new thisdemo();
	ab.getDemo();

	}

}
