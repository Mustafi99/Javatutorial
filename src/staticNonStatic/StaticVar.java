package staticNonStatic;

public class StaticVar {


	
	String name; String address;  // Instance Variable, this variable will change object to object.
	static String City;  //Class Variable
	static int i;
	
	//Static Block
	static{
		City = "Murshidabad";
		 i=0;
		}

	
	
	StaticVar(String name, String address)//Variable under Constructor are local Variable.
	{
		this.name =name;
		this.address =address;
		i++;
	System.out.println(i);
		
	}
	public void getAddress() {
		System.out.println(address+ "  " +City);
	}
	
	public static void getcity() {
		System.out.println( "  " +City);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar obj = new StaticVar("Bob", "Ayra");
		
		StaticVar obj1 = new StaticVar("Dob", "Hingili");
		obj.getAddress();
		obj1.getAddress();
		StaticVar.getcity();
		StaticVar.i=5;
		

	}

}
