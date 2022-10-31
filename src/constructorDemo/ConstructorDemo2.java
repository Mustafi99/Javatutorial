package constructorDemo;

import method.teacher;

public class ConstructorDemo2 {
	
	//Constructor is special type method 
	
	public static void main(String[]args)
	{
		
	
	Teacher teacher1 = new Teacher("Mustafizur","male",109988980);
	teacher1.displayInformation();
	
	Teacher teacher2 = new Teacher("Rahaman", "Female", 100110022);
	teacher2.displayInformation();

}
	
}
