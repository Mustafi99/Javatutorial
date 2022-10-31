package RahulShettyDSA;

import java.util.Stack;

public class insertItemStack {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(6);
		stack.push(4);
		stack.push(1);
		stack.push(2);
		System.out.println(stack);
		//stack.insertElementAt(10, 2);
		//System.out.println(stack);
		insertInTheMiddle(2,10,stack);
		System.out.println(stack);

	}

	public static void insertInTheMiddle(int index, int value,Stack<Integer> s)
	{
		Stack<Integer> temp = new
				Stack<Integer>();
		for(int i =1; i<= s.size()-index+1; i++)
		{
			int item = s.peek();
			temp.push(item);
			s.pop();
		}
		s.push(value);
		while(!temp.empty())
		{
			int item =temp.peek();
			s.push(item);
			temp.pop();
		}
	}

}
