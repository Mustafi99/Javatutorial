package JavaCourse;

import java.util.ArrayList;

public class arrayListexample {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(5);
		a.add(8);
		a.add(11);
		a.add(99);
		//a.remove(1);
		System.out.println(a);
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Megha");
		b.add("Siara");
		b.add(0, "null");
		System.out.println(b);
		System.out.println(a.get(2));
		System.out.println(a.isEmpty());
		System.out.println(b.size())	;
				
		 
	
	}

}
