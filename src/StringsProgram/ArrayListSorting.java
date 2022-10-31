package StringsProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("Degha");
		list.add("Biara");
		list.add("Aatanpur");
		list.add("Oagardighi");
		System.out.println("Before Sorting: "+ list);
		Collections.sort(list);
		System.out.println("After Sorting: " +list);

	}

}
