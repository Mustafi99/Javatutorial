package javaProgramPractice;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Approach 1
		/*int a[] = {30,50,10,20,60};
		System.out.println("Array brfore sorting:"+Arrays.toString(a));
		Arrays.parallelSort(a);
		
		System.out.println("Array After sorting:"+Arrays.toString(a)); */
		
		//Approach 2
		int a[] = {30,50,10,20,60};
		System.out.println("Array brfore sorting:"+Arrays.toString(a));
		Arrays.sort(a);
		
		System.out.println("Array After sorting:"+Arrays.toString(a));
		
		
		//Approach 3
		Integer b[] = {30,50,10,20,60};
		System.out.println("Array brfore sorting:"+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		
		System.out.println("Array After sorting in Reverse Order:"+Arrays.toString(b));

	}

}
