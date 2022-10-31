package arrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.put(0,"Hello");
		hm.put(1, "GoodBye");
		hm.put(2, "GoodDay");
		hm.put(3, "Morning");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		Set sn =hm.entrySet();
		Iterator it = sn.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			Map.Entry mp= (Map.Entry)it.next();
			System.out.println(mp.getKey());
			
		}
		

	}

}
