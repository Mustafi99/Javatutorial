package inheritenceDemo;

public class ChildEmirites extends ParentAirCraft {
	
	public static void main(String[] args)
	{
		ChildEmirites a = new ChildEmirites();
		a.colorofbody();
		a.engine();
		a.SafetyGuidelines();
	}

	@Override
	public void colorofbody() {
		System.out.println("Color of the Aircraft");
		
	}

}
