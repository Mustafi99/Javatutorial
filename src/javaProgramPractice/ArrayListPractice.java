package javaProgramPractice;
import java.util.*;

public class ArrayListPractice {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		ArrayList<Integer> myArrayList1 = new ArrayList<Integer>(5);
		
		myArrayList1.add(12);
		myArrayList1.add(10);
		myArrayList1.add(11);
		myArrayList1.add(13);
		myArrayList1.add(15);
		
		//You can Resize, add new elements
		myArrayList.add(6);//add method is using for adding elements in ArrayList
		myArrayList.add(7);
		myArrayList.add(4);
		myArrayList.add(6);
		myArrayList.add(5);
		myArrayList.addAll(myArrayList1);//You can append at end
		//myArrayList.clear();
		System.out.println(myArrayList.contains(7));
		System.out.println(myArrayList.indexOf(11));
		myArrayList.set(1, 500);
		
		for (int i = 0; i < myArrayList.size(); i++) 
		{
			
			System.out.print(myArrayList.get(i));	//get method is using for getting the index element.
			System.out.print(", ");
		}
		

	}

}
