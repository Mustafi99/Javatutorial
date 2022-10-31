package RahulShetty_QA;

public class sortingArray {

	public static void main(String[] args) {
		int [] arr = {9,1,7,3,4,2};
		int temp;
		
		for(int i=0; i<=arr.length-1; i++) {
			
			for(int j= i+1; j<=arr.length-1;j++)
			{
				if(arr[i]>arr[j]) {
					temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				
				}
			}
		}
		
		for(int i= 0; i <=arr.length-1;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
