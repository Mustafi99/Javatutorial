package javaProgramPractice;

import java.util.HashMap;
import java.util.Map;

public class duplicateStringTest {
	// Function to print all duplicate
    // characters in string using HashMap
    public static void
    countDuplicateCharacters(String str)
    {
  
        // Creating a HashMap containing char
        // as a key and occurrences as a value
        Map<Character, Integer> map
            = new HashMap<Character, Integer>();
  
        // Converting given string into
        // a char array
        char[] charArray = str.toCharArray();
  
        // Checking each character
        // of charArray
        for (char c : charArray) {
  
            if (map.containsKey(c)) {
  
                // If character is present
                // in map incrementing it's
                // count by 1
                map.put(c, map.get(c) + 1);
            }
            else {
  
                // If character is not present
                // in map putting this
                // character into map with
                // 1 as it's value.
                map.put(c, 1);
            }
        }
  
        // Traverse the HashMap, check
        // if the count of the character
        // is greater than 1 then print
        // the character and its frequency
        for (Map.Entry<Character, Integer> entry :
             map.entrySet()) {
  
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey()
                                   + " : "
                                   + entry.getValue());
            }
        }
    }
  
    // Driver Code
    public static void main(String args[])
    {
        // Given String str
        String str = "java";
  
        // Function Call
        countDuplicateCharacters(str);
    }


	//public static void main(String[] args) {
		/*String input ="abbc";
		String output = "?";
		for(int i= 0; i<input.length();i++) {
			{
				for(int j= 0; j<output.length();j++) {
					if(input.charAt(i)!=output.charAt(j)) {
						output =output + input.charAt(i);
					}
				}
			}
			
			System.out.println(output);
		}

	}*/
		
	}


