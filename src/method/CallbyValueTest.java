package method;

public class CallbyValueTest {

	public static void main(String[] args)
	{
		
		CallbyValue Obj = new CallbyValue();
		
		int x=10;
		System.out.println("x before call is: " +x);
		
		  
		Obj.change(x);
		System.out.println("x After call is : " +x);
		
	}
}
