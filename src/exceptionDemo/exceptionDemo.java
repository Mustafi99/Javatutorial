package exceptionDemo;

public class exceptionDemo {
	
	int a= 4;
	//3 lines-
	//try catch mechanism
	
	
	

	public void getData()
	{
		System.out.println("k");
	}
	
	public static void main(String[] args) {
		int b= 7;
		int c=0;
		
		exceptionDemo obj1 = new exceptionDemo();
		
		try
		{
			//int k=b/c;
			int arr[]=new int[5];
			System.out.println(arr[6]);
			
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("I catch the Arithmetic Exception ");
		}
		catch(IndexOutOfBoundsException ets) 
		{
			System.out.println("I catch the Index Out Of Bounds Exception ");
		}
		
		catch(Exception e)
		{
			System.out.println("I catch the exception ");
		}
		
		finally {
			System.out.println("Delete Cookies ");
			
		}
		
		
		
		
		
		

	}
	

}
