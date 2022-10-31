package hackerRank;

import java.io.IOException;
import java.util.Scanner;

public class Hr6 {

	/*Given an integer,N , print its first 10 multiples.
	 *  Each multiple N*i (where1<=i<=10 ) should be printed on a new line in the form: N x i = result.
	 *  2<= N<=20
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer:  ");
		int N = sc.nextInt();
		
		if((N >= 2 && N <= 20)){


			for(int i=1;i<=10;i++){

				System.out.println(N+" x "+i+" = "+N*i);
			}
		}
		else {
			System.out.println("The Number is out of range");
		}
		
		sc.close();

	}
}




