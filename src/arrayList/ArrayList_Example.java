package arrayList;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		ArrayList<String>a=new ArrayList<String>();//declaring Array List
		a.add("Rahaman");
		a.add("Raja");
		a.add(0,"student");
		//a.remove(1);
		System.out.println(a);
		System.out.println(a.get(2));
		
		System.out.println(a.contains("Raja"));
		System.out.println(a.indexOf("Rahaman"));
		a.isEmpty();
		System.out.println(a.size());

	}

}
