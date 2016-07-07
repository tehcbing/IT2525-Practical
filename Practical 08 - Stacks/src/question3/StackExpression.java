package question3;

import java.util.Stack;

public class StackExpression {
	public static void main (String[] args) {
		Stack<Object> stack = new Stack<Object>();
		String input = "((15 - 5) / 2) + (30 / (3 * 5))";
		
		if (stack.empty())
			System.out.println("An empty stack is created.");
		
		for (int i = 0; i<input.length(); i++) {
			char expression = input.charAt(i);
		
		while (i != input.length()) {
			
		}
	}
}

}
