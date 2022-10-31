package method;

public class CallbyReferenceTest {

	public static void main(String[] args) {
		CallbyReference Obj = new CallbyReference();
		
		Obj.name = "Mustafizur";
		System.out.println("Name Before Calling: " +Obj.name);
		
		//passing object
		Obj.change(Obj);
		System.out.println("Name After Calling: " +Obj.name);
		
	

	}

}
