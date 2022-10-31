package loops;

public class LoopDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weeks = 4;
	    int days = 7;
	    int months =12;
	    for (int k = 1; k <= months; ++k) {
	    	System.out.println("months: " + k);

	    // outer loop prints weeks
	    for (int i = 1; i <= weeks; ++i) {
	      System.out.println("Week: " + i);

	      // inner loop prints days
	      for (int j = 1; j <= days; ++j) {
	        System.out.println("  Day: " + j);
	      }
	    }

	}

}
}
