package RahulShettyDSA;

import java.util.Stack;

public class StackDS {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stack1 = new Stack<Integer>();
		Stack<Integer> stack2 = new Stack<Integer>();
		System.out.println(stack.isEmpty());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		System.out.println(stack);

		moveStack(stack,stack1);
		moveStack(stack1,stack2);
		moveStack(stack2,stack);

		System.out.println(stack);

		/*stack.pop();

		System.out.println(stack);
		int peek = stack.peek();

		System.out.println(peek);
		System.out.println(stack);
		System.out.println(stack.contains(4));

		stack.insertElementAt(55, 2);
		System.out.println(stack);
		 */

	}

	private static void moveStack(Stack<Integer> source, Stack<Integer> destination) {
		while(!source.isEmpty())
		{
			int item = source.peek();
			destination.push(item);
			source.pop();		
		}

	}

}
