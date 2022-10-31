package javaProgramPractice;

public class Sawping2Numbers {

	public static void main(String[] args) {
		
		valueSawp(500,200);
		
		}
	static void valueSawp(int x,int y)
	{
		System.out.println("Before swapping the  value are "+x+ " "+y);
		//Logic-1 using Third Vaiable
		/*int temp = x;
		x=y;
		y= temp;
		*/
		
		//Logic-2 without using third variable
		
		/*x=x+y;
		y=x-y;
		x=x-y;
		*/
		
		//Logic-3 using * & /
		// here x and y value should not be zero
		/* x=x*y;
		y=x/y;
		x=x/y;*/
		
		//Logic -4 Single Statement
	
		y=x+y-(x=y);
	
		System.out.println("After swapping the value are: "+x+ " "+y);
	}

}
