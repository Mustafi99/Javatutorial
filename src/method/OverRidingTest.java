package method;

public class OverRidingTest extends OverRiding {
	
	String qualification;
	@Override
	void displayInformation()
	{
		
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Qualification: "+qualification);
	}

}
