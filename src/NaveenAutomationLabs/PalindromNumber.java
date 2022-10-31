package NaveenAutomationLabs;

public class PalindromNumber {

	public static void main(String[] args) {
		int num=1218;
		int rev=0;
		int temp=num;

		while(num!=0) {
			rev =rev*10+num%10;
			num=num/10;
		}

	System.out.println(" The reverse number is : "+rev);
	if(temp==rev) {
	System.out.println(" The number is palindrom");
	}
	else {
		System.out.println(" The number is not a palindrom");
	}
}
}


