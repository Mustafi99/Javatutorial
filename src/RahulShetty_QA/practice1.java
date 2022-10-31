package RahulShetty_QA;

	import java.util.HashSet;
	
	public class practice1 {
		
		
		static char repeatedelements(String str) {
			
			char [] strArray = str.toCharArray();
			HashSet<Character> hs = new HashSet<Character>();
			 for (int i=0; i<=strArray.length-1; i++) {
				 char c =strArray[i];
				 if (hs.contains(c))
		                return c;
		            else {
		                hs.add(c);
		            }
			 }	
			return '\0';	
		}
	
		public static void main(String[] args) {
			String str = "Applejuice";
	        System.out.println(repeatedelements(str));
			
	
		}
	
	}
