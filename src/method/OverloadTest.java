package method;

public class OverloadTest {

	public static void main(String[] args) {
		

		Overload obj = new Overload();
		obj.add();
		obj.add(8.5, 5.2);
		obj.add(3, 9);
		obj.add(9, 12, 11);
	}

}
