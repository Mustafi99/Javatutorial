package javaProgramPractice;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6,2,4,9,3,5};
	    System.out.println("Array brfore sorting:"+Arrays.toString(a));
	    int n= a.length;
	    for (int i = 0; i < n-1; i++) //Number of Passes
	    {
	    	
	    	for (int j = 0; j<n-1; j++) //Iteration in each Pass
	    	
	    	{
				if(a[j]> a[j+1])
						
						{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
						}
			}
	    	
			
		}
	    
	    System.out.println("Array after sorting:"+Arrays.toString(a));

	}

}
