package method;

public class teacher {
	//Variable
	String name,gender;
	int phone;
	
  void setInfirmation(String n, String m,int ph) {
	  name = n;
	  gender = m;
	  phone = ph;
		
		
	}

	
	//Method
	//return type + method name()
	void displayInformation() {
		
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Phone: "+phone);
		
		System.out.println("\n \n");
	}

}



