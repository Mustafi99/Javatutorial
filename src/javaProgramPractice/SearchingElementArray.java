package javaProgramPractice;

public class SearchingElementArray {

	public static void main(String[] args) {
		String arr[]= {"JAVA","C","C++", "C"};
		boolean flag =false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]==arr[j])
				{
					
					System.out.println("Found Duplictae Elements:  "+arr[i]);
					flag=true;
				}
			
		}
		
		if(flag==false)
		{
			System.out.println(" Duplictae Elements not found");
			
		}
	}

}
