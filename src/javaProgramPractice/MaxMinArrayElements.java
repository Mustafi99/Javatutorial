package javaProgramPractice;

public class MaxMinArrayElements {

	public static void main(String[] args) {
		int a[] = {50,23,90,87,122,190,83};
		int max =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		
		System.out.println("The Max number in Array elements is: "+max);
		
        int min =a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		
		System.out.println("The min number in Array elements is: "+min);
		

	}

}
