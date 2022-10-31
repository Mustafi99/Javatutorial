package NaveenAutomationLabs;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		int a = 233;
		int b = 189;
		int c = 988;
		
		if(a>b & a>c)
		{
		System.out.println("The largest Number is: "+a);
		}
		else if(b>a & b>c)
		{
		System.out.println("The largest Number is: "+b);
		}
		else if(c>a & c>b)
		{
		System.out.println("The largest Number is: "+c);
		}

	}

}
