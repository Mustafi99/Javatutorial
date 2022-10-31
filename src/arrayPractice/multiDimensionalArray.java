package arrayPractice;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0th Row
		int a[][] = new int[2][3];
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=6;
		
		//1st Row
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
		
		System.out.println(a[0][0]);
		
		int[][] arr = { { 1, 2,4 }, { 3, 4,8 }, {4,6,8 }};
		  
        for (int i = 0; i < 3; i++) //row
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
  
            System.out.println();
        }
    }
}
