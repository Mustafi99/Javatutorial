package JavaCourse;

import java.util.HashSet;
import java.util.Iterator;


public class hashSetexample {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("UK");
		hs.add("babblu");
		hs.add("ram");
		hs.add("Shaym");
		
		System.out.println(hs);
		
		hs.remove("UK");
		System.out.println(hs.size());
		System.out.println(hs.contains("India"));
		System.out.println(hs.isEmpty());
		Iterator<String> i = hs.iterator();
		
		System.out.println(i.next());
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		

	}

}
