package calendarDateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yyyy");
		SimpleDateFormat sd = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		System.out.println(d.toString());

	}

}
