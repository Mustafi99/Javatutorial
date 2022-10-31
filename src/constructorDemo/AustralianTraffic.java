package constructorDemo;

public class AustralianTraffic implements CentralTraffic {

	public static void main(String[] args) {
		
		CentralTraffic  a = new AustralianTraffic();
		a.greenGo();
		a.redStop();
		a.flashingYellow();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("greenGo Implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("redStop Implementation");
		
	}

	@Override
	public void flashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("flashingYellow Implementation");
		
	}

}
