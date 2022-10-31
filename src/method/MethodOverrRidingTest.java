package method;

public class MethodOverrRidingTest {

	public static void main(String[] args) {
		
		OverRidingTest obj =new OverRidingTest();
		obj.name ="Mustafizur";
		obj.age = 27;
		obj.qualification ="B.Tech";
		
		obj.displayInformation();
		
		OverRiding obj1 =new OverRiding();
		obj1.name ="Rahaman";
		obj1.age = 29;
		
		
		obj1.displayInformation();
		
		

	}

}
