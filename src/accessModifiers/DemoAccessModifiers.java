package accessModifiers;

public class DemoAccessModifiers {

	public static void main(String[] args) {
			 

	}
	void abc()//Default :Access method anywhere in packages . Cannot access outside my packages.
	{
		
		System.out.println("Default Access Modifiers");
	}
	
	public void def()//Public :Access method anywhere. Can access outside my packages.
	//Private: you can not access method or variable out side the class of same package as well.
	
	{
		System.out.println("Public Access Modifiers");
		
	}
	//Protected : If you defined variable or method as Private you can access those in sub classes only(other packages) 
	protected void method()
	{
		System.out.println("Protected Access Modifiers");
	}

}
