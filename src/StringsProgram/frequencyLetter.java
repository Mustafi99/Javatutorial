package StringsProgram;
import java.util.Scanner;
public class frequencyLetter {

	public static void main(String[] args) {
		//frequency of letter in String

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String: ");
		String str = sc.nextLine();
		int count=0,len = 0;
		do {
			try {
				char name[] =str.toCharArray();
				len=name.length;
				count =0;
				for(int j=0; j<len;j++) {
					if((name[0]==name[j])&&((name[0]>=65&&name[0]<=91 ||name[0]>=97&&name[0]<=123)))
						count ++;
				}
				if(count!=0) {
					System.out.println((name[0]+ " "+count+ " Times"));
				}
				str=str.replace(""+name[0], "");
		}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		while(len!=1);
			
		}

	}


