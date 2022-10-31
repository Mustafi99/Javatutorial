package RahulShetty_QA;

public class countOfSpecialCharacters {

	public static void main(String[] args) {
		String str ="rahaman@#$%";
		int count = 0;
		String SpecialCharRemoved ="";
		for(int i =0;i<str.length();i++) {
			if(!Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))
					&& !Character.isLetter(str.charAt(i)))
					{
				count ++ ;
					}
			else {
				SpecialCharRemoved =SpecialCharRemoved + str.charAt(i) ;
			}
			
		}
		if(count==0) {
			System.out.println("There is no special Character in the String");
		}
		else {
			System.out.println("The number of special charater in String is: " +count);
		}
		System.out.println("After removing Special Charcter the String is : " +SpecialCharRemoved);
	}

}
