package loops;

public class Loop4 {

	public static void main(String[] args) {
		
/*
1	
1	2	
1	2	3	
1	2	3	4

		 */

	
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(j);
				System.out.print("\t");
			

			}

			System.out.println("");

		}
	}
}
