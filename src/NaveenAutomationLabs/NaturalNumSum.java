package NaveenAutomationLabs;

public class NaturalNumSum {

	public static void main(String[] args) {
		
		int n =50;
		int sum =0;
		
		//int sum = (n*(n+1))/2;
		
		for(int i=0;i<=n;i++) {
			sum = sum +i;
		}
		
		System.out.println(" The sum of the 1 to 100 is: "+ sum);
		

	}

}
