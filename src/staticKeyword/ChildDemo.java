package staticKeyword;

public class ChildDemo extends parentDemo {
	String name ="Mustafizur";
	
	public ChildDemo()
	{
		super();
		System.out.println("I am in Child  Constructor");
	}
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
		
	}
	public void getdata()
	
	{
		super.getdata();
		System.out.println("I am in child  Class");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo cd = new ChildDemo();
		cd.getStringdata();
		cd.getdata();

	}

}
