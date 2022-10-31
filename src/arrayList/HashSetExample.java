package arrayList;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> ha = new HashSet<String>();
		ha.add("USA");
		ha.add("UK");
		ha.add("India");
		ha.add("UK");
		ha.add("He");
		ha.add("She");
		ha.remove("USA");
		System.out.println(ha);
		System.out.println(ha.size());
		System.out.println(ha.isEmpty());
		
		Iterator<String> i = ha.iterator();
		while(i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
		
		
		
		

	}

}
