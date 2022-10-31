package JavaCourse;

import java.util.ArrayList;

public class collectionDemo {

	public static void main(String[] args) {
		int a[] = { 1,2,2,3,3,4,4,5,7,5,7,6,6,7,7};
		// 1-1, 2-2, 3-2 , 4-2, 5-2, 6-2, 7-3
		//Emplty ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<a.length;i++) {
			//al.add(a[i]);
			if(!al.contains(a[i])) {
				al.add(a[i]);
				
			}
			
		}
		System.out.println(al);
		
	}

}
