package RahulShetty_QA;

import java.util.ArrayList;

public class compareArray {

	public static void main(String[] args) {
		int []  a = {2,6,9,10};
		int [] b = {2,1,9,11};
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==b[i])
			{
				a1.add(a[i]);
			}
		}
		//Object[] a2 = a1.toArray();
		for(Object ob :a1) {
			System.out.println(ob);
			
		}
		
		//System.out.println(a2);
			
		
		
	}

}
