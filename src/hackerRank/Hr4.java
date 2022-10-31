package hackerRank;

import java.util.Scanner;

public class Hr4 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Inerger: " );
        int i = scan.nextInt();
        
        System.out.println("Enter a Double: " );
        double d = scan.nextDouble();
        String  j = scan.nextLine();
        
        System.out.println("Enter a String: " );
        String  s = scan.nextLine();

       

        
        
        System.out.println("String: " + s);
       System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        scan.close();
    }
	
}