package constructorDemo;

public class constructDemo {
	
	//Default
public  constructDemo() {
		System.out.println("I am in constructor ");
	}
//Parameterized
public  constructDemo(int a, int b) {
	System.out.println("I am in Parameterized integer constructor ");
}

public  constructDemo(String str) {
	System.out.println("I am in Parameterized string constructor ");
}
	
	public void getData() {
		
		System.out.println("I am the Method");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructDemo cd = new constructDemo();
		constructDemo c = new constructDemo(4,5);
		constructDemo d = new constructDemo("Rahul");
		
	}

}
