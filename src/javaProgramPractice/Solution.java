package javaProgramPractice;

import java.util.*;

public class Solution {

	/*Given an integer, , perform the following conditional actions:

		If  is odd, print Weird
		If  is even and in the inclusive range of  to , print Not Weird
		If  is even and in the inclusive range of  to , print Weird
		If  is even and greater than , print Not Weird
		Complete the stub code provided in your editor to print whether or not  is weird.
		*/
	
	
	
    public static void main(String[] args) {
        
       
         
    	Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Enter a Inerger: " );
        int N = scanner.nextInt();
        
        if(N % 2 == 0 )
        {            
            if((N >= 2 && N <= 5) || N > 20)
            {
                System.out.println("Not Weird");
            }
            else
            {
                System.out.println("Weird");
            }    
        }
        else
        {
            System.out.println("Weird");
        }
        
        
        
       scanner.close();       
 
}
    
}
    