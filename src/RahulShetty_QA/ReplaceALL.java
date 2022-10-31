package RahulShetty_QA;

public class ReplaceALL {

	public static void main(String[] args) {
		String str ="This#string%contains^special*characters&";
		String str1 =str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str1);
		
	}

}
