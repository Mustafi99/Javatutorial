package NaveenAutomationLabs;

public class PowerConcept {

	public static void main(String[] args) {
		int base =2;
		int exponent = 9;
		long result =1;
		
		while(exponent!=0) {
			result *=base;
			-- exponent;
		}
		System.out.println(result +" is the Power value");
		//System.out.println(Math.pow(base, exponent));

	}

}
