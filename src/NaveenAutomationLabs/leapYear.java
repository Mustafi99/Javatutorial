package NaveenAutomationLabs;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a Number: ");
		int year =sc.nextInt();
		boolean leap = false;

		if(year%4 ==0) {
			if(year%100==0)
			{
				if(year%400==0) {
					leap=true;
				}
				else {
					leap=false;
				}
			}
			else {
				leap=true;
			}
		}
		else {
			leap=false;
		}

		if(leap) {
			System.out.println(year + " is Leap year");
		}
		else {
			System.out.println(year + " is not Leap year");
		}
	}

}
