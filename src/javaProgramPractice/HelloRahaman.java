package javaProgramPractice;

public class HelloRahaman {

	public static void main(String[] args) {
		long salary = 10000;
		int bonus1 =2000;
		int bonus2 = 1000;
		
		if(salary>10000)
		{
			salary = salary + bonus1;
			System.out.println("Your Total Salary will be: " +salary);
		}
		else {
			
			
			salary = salary + bonus2;
			System.out.println("Your Total Salary will be:" +salary);
		}
		

	}

}
