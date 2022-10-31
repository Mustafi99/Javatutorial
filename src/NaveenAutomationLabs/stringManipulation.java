package NaveenAutomationLabs;

public class stringManipulation {

	public static void main(String[] args) {
		String str ="How to Print UppercaseLetters in Java";
		
		for(int i=0; i<str.length(); i++)
		{
			if (Character.isUpperCase(str.charAt(i)))
			{
				
				System.out.print(str.charAt(i));
			}
		}

	}

}
