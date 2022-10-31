package RahulShetty_QA;

public class maxDifferenceAnyAdjacentIndexArray {

	public static void main(String[] args) {
		int [] a = {2,4,6,12,20,39};
		int diff =0;
		for(int i = 0; i<a.length-1; i++)
		{
			if(a[i+1]- a[i] > diff )
			{
			diff =a[i+1]- a[i];
			}
			
		}
		System.out.println(diff);

	}

}
