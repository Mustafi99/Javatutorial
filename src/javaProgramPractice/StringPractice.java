package javaProgramPractice;

public class StringPractice {

	public static void main(String[] args) {
		// Problem 1
		String name ="My Name Khan";
		name =name.toLowerCase();
		System.out.println(name);
		
		//Problem 2
		String text ="My Name SR Khan";
		text = text.replace(" ", "_");
		System.out.println(text);
		
		//Problem 3
		String letter ="Dear <|name>|, Thanks a lot!";
		letter = letter.replace("<|name>|", "Mustak");
		System.out.println(letter);
		
		//Problem 4
		String myString ="The String  contains   double and triple spaces  ";
		System.out.println(myString.indexOf("  "));
		System.out.println(myString.indexOf("   "));
		
		//Problem 5
		String myletter ="Dear Rahaman, This Java Course nice Thanks";
		System.out.println(myletter);
		
	}

}
